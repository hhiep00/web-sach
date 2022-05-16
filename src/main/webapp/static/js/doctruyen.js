var nutTheoDoi = document.querySelector(".nut-theo-doi")
var nutboTheoDoi = document.querySelector(".bo-theo-doi")

function theoDoi(){
    nutTheoDoi.style.display = "none";
    nutboTheoDoi.style.display = "block";
}

function boTheoDoi(){
    nutTheoDoi.style.display = "block";
    nutboTheoDoi.style.display = "none";
}