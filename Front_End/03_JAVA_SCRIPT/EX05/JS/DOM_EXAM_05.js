window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let titleInput = section.querySelector(".title-input");
    let addButton = section.querySelector("#add-button");
    let delButton = section.querySelector("#del-button");
    let menuList = section.querySelector(".menu-list");

    addButton.onclick = function(){
        let txtNode = document.createTextNode(titleInput.value);
        // text 박스에 사용자가 입력한 값을 Node로써 생성함.
        menuList.appendChild(txtNode);
        // 생성된 Node를 자식으로써 menulist에 등록함.
    }
    
    delButton.onclick = function(){
        let txtNode = menuList.childNodes[0];
        // menuList 중 첫번째 노드(자식)를 txtNode에 등록 
        menuList.removeChild(txtNode);
        // menuList에서 등록된 첫번째 자식을 자식으로써의 링크를 삭제함.
        // menuList에서 txtNode에 등록된 해당 노드를 찾아 삭제함.
    }
});