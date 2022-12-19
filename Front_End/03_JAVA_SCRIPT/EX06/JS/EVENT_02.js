window.addEventListener("load",function(){
    let section = this.document.querySelector("#section1");
    let imgs = section.querySelectorAll(".imgs");
    let curImgs = section.querySelector("#current-imgs");

    // imgs[0].onclick = function(e){
    //     // e는 이벤트를 담고 있는 객체.
    //     // console.log(e);
    //     // console.log(e.target.src);
    //     // e.target : 마우스 이벤트가 발생한 위치의 객체.
    //     // e.target.src : 객체가 가지고 있는 위치의 주소.

    //     curImgs.src = e.target.src;
    // };

    // imgs[1].onclick = function(e){
    //     curImgs.src = e.target.src;
    // };

    // imgs[2].onclick = function(e){
    //     curImgs.src = e.target.src;
    // };
    for(let i = 0; i < imgs.length; i++){
        imgs[i].onclick = function(e){
            curImgs.src = e.target.src;
        };
    }
});