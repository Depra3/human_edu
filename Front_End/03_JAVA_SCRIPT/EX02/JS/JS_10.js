window.onload = function(){
    let btn = window.document.getElementById("btnInput");
    btn.onclick = function (){
        let x,y;
        x = eval(prompt("x값 입력", 0));
        y = eval(prompt("y값 입력", 0));

        btnInput.value = x+y;
        btnInput.type = "text";
    };
    btn.onmouseover = function(){
        // Mouse Over시 동작할 수 있는 함수 정의 가능
        window.alert("안녕하세요.");
    };
};