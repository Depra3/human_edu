$(function(){
    // var $firstmenu = $('nav>ul>li');
    var $firstmenu = $('.nav-item');
        $header = $('header');
    $firstmenu.mouseenter(function(){
        $header.stop().animate({height:'260px'},200);
    })
    .mouseleave(function(){
        $header.stop().animate({height:'90px'},200);
    })
});

// 슬라이드 리스트 내용 선택
const slideList = document.querySelector(".slide_list");
const slideContents = document.querySelectorAll(".slide_content"); // 전체 선택
const slideBox = document.querySelector(".slide_box");
// 버튼 엘리먼트 선택
const nextBtn = document.querySelector(".slide_next_button");
const prevBtn = document.querySelector(".slide_prev_button");
// 슬라이드 최대 길이
const slideLen = slideContents.length;
console.log(slideLen);
// 페이지네이션 생성
const pagination = document.querySelector(".slide_pagination");

const slideWidth = 400; // 슬라이드 가로 길이

// 복제
let firstChild = slideList.firstElementChild;
let lastChild = slideList.lastElementChild;
let clonedFirst = firstChild.cloneNode(true);
let clonedLast = lastChild.cloneNode(true);
// 복제한 것 넣기
// 맨 뒤에 1번 추가
slideList.appendChild(clonedFirst);
// 맨 앞에 마지막 추가
slideList.insertBefore(clonedLast, slideList.firstElementChild);
// console.log(slideList);

// 페이지네이션 dot 생성 및 active 설정
for (let i = 0; i < slideLen; i++) {
  if(i == 0 ){
    pagination.innerHTML += "<li class='active'>•</li>";
  }else{
    pagination.innerHTML += "<li>•</li>";
  }
}
// 페이지네이션 전체 선택
const paginationItems = document.querySelectorAll(".slide_pagination>li");

// 슬라이드 가로 나열
slideList.style.width = slideWidth * (slideLen + 2) + "px";
// slideList.style.left = -slideWidth + 'px';
const startNum = 0;
// slideList.style.transform = "translate(-" + (slideWidth * (startNum + 1)) + "px, 0px)";
slideList.style.transform = "translate(-" + slideWidth + "px, 0px)";
let curIndex = startNum;
let curSlide = slideContents[curIndex];

function nextMove(){
  curIndex+=1;
  console.log(curIndex);
  if (curIndex < slideLen) {
    slideList.style.transform = "translate(-" + (slideWidth * (curIndex + 1)) + "px, 0px)";
    paginationItems.forEach((i)=> i.classList.remove("active"));
    paginationItems[curIndex].classList.add("active");
  } else {
    // (curIndex === slideLen)
    curIndex = 0;
    slideList.style.transform = "translate(-" + (slideWidth * (curIndex + 1)) + "px, 0px)";
    // curIndex++;
    setTimeout(function() {
      slideList.style.transform = "translate(-" + slideWidth + "px, 0px)";
    }, 0);
    paginationItems.forEach((i)=> i.classList.remove("active"));
    paginationItems[curIndex].classList.add("active");
  }
}

function prevMove(){
  curIndex-=1;
  if (condition) {
    
  }
  console.log(curIndex);
  if (curIndex < 0) {
    curIndex = 0;
  }else if (curIndex > 0) {
    
    slideList.style.transform = "translate(-" + (slideWidth * curIndex) + "px, 0px)";
    paginationItems.forEach((i)=> i.classList.remove("active"));
    paginationItems[curIndex-1].classList.add("active");
  } else {
  // if (curIndex === 0) {
    
    slideList.style.transform = "translate(-" + (slideWidth * curIndex) + "px, 0px)";
    setTimeout(function() {
      slideList.style.transform = "translate(-" + (slideWidth * curIndex) + "px, 0px)";
    }, 0);
    curIndex = slideLen;
    paginationItems.forEach((i)=> i.classList.remove("active"));
    paginationItems[curIndex-1].classList.add("active");
  }
}

let loopInterval = setInterval(() => {
  // nextMove();
  prevMove();
}, 300);

// 슬라이드에 마우스가 올라간 경우 루프 멈추기
slideBox.addEventListener("mouseover", () => {
  clearInterval(loopInterval);
});

// 슬라이드에서 마우스가 나온 경우 루프 재시작하기
slideBox.addEventListener("mouseout", () => {
  loopInterval = setInterval(() => {
    // nextMove();
    prevMove();
  }, 500);
});

nextBtn.addEventListener("click",()=>{
  nextMove();
});

prevBtn.addEventListener("click",()=>{
  prevMove();
});

// 각 페이지네이션 클릭 시 해당 슬라이드로 이동하기
for (let i = 0; i < slideLen; i++) {
  // 각 페이지네이션마다 클릭 이벤트 추가하기
  paginationItems[i].addEventListener("click",() =>{
    // 클릭한 페이지네이션에 따라 현재 슬라이드 변경해주기(currSlide는 시작 위치가 1이기 때문에 + 1)
    curSlide = i + 1;
    // 슬라이드를 이동시키기 위한 offset 계산
    const offset = slideWidth * curSlide;
    // 각 슬라이드 아이템의 left에 offset 적용
    slideContents.forEach((i)=>{
      i.setAttribute("style", `left: ${-offset}px`);
    });
    // 슬라이드 이동 시 현재 활성화된 pagination 변경
    paginationItems.forEach((i)=>i.classList.remove("active"));
    paginationItems[curSlide - 1].classList.add("active");
  });
}

