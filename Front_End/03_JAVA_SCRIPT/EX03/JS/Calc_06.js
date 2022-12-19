window.addEventListener("load",function(){
    let btn = this.document.querySelector("#add");
    btn.onclick = function(){
        let section = document.querySelector("#section1");
        let inputX = section.querySelector("input[name='txt1']");
        let inputY = section.querySelector("input[name='txt2']");

        let x, y;
        x = parseInt(inputX.value);
        y = parseInt(inputY.value);

        sum.value = x + y;
    }
});