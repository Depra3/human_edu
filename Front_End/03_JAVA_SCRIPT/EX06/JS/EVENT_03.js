window.addEventListener("load",function(){
    let section = this.document.querySelector("#section1");
    let imgs = section.querySelectorAll(".imgs");
    let curImgs = section.querySelector("#current-imgs");
    let imgList = section.querySelector("#img-list");

    imgList.onclick = function(e){
        // 버블링 효과로 인해서 하위 객체에서 발생한 event를
        // 상위 객체에서 확인 가능
        console.log(e);
        if (e.target.tagName == 'IMG') {
            curImgs.src = e.target.src;
        }
    }
});