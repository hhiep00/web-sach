const $=document.querySelector.bind(document);
const $$=document.querySelectorAll.bind(document);

const dangnhap=$(".btn.btn_dn");
const email=$("#email");
const ps=$("#password");

// dsinput.forEach((giatri,sott) => {
//     giatri.onblur=function(){
//         console.log(this.id);
//     }
// });


dangnhap.onclick=function(){
    ktemail();
    ktpassword();
}   

function ktemail(){
    var kte=email.parentElement.querySelector('.form-message');
    if(email.value==''){
        kte.innerHTML="Email không được để trống";
    }
    else{
        kte.innerHTML=null;
        return 1;
    }
}

function ktpassword(){
    var ktp=ps.parentElement.querySelector('.form-message');
    if(ps.value==''){
        ktp.innerHTML="Mật khẩu không được để trống";
    }
    else{
        ktp.innerHTML=null;
        return 1;
    }
}
