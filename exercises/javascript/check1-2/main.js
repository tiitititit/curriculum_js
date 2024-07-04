document.addEventListener('DOMContentLoaded', function() {
    // addTodoBtnの要素を取得してください。
let btn = document.getElementById('addTodoBtn');
    // 追加ボタンが押下されたときのイベントを追加してください
    addTodoBtn.addEventListener('click', function() {

    let btns = document.createElement('ul');
    // その関数の中で以下の処理を追加してください
    //      処理1、inputが空になっていたら、alert()処理をして処理を終わらせてください。
      //            メッセージは"ToDoを入力してください"を出力してください 
        let inPut = document.getElementById('todoInput');
        if (todoInput == "") {
            alert("ToDoを入力してください");
    
        }
    //      処理2、todoItem内に入力された文字が追加されるようにしてください
    inPut.value += "\n";
    
    
});