/**
 * recipeForm 추가 버튼을 누르면 추가하는 기능
 */

let tr = document.querySelector('#seq_num');
let btnAdd = document.querySelector('.btnAdd');
let seqContainer = document.querySelector('.seqContainer');
let input = document.getElementsByTagName('')
let clone;
function addTr() {
    clone = tr.cloneNode();
    seqContainer.appendChild(clone)
}

btnAdd.addEventListener('click', () => {
    addTr();
    clone.value = '';
})

let recipeTime = document.querySelector('#recipe_time');
if (typeof (recipeTime.value) != Number) {
    ecipeTime.value = '';
}

