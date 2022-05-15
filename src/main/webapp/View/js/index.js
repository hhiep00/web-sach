let searchBtn = document.querySelector('#nut-tim-kiem-an');
let searchBar= document.querySelector('#div-thanh-tim-kiem-an');
let memu= document.querySelector('#menu-lua-chon');
let navBar= document.querySelector('#lua-chon');
window.onscroll = () =>{
    // searchBtn.classList.remove('fa-times');
    searchBar.classList.remove('active');
    navBar.classList.remove('active');
}
searchBtn.addEventListener('click', () =>{
    // searchBtn.classList.toggle('fa-times');
    searchBar.classList.toggle('active');

});
memu.addEventListener('click', () =>{

    navBar.classList.toggle('active')

});