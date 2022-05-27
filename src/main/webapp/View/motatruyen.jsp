<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/motatruyen.css">
    <title>Document</title>
</head>
<body>
    <!-- Header -->
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
            <a href="Dang_Ky.html" class="nut-dang-nhap">ÄÄng Nháº­p</a>
            <a href="Dang_Nhap.html" class="nut-dang-ki">ÄÄng kÃ­</a>
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
            <div class="ten-lua-chon"> <a href="">Trang chá»§</a></div>
            <div class="ten-lua-chon" id="the-loai"> 

                <a>Thá» loáº¡i <i class="fa-solid fa-angle-down"></i></a>
                <div class="the-loai">
                    <div>
                        <li><a href=""> Kiáº¿m hiá»p</a></li>
                        <li><a href="">TÃ¢m lÃ½</a></li>
                        <li><a href="">LÃ£ng máº¡n</a></li>
                        <li><a href="">NTR</a></li>
                    </div>
                    <div>
                         <li><a href="">Cá» trang </a></li>
                         <li><a href="">Tiá»u thuyáº¿t</a></li>
                         <li><a href="">Comic</a></li>
                         <li><a href="">NgÃ´n tÃ¬nh</a></li>
                    </div>
                    <div>
                         <li><a href="">Oneshot</a></li>
                         <li><a href="">HÃ i ká»ch</a></li>
                         <li><a href="">XuyÃªn khÃ´ng</a></li>
                         <li><a href="">Khoa há»c-viá»n tÆ°á»ng </a></li>
                    </div>
                
            </div>
            </div>
            <div class="ten-lua-chon" id="sap-xep"> 
                    <a >Sáº¯p xáº¿p <i class="fa-solid fa-angle-down"></i></a>
                   <div class="sap-xep">
                    <div>
                        <li><a href="">Top ngÃ y</a></li>
                        <li><a href="">Top tuáº§n</a></li>
                        
                   </div>
                   <div>
                        <li><a href="">Top thÃ¡ng</a></li>
                        <li><a href="">YÃªu thÃ­ch </a></li>
                   </div>
                   <div>
                    <li><a href="">Má»i update</a></li>
                    <li><a href="">NgÃ y ÄÄng </a></li>
               </div>
                </div>
            </div>
            <div class="ten-lua-chon"><a href="">Con GÃ¡i</a></div>
            <div class="ten-lua-chon"><a href="">Con Trai</a></div>
            <div class="ten-lua-chon"> <a href="">TÃ¬m truyá»n</a></div>
            <div class="ten-lua-chon"><a href="">Lá»ch sá»­</a></div>
            <div class="ten-lua-chon" > <a href="">Theo dÃµi</a> </div>
            <div class="ten-lua-chon" > <a href="">Tháº£o luáº­n</a></div>
            <div class="ten-lua-chon"> <a href="">Fanpage</a></div>
        </div>
        </nav>

    </section>

    <!-- Content -->
    <section class="phan-than-trang">
        <div class="noi-dung-than-trang">
            <div class="thanh-chuyen-chuong">
                <ul class="tap-lien-ket">
                    <li><a href="#" class="lien-ket">trang chá»§</a></li>
                    <li><a href="#" class="lien-ket">tuyá»t tháº¿ vÃµ cÃ´ng</a></li>
                </ul>
            </div>

            <div class="mo-ta-truyen">
                <img src="/img/anhtruyen.jpg" alt="" class="anh-truyen">
                <div class="thuoc-tinh-mo-ta">
                    <p class="ten-truyen">TÃ´i Viáº¿t SÃ¡ch Äá» ThÄng Cáº¥p</p>
                    <ul class="thong-so-truyen">
                        <li>
                            <span class="ten-thuoc-tinh"><i class="fa-solid fa-user"></i>TÃ¡c giáº£</span>
                            <span class="gia-tri">Äang cáº­p nháº­t</span>
                        </li>
                        <li>
                            <span class="ten-thuoc-tinh"><i class="fa-solid fa-rss"></i>TÃ¬nh tráº¡ng</span>
                            <span class="gia-tri">Äang cáº­p nháº­t</span>
                        </li>
                        <li>
                            <span class="ten-thuoc-tinh"><i class="fa-solid fa-thumbs-up"></i>LÆ°á»£t thÃ­ch</span>
                            <span class="gia-tri">1048</span>
                        </li>
                        <li>
                            <span class="ten-thuoc-tinh"><i class="fa-solid fa-heart"></i>LÆ°á»£t theo dÃµi</span>
                            <span class="gia-tri">4766</span>
                        </li>
                        <li>
                            <span class="ten-thuoc-tinh"><i class="fa-solid fa-eye"></i>LÆ°á»£t xem</span>
                            <span class="gia-tri">1316086</span>
                        </li>
                    </ul>
                    <ul class="the-loai-truyen">
                        <li><a href="">HÃ nh Äá»ng</a></li>
                        <li><a href="">Há»c ÄÆ°á»ng</a></li>
                        <li><a href="">Manhwa</a></li>
                        <li><a href="">Truyá»n mÃ u</a></li>
                    </ul>
                    <div class="nut-tuong-tac">
                        <a href="doctruyen.html" class="btn mau-8bc34a">
                            <i class="fa-solid fa-book"></i>
                            <span class="ten-nut">Äá»c tá»« Äáº§u</span>
                        </a>
                        <div onclick="theoDoi()" class="btn mau-ff3860 nut-theo-doi">
                            <i class="fa-solid fa-heart"></i>
                            <span class="ten-nut">Theo dÃµi</span>
                        </div>
                        <div onclick="boTheoDoi()" class="btn mau-ff3860 bo-theo-doi">
                            <i class="fa-solid fa-xmark"></i>
                            <span class="ten-nut">Bá» theo dÃµi</span>
                        </div>
                        <div class="btn mau-bd10e0">
                            <i class="fa-solid fa-thumbs-up"></i>
                            <span class="ten-nut">YÃªu thÃ­ch</span>
                        </div>
                        <a href="doctruyen.html" class="btn mau-209cee">
                            <i class="fa-solid fa-location-arrow"></i>
                            <span class="ten-nut">Äá»c tiáº¿p</span>
                        </a>
                    </div>
                </div>
            </div>

            <div class="gioi-thieu">
                <span class="tieu-de"><i class="fa-solid fa-circle-info"></i>Giá»i thiá»u</span>
                <p class="noi-dung-gt">Truyá»n tranh TÃ´i Viáº¿t SÃ¡ch Äá» ThÄng Cáº¥p ÄÆ°á»£c cáº­p nháº­t nhanh vÃ  
                    Äáº§y Äá»§ nháº¥t táº¡i TruyenQQ. Báº¡n Äá»c Äá»«ng quÃªn Äá» láº¡i bÃ¬nh luáº­n vÃ  chia sáº», á»§ng há»
                     TruyenQQ ra cÃ¡c chÆ°Æ¡ng má»i nháº¥t cá»§a truyá»n TÃ´i Viáº¿t SÃ¡ch Äá» ThÄng Cáº¥p.</p>
            </div>

            <div class="danh-sach-chuong">
                <span class="tieu-de"><i class="fa-solid fa-database"></i>Danh sÃ¡ch chÆ°Æ¡ng</span>
                <ul class="chuong">
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                    <li>
                        <a href="" class="so-chuong">ChÆ°Æ¡ng 1</a>
                        <span class="ngay-dang-tai">30/03/2022</span>
                    </li>
                </ul>
            </div>

            <div class="khung-binh-luan">
                <span class="tieu-de">
                    <i class="fa-solid fa-comments"></i>
                    BÃ¬nh luáº­n
                    (<span class="tong-binh-luan">71</span>)
                </span>
                <textarea cols="30" rows="5" class="nhap-binh-luan" placeholder="Ná»i dung bÃ¬nh luáº­n"></textarea>
                <div class="binh-luan">
                    <div class="anh-dai-dien">
                        <img src="http://avatar.truyenvua.com/160x160/avatar_1646860975.jpg?r=r8645456" alt="">
                    </div>

                    <div class="tai-khoan-binh-luan">
                        <div class="tai-khoan">Nam Nam</div>
                        <div class="noi-dung-binh-luan">
                            NÃ³i chung ÄÃ¢y chá» lÃ  1 tiá»u giá»i,linh khÃ­ thÃ¬ cÅ©ng cháº¯c Ã­t.Giong máº¥y bá» cao thá»§ á» ÄÃ´ thá» thÃ´i. 
                            HÃ³a Cáº£nh mÃ  chá» phÃ³ng vs tá»¥ ná»i lá»±c,cÃ²n cÃ³ 1 Ã´ng giÃ  cÃ³ nguyÃªn tháº§n cháº¯c lÃ  NguyÃªn Anh :vv 
                            TÃ´ng sÆ° thÃ¬ nhiá»u =))) nhÆ°ng tÃ´ng this tÃ´ng that
                        </div>
                        <div class="thanh-tuong-tac">
                            <span class="thich">
                                <i class="fa-solid fa-thumbs-up"></i>
                                <span class="luong-like">2</span>
                            </span>
                            <span class="tra-loi">
                                <i class="fa-solid fa-comment"></i>
                                Tráº£ lá»i
                            </span>
                            <span class="thoi-gian-dang">1 ngÃ y trÆ°á»c</span>
                        </div>
                    </div>

                </div>
                <div class="binh-luan">
                    <div class="anh-dai-dien">
                        <img src="http://avatar.truyenvua.com/160x160/avatar_1646860975.jpg?r=r8645456" alt="">
                    </div>

                    <div class="tai-khoan-binh-luan">
                        <div class="tai-khoan">Nam Nam</div>
                        <div class="noi-dung-binh-luan">
                            NÃ³i chung ÄÃ¢y chá» lÃ  1 tiá»u giá»i,linh khÃ­ thÃ¬ cÅ©ng cháº¯c Ã­t.Giong máº¥y bá» cao thá»§ á» ÄÃ´ thá» thÃ´i. 
                            HÃ³a Cáº£nh mÃ  chá» phÃ³ng vs tá»¥ ná»i lá»±c,cÃ²n cÃ³ 1 Ã´ng giÃ  cÃ³ nguyÃªn tháº§n cháº¯c lÃ  NguyÃªn Anh :vv 
                            TÃ´ng sÆ° thÃ¬ nhiá»u =))) nhÆ°ng tÃ´ng this tÃ´ng that
                        </div>
                        <div class="thanh-tuong-tac">
                            <span class="thich">
                                <i class="fa-solid fa-thumbs-up"></i>
                                <span class="luong-like">2</span>
                            </span>
                            <span class="tra-loi">
                                <i class="fa-solid fa-comment"></i>
                                Tráº£ lá»i
                            </span>
                            <span class="thoi-gian-dang">1 ngÃ y trÆ°á»c</span>
                        </div>
                    </div>

                </div>
                <div class="binh-luan">
                    <div class="anh-dai-dien">
                        <img src="http://avatar.truyenvua.com/160x160/avatar_1646860975.jpg?r=r8645456" alt="">
                    </div>

                    <div class="tai-khoan-binh-luan">
                        <div class="tai-khoan">Nam Nam</div>
                        <div class="noi-dung-binh-luan">
                            NÃ³i chung ÄÃ¢y chá» lÃ  1 tiá»u giá»i,linh khÃ­ thÃ¬ cÅ©ng cháº¯c Ã­t.Giong máº¥y bá» cao thá»§ á» ÄÃ´ thá» thÃ´i. 
                            HÃ³a Cáº£nh mÃ  chá» phÃ³ng vs tá»¥ ná»i lá»±c,cÃ²n cÃ³ 1 Ã´ng giÃ  cÃ³ nguyÃªn tháº§n cháº¯c lÃ  NguyÃªn Anh :vv 
                            TÃ´ng sÆ° thÃ¬ nhiá»u =))) nhÆ°ng tÃ´ng this tÃ´ng that
                        </div>
                        <div class="thanh-tuong-tac">
                            <span class="thich">
                                <i class="fa-solid fa-thumbs-up"></i>
                                <span class="luong-like">2</span>
                            </span>
                            <span class="tra-loi">
                                <i class="fa-solid fa-comment"></i>
                                Tráº£ lá»i
                            </span>
                            <span class="thoi-gian-dang">1 ngÃ y trÆ°á»c</span>
                        </div>
                    </div>

                </div>
                <div class="thanh-phan-trang">
                    <p class="so-trang"><i class="fa-solid fa-angle-left"></i></p>
                    <p class="so-trang duoc-chon">1</p>
                    <p class="so-trang">2</p>
                    <p class="so-trang">3</p>
                    <p class="so-trang">4</p>
                    <p class="so-trang">5</p>
                    <p class="so-trang"><i class="fa-solid fa-angle-right"></i></p>
                </div>
            </div>
        </div>
    </section>
    
    <!-- Footer -->
    <footer class="footer">
        <div class="can-giua">
            <div class="trai">
                <p class="logo" itemscope="" itemtype="http://schema.org/Organization">
                    <a itemprop="url" href="/">
                    <img itemprop="logo" src="http://st.truyenqqpro.com/template/frontend/images/logo.png" alt="TruyenQQ - Truyá»n tranh Online">
                    </a>
                </p>
                <p class="link">Email: ad.truyenqq@gmail.com</p>
            </div>
            <div class="phai">
                <ul>
                    <li><a href="/the-loai/chuyen-sinh-91.html">Chuyá»n Sinh</a></li>
                    <li><a href="/the-loai/manhwa-49.html">Manhwa</a></li>
                    <li><a href="/the-loai/manhua-35.html">Hanhua</a></li>
                    <li><a href="/the-loai/dam-my-93.html">Äam Má»¹</a></li>
                    <li><a href="/the-loai/romance-36.html">Romance</a></li>
                    <li><a href="/the-loai/ngon-tinh-87.html">NgÃ´n TÃ¬nh</a></li>
                    <li><a href="/the-loai/co-dai-90.html">Cá» Äáº¡i</a></li>
                    <li><a href="/the-loai/xuyen-khong-88.html">XuyÃªn KhÃ´ng</a></li>
                    <li><a href="/the-loai/fantasy-30.html">Fantasy</a></li>
                    <div class="clear"></div>
                </ul>
                <p>Má»i thÃ´ng tin vÃ  hÃ¬nh áº£nh trÃªn website Äá»u ÄÆ°á»£c sÆ°u táº§m trÃªn Internet. ChÃºng tÃ´i khÃ´ng sá» há»¯u hay chá»u trÃ¡ch nhiá»m báº¥t ká»³ thÃ´ng tin nÃ o trÃªn web nÃ y. Náº¿u lÃ m áº£nh hÆ°á»ng Äáº¿n cÃ¡ nhÃ¢n hay tá» chá»©c nÃ o, khi ÄÆ°á»£c yÃªu cáº§u, chÃºng tÃ´i sáº½ xem xÃ©t vÃ  gá»¡ bá» ngay láº­p tá»©c.</p>
            </div>
        
        </div>
    </footer>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <script src="${pageContext.request.contextPath}/static/js/index.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/doctruyen.js"></script>
</body>
</html>