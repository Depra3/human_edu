window.addEventListener("load",function(){
    let section = document.getElementById("section1");
    // let srcInput = section.querySelector("#scr-input"); 없어도 됨.
    let imgSelect = section.querySelector(".img-select");
    let changeButton = section.querySelector("#change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function(){
        // img.src = srcInput.value;
        img.src = "IMGS/" + imgSelect.value + ".jpg";
        
    }
});