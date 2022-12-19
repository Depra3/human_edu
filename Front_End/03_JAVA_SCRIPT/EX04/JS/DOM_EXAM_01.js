window.addEventListener("load",function(){
    let section = document.getElementById("section1");
    let srcInput = section.querySelector("#scr-input");
    let changeButton = section.querySelector("#change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function(){
        // img.src = srcInput.value;
        // img.src = "IMGS/" + srcInput.value + ".jpg";
        img.src = "IMGS/img" + srcInput.value + ".jpg";
        
    }
});