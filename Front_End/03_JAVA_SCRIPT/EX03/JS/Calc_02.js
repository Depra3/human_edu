window.addEventListener("load",function(){
    let btn = this.document.getElementById("add");
    btn.onclick = function(){
        let section = document.getElementById("section1");
        let inputs = section.getElementsByTagName("input");
        console.log(inputs);
        console.log(inputs[0]);

        let x,y;
        x = parseInt(inputs[0].value);
        y = parseInt(inputs[1].value);

        // sum.value = x + y;
        inputs[3].value = x + y;
        // sum.value = inputs[3].value
    }
});