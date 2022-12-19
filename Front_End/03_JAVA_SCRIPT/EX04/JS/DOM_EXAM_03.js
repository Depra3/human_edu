window.addEventListener("load",function(){
    let section = document.getElementById("section1");
    let srcInput = section.querySelector("#scr-input");
    // let imgList = section.querySelector("#img-list"); 없어도 되는 코드
    let changeButton = section.querySelector("#change-button");
    let img = section.querySelector(".img");
    console.log(img);

    changeButton.onclick = function(){
        // img.src = srcInput.value;
        img.src = "IMGS/" + srcInput.value + ".jpg";
        
    }
});