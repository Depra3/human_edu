window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let cloneButton = section.querySelector("#clone-button");
    let inputButton = section.querySelector("#input-button");
    let templeteButton = section.querySelector("#templete-button");
    let noticeList = section.querySelector(".notice-list");
    let tbodyNode = section.querySelector("tbody");
    // tbody 태그명으로 찾음

    let notices = [{"id":5, "title":"가입인사2", "contents":"안녕하세요1","writer":"강*준"},
                   {"id":6, "title":"가입인사3", "contents":"안녕하세요2","writer":"강*혁"}];

    cloneButton.onclick = function(){
        let trNode = noticeList.querySelector("tbody tr");
        // tbody 태그의 자손 중에 tr 태그인 것을 선택.
        let cloneNode = trNode.cloneNode(true);
        // cloneNode 메서드는 복제하는 기능을 수행함.
        // true : 하위 모든 것을 복제하는 것을 의미함.
        // false : 해당하는 node만 복제함.(위의 경우는 <tr> 태그만 복제)
        console.log(trNode);
        console.log(cloneNode);
        tbodyNode.appendChild(cloneNode);
    };

    inputButton.onclick = function(){
        let trNode = noticeList.querySelector("tbody tr");
        let cloneNode = trNode.cloneNode(true);
        tbodyNode.appendChild(cloneNode);
        let tdsNode = cloneNode.querySelectorAll("td");
        tdsNode[0].textContent = notices[0].id;
        tdsNode[1].textContent = notices[0].title;
        tdsNode[2].textContent = notices[0].contents;
        tdsNode[3].textContent = notices[0].writer;
    };
});