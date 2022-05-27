<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/body.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/footer.css">
    <title>Document</title>
</head>

<body >
    <section class="header">
        <div class="logo">
            <a href="home.html"></a>
        </div>
        <div class="div-tim-kiem">
            <input type="text" placeholder="Maria Ozawa" class="thanh-tim-kiem">
            <button class="nut-tim-kiem"><i class="fa-solid fa-magnifying-glass"></i></button>
        </div>
        <div class="div-nut-tim-kiem-an" >
        
        <button class="nut-tim-kiem-res" id="nut-tim-kiem-an"><i class="fa-solid fa-magnifying-glass"></i></button>
    
    </div>
    
        <div class="truycap">
            <a href="Dang_Nhap.html" class="nut-dang-nhap">Đăng Nhập</a>
            <a href="Dang_Ky.html" class="nut-dang-ki">Đăng kí</a>
        </div>
    </section>
    <div class="div-thanh-tim-kiem-an" id="div-thanh-tim-kiem-an">
        <form action="">
            <input type="text" class="thanh-tim-kiem-an">
            
            <button class="nut-tim-kiem"><i class="fa-solid fa-magnifying-glass"></i></button>
    </form>
   </div>
  
    <section class="menu">
        <div  id="menu-lua-chon"><i class="fa-solid fa-bars"></i></div>
        <nav class="lua-chon" id="lua-chon" >
            <div class="chua">
            <div class="ten-lua-chon"> <a href="">Trang chủ</a></div>
            <div class="ten-lua-chon" id="the-loai"> 

                <a>Thể loại <i class="fa-solid fa-angle-down"></i></a>
                <div class="the-loai">
                    <div>
                        <li><a href=""> Kiếm hiệp</a></li>
                        <li><a href="">Tâm lý</a></li>
                        <li><a href="">Lãng mạn</a></li>
                        <li><a href="">NTR</a></li>
                    </div>
                    <div>
                         <li><a href="">Cổ trang </a></li>
                         <li><a href="">Tiểu thuyết</a></li>
                         <li><a href="">Comic</a></li>
                         <li><a href="">Ngôn tình</a></li>
                    </div>
                    <div>
                         <li><a href="">Oneshot</a></li>
                         <li><a href="">Hài kịch</a></li>
                         <li><a href="">Xuyên không</a></li>
                         <li><a href="">Khoa học-viễn tưởng </a></li>
                    </div>
                
            </div>
            </div>
            <div class="ten-lua-chon" id="sap-xep"> 
                    <a >Sắp xếp <i class="fa-solid fa-angle-down"></i></a>
                   <div class="sap-xep">
                    <div>
                        <li><a href="">Top ngày</a></li>
                        <li><a href="">Top tuần</a></li>
                        
                   </div>
                   <div>
                        <li><a href="">Top tháng</a></li>
                        <li><a href="">Yêu thích </a></li>
                   </div>
                   <div>
                    <li><a href="">Mới update</a></li>
                    <li><a href="">Ngày đăng </a></li>
               </div>
                </div>
            </div>
            <div class="ten-lua-chon"><a href="">Con Gái</a></div>
            <div class="ten-lua-chon"><a href="">Con Trai</a></div>
            <div class="ten-lua-chon"> <a href="">Tìm truyện</a></div>
            <div class="ten-lua-chon"><a href="">Lịch sử</a></div>
            <div class="ten-lua-chon" > <a href="">Theo dõi</a> </div>
            <div class="ten-lua-chon" > <a href="">Thảo luận</a></div>
            <div class="ten-lua-chon"> <a href="">Fanpage</a></div>
        </div>
        </nav>

    </section>
    <div class="noi-dung">
        <div class="can-giua">
            <div class="noi-dung-chinh">


                <div class="show-sach">
                    <h2>Sách mới cập nhật</h2>
                    <div class="danh-sach-sach">
                <ul class="chua-sach" id="list_new">
                <li>
                    <div class="anh_sach">
                    <a href="motatruyen.html"><img class="center" src="http://i.truyenvua.com/ebook/190x247/om-khan-tieu-ma-giap-cua-toi_1644148715.jpg?r=r8645456" alt="Ôm Khẩn Tiểu Mã Giáp Của Tôi" style=""></a>

                    <div class="thongtin_sach">
                        <div class="ten_sach qtip" data-qtip="#truyen-tranh-12139">
                            <h3><a title="Ôm Khẩn Tiểu Mã Giáp Của Tôi" href="motatruyen.html">Ôm Khẩn Tiểu Mã Giáp Của Tôi</a></h3>
                        </div>

                        <div class="trang_cuoi">
                                                    <a href="motatruyen.html-chap-66.html" title="Chapter 66">Chapter 66</a>
                                            </div>
                    </div>
                </li>
                <li>
                    <div class="anh_sach">
                    <a href="motatruyen.html"><img class="center" src="http://i.truyenvua.com/ebook/190x247/om-khan-tieu-ma-giap-cua-toi_1644148715.jpg?r=r8645456" alt="Ôm Khẩn Tiểu Mã Giáp Của Tôi" style=""></a>

                    <div class="thongtin_sach">
                        <div class="ten_sach qtip" data-qtip="#truyen-tranh-12139">
                            <h3><a title="Ôm Khẩn Tiểu Mã Giáp Của Tôi" href="motatruyen.html">Ôm Khẩn Tiểu Mã Giáp Của Tôi</a></h3>
                        </div>

                        <div class="trang_cuoi">
                                                    <a href="motatruyen.html-chap-66.html" title="Chapter 66">Chapter 66</a>
                                            </div>
                    </div>
                </li>
                <li>
                    <div class="anh_sach">
                    <a href="motatruyen.html"><img class="center" src="http://i.truyenvua.com/ebook/190x247/om-khan-tieu-ma-giap-cua-toi_1644148715.jpg?r=r8645456" alt="Ôm Khẩn Tiểu Mã Giáp Của Tôi" style=""></a>

                    <div class="thongtin_sach">
                        <div class="ten_sach qtip" data-qtip="#truyen-tranh-12139">
                            <h3><a title="Ôm Khẩn Tiểu Mã Giáp Của Tôi" href="motatruyen.html">Ôm Khẩn Tiểu Mã Giáp Của Tôi</a></h3>
                        </div>

                        <div class="trang_cuoi">
                                                    <a href="motatruyen.html-chap-66.html" title="Chapter 66">Chapter 66</a>
                                            </div>
                    </div>
                </li>
                <li>
                    <div class="anh_sach">
                    <a href="motatruyen.html"><img class="center" src="http://i.truyenvua.com/ebook/190x247/om-khan-tieu-ma-giap-cua-toi_1644148715.jpg?r=r8645456" alt="Ôm Khẩn Tiểu Mã Giáp Của Tôi" style=""></a>

                    <div class="thongtin_sach">
                        <div class="ten_sach qtip" data-qtip="#truyen-tranh-12139">
                            <h3><a title="Ôm Khẩn Tiểu Mã Giáp Của Tôi" href="motatruyen.html">Ôm Khẩn Tiểu Mã Giáp Của Tôi</a></h3>
                        </div>

                        <div class="trang_cuoi">
                                                    <a href="motatruyen.html-chap-66.html" title="Chapter 66">Chapter 66</a>
                                            </div>
                    </div>
                </li>
                <li>
                    <div class="anh_sach">
                    <a href="motatruyen.html"><img class="center" src="http://i.truyenvua.com/ebook/190x247/om-khan-tieu-ma-giap-cua-toi_1644148715.jpg?r=r8645456" alt="Ôm Khẩn Tiểu Mã Giáp Của Tôi" style=""></a>

                    <div class="thongtin_sach">
                        <div class="ten_sach qtip" data-qtip="#truyen-tranh-12139">
                            <h3><a title="Ôm Khẩn Tiểu Mã Giáp Của Tôi" href="motatruyen.html">Ôm Khẩn Tiểu Mã Giáp Của Tôi</a></h3>
                        </div>

                        <div class="trang_cuoi">
                                                    <a href="motatruyen.html-chap-66.html" title="Chapter 66">Chapter 66</a>
                                            </div>
                    </div>
                </li>
                <li>
                    <div class="anh_sach">
                    <a href="motatruyen.html"><img class="center" src="http://i.truyenvua.com/ebook/190x247/om-khan-tieu-ma-giap-cua-toi_1644148715.jpg?r=r8645456" alt="Ôm Khẩn Tiểu Mã Giáp Của Tôi" style=""></a>

                    <div class="thongtin_sach">
                        <div class="ten_sach qtip" data-qtip="#truyen-tranh-12139">
                            <h3><a title="Ôm Khẩn Tiểu Mã Giáp Của Tôi" href="motatruyen.html">Ôm Khẩn Tiểu Mã Giáp Của Tôi</a></h3>
                        </div>

                        <div class="trang_cuoi">
                                                    <a href="motatruyen.html-chap-66.html" title="Chapter 66">Chapter 66</a>
                                            </div>
                    </div>
                </li>
                </ul>

                    </div>
                </div>
            </div>

        </div>
    </div>


    <!-- Footer -->
    <footer class="footer">
        <div class="can-giua">
            <div class="trai">
                <p class="logo" itemscope="" itemtype="http://schema.org/Organization">
                    <a itemprop="url" href="/">
                    <img itemprop="logo" src="http://st.truyenqqpro.com/template/frontend/images/logo.png" alt="TruyenQQ - Truyện tranh Online">
                    </a>
                </p>
                <p class="link">Email: ad.truyenqq@gmail.com</p>
            </div>
            <div class="phai">
                <ul>
                    <li><a href="/the-loai/chuyen-sinh-91.html">Chuyển Sinh</a></li>
                    <li><a href="/the-loai/manhwa-49.html">Manhwa</a></li>
                    <li><a href="/the-loai/manhua-35.html">Hanhua</a></li>
                    <li><a href="/the-loai/dam-my-93.html">Đam Mỹ</a></li>
                    <li><a href="/the-loai/romance-36.html">Romance</a></li>
                    <li><a href="/the-loai/ngon-tinh-87.html">Ngôn Tình</a></li>
                    <li><a href="/the-loai/co-dai-90.html">Cổ Đại</a></li>
                    <li><a href="/the-loai/xuyen-khong-88.html">Xuyên Không</a></li>
                    <li><a href="/the-loai/fantasy-30.html">Fantasy</a></li>
                    <div class="clear"></div>
                </ul>
                <p>Mọi thông tin và hình ảnh trên website đều được sưu tầm trên Internet. Chúng tôi không sở hữu hay chịu trách nhiệm bất kỳ thông tin nào trên web này. Nếu làm ảnh hưởng đến cá nhân hay tổ chức nào, khi được yêu cầu, chúng tôi sẽ xem xét và gỡ bỏ ngay lập tức.</p>
            </div>
        
        </div>
    </footer>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/index.js"></script>
    
</body>
</html>