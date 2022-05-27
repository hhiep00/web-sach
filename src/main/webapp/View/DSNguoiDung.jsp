<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/DSNguoiDung.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/admin.css">
</head>
<body>
    <div class="admin-header">
        <div class="tieu-de">
            <p>Xin chào Admin</p>
        </div>
        <ul class="thao-tac">
            <li><a href="">Trang chủ</a></li>
            <li><a href="">Đăng xuất</a></li>
        </ul>
    </div>
    <div class="admin-page">
        <div class="menu">
            <p>Tổng quan</p>
            <ul class="danh-sach">
                <li><a href="DSTruyen.html">Danh sách truyện</a></li>
                <li><a href="ThemTruyen.html">Thêm truyện</a></li>
                <li><a href="DSNguoiDung.html">Danh sách người dùng</a></li>
            </ul>
        </div>
        <div class="content">
            <div class="danh-sach-nguoi-dung">
                <h1>Danh sách người dùng</h1>
                <div class="tim-kiem">
                    <input type="text" name="" id="" placeholder="Nhập tên người dùng/ID">
                    <button>Tìm kiếm</button>
                </div>
                <div class="bang-sua-nguoi-dung">
                    <table class="bang-nguoi-dung">
                        <thead>
                            <colgroup>
                                <col width="45" >
                                <col width="150">
                                <col width="200">
                                <col width="100">
                                <col width="200">
                                <col width="40">
                                <col width="100">
                                <col width="100">
                            </colgroup>
                            <tr>
                                <th>ID User</th>
                                <th>Username</th>
                                <th>Họ và tên</th>
                                <th>Vai trò</th>
                                <th>Email</th>
                                <th>Avarta</th>
                                <th>password</th>
                                <th>Sửa/Xóa</th>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>DATBTTB</td>
                                <td>Nguyễn Đình Đạt</td>
                                <td>Người dùng</td>
                                <td>dat@gmail.com</td>
                                <td>none</td>
                                <td>1231231</td>
                                <td>
                                    <input type="button" value="Sửa">
                                    <input type="button" value="Xóa">
                                </td>
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>
            
           
        </div>

    </div>
    <style>
    </style>
</body>
</html>