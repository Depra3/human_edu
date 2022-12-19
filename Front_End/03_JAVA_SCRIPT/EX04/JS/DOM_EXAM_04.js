window.addEventListener("load",function(){
    let section = document.getElementById("section1");
    let srcInput = section.querySelector("#scr-input");
    // let imgList = section.querySelector("#img-list"); 없어도 됨.
    let changeButton = section.querySelector("#change-button");
    let img = section.querySelector(".img");
    let colorInput = section.querySelector("#color-input");
    console.log(img);

    changeButton.onclick = function(){
        // img.src = srcInput.value;
        img.src = "IMGS/" + srcInput.value + ".jpg";
        img.style['border-color'] = colorInput.value;
        console.log(img.style);
        console.log(img.style['border-color']);
    }
});