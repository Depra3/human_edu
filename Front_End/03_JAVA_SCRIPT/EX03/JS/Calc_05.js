window.addEventListener("load",function(){
    let btn = this.document.querySelector("#add");
    btn.onclick = function(){
        let section = document.querySelector("#section1");
        let inputs = section.querySelectorAll(".txt");
        
        console.log(inputs);

        let x, y;
        x = parseInt(inputs[0].value);
        y = parseInt(inputs[1].value);

        sum.value = x + y;

    }
});