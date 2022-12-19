window.addEventListener("load",function(){
    let btn = this.document.querySelector("#add"); // 범용
    btn.onclick = function(){
        let box = document.getElementById("box");  // 지정
        console.log(box.children)

        let inputX = box.children[0];
        let inputY = box.children[1];

        let x,y;
        x = parseInt(inputX.value);
        y = parseInt(inputY.value);

        box.children[3].value = x + y;
        // sum.value = x + y;
    }
});