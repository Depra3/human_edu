window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let delBtn = section.querySelector("#del-button");
    let swapBtn = section.querySelector("#swap-button");
    let noticeList = section.querySelector(".notice-list");
    let tbodyNode = section.querySelector("tbody");
    let allCheck = section.querySelector(".overall-check");
    
    allCheck.onchange = function(){
        let inputs = tbodyNode.querySelectorAll("input[type = 'checkbox']");
        // input 태그 중 type = 'checkbox'인 것만 가지고 옴.
        console.log(inputs);
        console.log(allCheck.checked);
        // checkbox의 checked의 값은 true/false의 boolean값을 갖게 되는데,
        // true(선택된 상태), false(선택되지 않은 상태)
        for(let i = 0; i < inputs.length; i++){
            inputs[i].checked = allCheck.checked;
            // tbody에 있는 체크박스의 값을 thead에 있는 체크박스의 값으로 대입
        }
    };

    delBtn.onclick = function(){
        let inputs = tbodyNode.querySelectorAll("input[type = 'checkbox']:checked");
        // input 태그 중 (type = 'checkbox' AND check가 되어있는 것) 가지고 옴.
        console.log(inputs);
        for(let i = 0; i < inputs.length; i++){
            inputs[i].parentElement.parentElement.remove();
            // checkbox에 선택된 input 태그의 부모(td)의 부모(tr)의 태그를 삭제함.
        }
    };

    swapBtn.onclick = function(){
        let inputs = tbodyNode.querySelectorAll("input[type = 'checkbox']:checked");
        if (inputs.length != 2) {
            alert("2개만 선택해주세요.");
            return;
        }
        let trs = [];
        for(let i = 0; i < 2; i++){
            trs.push(inputs[i].parentElement.parentElement);
            // console.log(inputs[i].parentElement.parentElement);
        }
        let cloneNode = trs[0].cloneNode(true);
        // trs의 첫번째 것을 하위까지 포함하여 모두 복사.
        console.log(cloneNode);
        trs[1].replaceWith(cloneNode);
        trs[0].replaceWith(trs[1]);
    };
});