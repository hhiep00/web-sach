create database WebDocSach
go
use WebDocSach
go
create table Users(
	id_user int not null identity(1,1),
	username varchar(100) not null,
	ho_ten nvarchar(255),
	vai_tro int not null,
	email varchar(255) not null,
	avata varchar(255),
	pass varchar(100) not null,
	primary key (id_user)
)
go
create table TheLoai(
	id_TL int not null identity(1,1),
	tenTL nvarchar(255) not null,
	primary key (id_TL)
)
go
create table Sach(
	id_sach int not null identity(1,1),
	ten_sach nvarchar(255) not null,
	mo_ta text not null,
	so_trang int not null,
	tac_gia varchar(255) not null,
	ngay_dang date not null,
	img varchar(255) not null,
	primary key (id_sach)
)
go
create table TheLoaiSach(
	id_sach int not null,
	id_TL int not null,
	foreign key (id_sach) references Sach(id_sach),
	foreign key (id_TL) references TheLoai(id_TL),
	primary key (id_sach, id_TL)
)
go
create table YeuThich(
	id_sach int not null,
	id_user int not null,
	foreign key (id_sach) references Sach(id_sach),
	foreign key (id_user) references Users(id_user),
	primary key (id_sach, id_user)
)
go
create table LichSu(
	id_sach int not null,
	id_user int not null,
	foreign key (id_sach) references Sach(id_sach),
	foreign key (id_user) references Users(id_user),
	primary key (id_sach, id_user)
)
go
create table TrangSach(
	id_sach int not null,
	trang int not null,
	foreign key (id_sach) references Sach(id_sach),
	primary key (id_sach, trang)
)
go