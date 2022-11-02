<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>계산기</title>
<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    body{
        height: 100vh;
        background: linear-gradient(90deg, #6B52C1 0%, #fff 100%);
    }
    .calculator-grid{
        display: grid;
        justify-content: center;
        align-content: center;
        min-height: 100vh;
        grid-template-columns: repeat(4, 100px);
        grid-template-rows: minmax(120px, auto) repeat(5, 100px);
    }
    .calculator-grid > button{
        cursor: pointer;
        font-size: 2rem;
        border: 1px solid white;
        outline: none;
        background-color: rgba(255,255,255,.75);
    }
    .calculator-grid > button:hover{
        background-color: rgba(255,255,255,.8);
    }
    .span-two{
        grid-column: span 2;
    }
    .output{
        display: flex;
        grid-column: 1/-1;
        background-color: rgba(0,0,0,.75);
        align-items: flex-end;
        justify-content: space-around;
        flex-direction: column;
        padding: 10px;
    }
    .output .previous-operand{
        color: rgba(255, 255, 255, .75);
        font-size: 1.5rem;
    }
    .output .result-operand{
        color: #fff;
        font-size: 2.5rem;
    }
</style>
</head>
<body>
    <div class="calculator-grid">
        <div class="output">
            <div class="previous-operand" data-previous></div>
            <div class="result-operand" data-result></div>
        </div>
        <button class="span-two" data-all-clear>AC</button>
        <button data-delete>DEL</button>
        <button data-operand>%</button>
        <button data-number>1</button>
        <button data-number>2</button>
        <button data-number>3</button>
        <button data-operand>x</button>
        <button data-number>4</button>
        <button data-number>5</button>
        <button data-number>6</button>
        <button data-operand>+</button>
        <button data-number>7</button>
        <button data-number>8</button>
        <button data-number>9</button>
        <button data-operand>-</button>
        <button data-number>.</button>
        <button data-number>0</button>
        <button class="span-two" data-equals>=</button>
    </div>

    <script src="/js/calcul.js"></script>
</body>
</html>