window.addEventListener("load",function(){
    let btnAdd = window.document.getElementById("add");
    // add 버튼과 연결
    btnAdd.onclick = function(){
        let x,y;
        x = parseInt(document.getElementById("txt1").value);
        y = parseInt(document.getElementById("txt2").value);
        // y = eval(document.getElementById("txt2").value); 도 가능
        sum.value = x + y;
    };
});