<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 10/11/2023i
  Time: 7:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Jewelry💎</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="assets/img/apple-icon.png">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/templatemo.css">
    <link rel="stylesheet" href="assets/css/custom.css">

    <!-- Load fonts style after rendering the layout styles -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap">
    <link rel="stylesheet" href="assets/css/fontawesome.min.css">

</head>


<body >
<jsp:include page="Flower.jsp"></jsp:include>
<!-- Start Top Nav -->
<nav class="navbar navbar-expand-lg bg-dark navbar-light d-none d-lg-block" id="templatemo_nav_top">
    <div class="container text-light">
        <div class="w-100 d-flex justify-content-between">
            <div>
                <i class="fa fa-envelope mx-2"></i>
                <a class="navbar-sm-brand text-light text-decoration-none" href="mailto:info@company.com">hieuhuyphantn@gmail.com</a>
                <i class="fa fa-phone mx-2"></i>
                <a class="navbar-sm-brand text-light text-decoration-none" href="tel:010-020-0340">0396671835</a>
            </div>
            <div>
                <a class="text-light" href="https://www.facebook.com/profile.php?id=100080972678104" target="_blank" rel="sponsored"><i class="fab fa-facebook-f fa-sm fa-fw me-2"></i></a>
                <a class="text-light" href="https://www.instagram.com/sontungmtp/" target="_blank"><i class="fab fa-instagram fa-sm fa-fw me-2"></i></a>
                <a class="text-light" href="https://twitter.com/" target="_blank"><i class="fab fa-twitter fa-sm fa-fw me-2"></i></a>
                <a class="text-light" href="https://www.linkedin.com/" target="_blank"><i class="fab fa-linkedin fa-sm fa-fw"></i></a>
            </div>
        </div>
    </div>
</nav>
<!-- Close Top Nav -->

<jsp:include page="Header.jsp"></jsp:include>

<!-- Start Banner Hero -->
<div id="template-mo-zay-hero-carousel" class="carousel slide" data-bs-ride="carousel">
    <ol class="carousel-indicators">
        <li data-bs-target="#template-mo-zay-hero-carousel" data-bs-slide-to="0" class="active"></li>
        <li data-bs-target="#template-mo-zay-hero-carousel" data-bs-slide-to="1"></li>
        <li data-bs-target="#template-mo-zay-hero-carousel" data-bs-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <div class="container">
                <div class="row p-5">
                    <div class="mx-auto col-md-8 col-lg-6 order-lg-last">
                        <img class="img-fluid" src="https://cdn.pnj.io/images/thumbnails/485/485/detailed/58/bo-trang-suc-bac-pnjsilver-fantasia-dinh-da-mau-xanh-duong-92650.png" alt="">
                    </div>
                    <div class="col-lg-6 mb-0 d-flex align-items-center">
                        <div class="text-align-left align-self-center">
                            <h1 class="h1 text-success"><b>Jewelry</b> Đá quý tự nhiên</h1>
                            <h3 class="h2">Sự kết hợp của sự tinh tế,thanh lịch nhưng cũng không kém phần sang trọng,cầu kì</h3>
                            <p>
                                Jewelry tự hào là thương hiệu trang sức cao cấp hàng đầu Việt Nam.
                                Đá quý tự nhiên 100%  trải qua quá trình kiểm định chất lượng để đạt được sự hoàn hảo tuyệt đối.
                                Vẻ đẹp của bạn chính là niềm hạnh phúc của chúng tôi 😍
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="carousel-item">
            <div class="container">
                <div class="row p-5">
                    <div class="mx-auto col-md-8 col-lg-6 order-lg-last">
                        <img class="img-fluid" src="https://cdn.pnj.io/images/detailed/93/B%E1%BB%99_trang_s%E1%BB%A9c_B%E1%BA%A1c_%C4%91%C3%ADnh_%C4%91%C3%A1_Swarovski_PNJSilver_00006-00002.png" alt="">
                    </div>
                    <div class="col-lg-6 mb-0 d-flex align-items-center">
                        <div class="text-align-left">
                            <h1 class="h1">Món quà được tạo hóa ban tặng</h1>
                            <h3 class="h2">Gửi gắm trong đó là những lời yêu thương da diết</h3>
                            <p>
                                Vẻ đẹp của tình yêu được gói trọn trong bộ trang sức mới nhất của chúng tôi.
                                Bạn hãy <strong>cảm nhận</strong>  món quà của tình yêu nhé❤️.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="carousel-item">
            <div class="container">
                <div class="row p-5">
                    <div class="mx-auto col-md-8 col-lg-6 order-lg-last">
                        <img class="img-fluid" src="https://cdn.pnj.io/images/thumbnails/485/485/detailed/108/gvpaxmw000018-vong-tay-cuoi-vang-trang-14k-dinh-ngoc-trai-akoya-pnj-true-love-0001.png" alt="">
                    </div>
                    <div class="col-lg-6 mb-0 d-flex align-items-center">
                        <div class="text-align-left">
                            <h1 class="h1">Với tên gọi mỹ miều là "giọt nước mắt của nhân ngư" </h1>
                            <h3 class="h2"> Tạo nên sự mới mẻ,cuốn hút,mới lạ ngay từ ánh nhìn đầu tiên</h3>
                            <p>
                                Được chế tác từ ngọc trai tự nhiên ở vùng biển Caribe
                                cùng với hàng nghìn viên kim cương được đính kết tỉ mỉ 🌺
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <a class="carousel-control-prev text-decoration-none w-auto ps-3" href="#template-mo-zay-hero-carousel" role="button" data-bs-slide="prev">
        <i class="fas fa-chevron-left"></i>
    </a>
    <a class="carousel-control-next text-decoration-none w-auto pe-3" href="#template-mo-zay-hero-carousel" role="button" data-bs-slide="next">
        <i class="fas fa-chevron-right"></i>
    </a>
</div>
<!-- End Banner Hero -->


<!-- Start Categories of The Month -->
<section class="container py-5" >
    <div class="row text-center pt-3">
        <div class="col-lg-6 m-auto">
            <h1 class="h1">🔥Các loại trang sức 🔥</h1>
            <p>
                Jewelry hân hạnh mang đến những bộ trang sức lấy cảm hứng từ thiên nhiên,đất nước,con người Việt Nam nhằm tôn vinh vẻ đẹp của người phụ nữ trong cuộc sống .Bạn còn ngần ngại gì mà không khám phá vẻ đẹp rực rỡ của đất trời nào


            </p>
        </div>
    </div>
    <div class="row">
        <div class="col-12 col-md-4 p-5 mt-3" >
            <a href="#"><img src="https://cdn.pnj.io/images/thumbnails/485/485/detailed/183/sp-gnrbxmy001202-nhan-vang-18k-dinh-da-ruby-pnj-01.png" class="rounded-circle img-fluid border"></a>
            <h5 class="text-center mt-3 mb-3">Nhẫn</h5>
            <p class="text-center"><a  class="btn btn-success" href="http://localhost:8080/shop">Sản phẩm</a></p>
        </div>
        <div class="col-12 col-md-4 p-5 mt-3">
            <a href="#"><img src="https://cdn.pnj.io/images/thumbnails/485/485/detailed/185/sp-gmtpxmc000004-mat-day-chuyen-vang-14k-dinh-da-topaz-pnj-niem-tin-1.png" class="rounded-circle img-fluid border"></a>
            <h2 class="h5 text-center mt-3 mb-3">Dây chuyền</h2>
            <p class="text-center"><a  class="btn btn-success" href="http://localhost:8080/shop">Sản phẩm</a></p>
        </div>
        <div class="col-12 col-md-4 p-5 mt-3">
            <a href="#"><img src="https://cdn.pnj.io/images/thumbnails/485/485/detailed/184/sp-gbddmxc000003-bong-tai-kim-cuong-vang-14k-pnj-1.png" class="rounded-circle img-fluid border"></a>
            <h2 class="h5 text-center mt-3 mb-3">Khuyên tai</h2>
            <p class="text-center"><a  class="btn btn-success" href="http://localhost:8080/shop">Sản phẩm</a></p>
        </div>
    </div>
</section>
<!-- End Categories of The Month -->


<!-- Start Featured Product -->
<section class="bg-light">
    <div class="container py-5">
        <div class="row text-center py-3">
            <div class="col-lg-6 m-auto">
                <h1 class="h1">🍀Best Seller🍀</h1>
                <p>
                  Những sản phẩm nổi bật với lượng mua khủng không bao giờ hết hot đã quay trở lại khuấy đảo tháng 10 này,nhanh tay kẻo hết bạn ơii
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-12 col-md-4 mb-4">
                <div class="card h-100">
                    <a href="shop-single.html">
                        <img src="https://cdn.pnj.io/images/detailed/39/bo-trang-suc-pnj-sac-xuan-vang-18k-dinh-da-citrine-yb88330-88331-88332-88333-1.png" class="card-img-top" alt="...">
                    </a>
                    <div class="card-body">
                        <ul class="list-unstyled d-flex justify-content-between">
                            <li>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-muted fa fa-star"></i>
                                <i class="text-muted fa fa-star"></i>
                            </li>
                            <li class="text-muted text-right">$240.00</li>
                        </ul>
                        <a href="http://localhost:8080/shop" class="h2 text-decoration-none text-dark">Sắc xuân đâm chồi nảy lộc 💐</a>
                        <p class="card-text">
                            Kim cương được xem như là vật huyền bí tượng trưng cho sức mạnh, quyền lực, sự giàu sang và lòng quả cảm.                        </p>
                        <p class="text-muted">Đánh giá (24)</p>
                    </div>
                </div>
            </div>
            <div class="col-12 col-md-4 mb-4">
                <div class="card h-100">
                    <a href="shop">
                        <img src="https://cdn.pnj.io/images/thumbnails/485/485/detailed/175/00031-00020%20bo-trang-suc-bac-dinh-da-pnjsilver-1.png" class="card-img-top" alt="...">
                    </a>
                    <div class="card-body">
                        <ul class="list-unstyled d-flex justify-content-between">
                            <li>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-muted fa fa-star"></i>
                                <i class="text-muted fa fa-star"></i>
                            </li>
                            <li class="text-muted text-right">$480.00</li>
                        </ul>
                        <a href="http://localhost:8080/shop" class="h2 text-decoration-none text-dark">Thời gian vĩnh cửu 🌸</a>
                        <p class="card-text">
                            Cẩm thạch là một trong các loại đá quý có khả năng chống mài mòn tuyệt vời, phù hợp với mọi loại trang sức và nhiều thiết kế phá cách. Cùng với ngọc bích, cẩm thạch còn được làm thành những viên đá Tỳ hưu phong thủy có ích trong kinh doanh và thu hút tài lộc.                        </p>
                        <p class="text-muted">Reviews (48)</p>
                    </div>
                </div>
            </div>
            <div class="col-12 col-md-4 mb-4">
                <div class="card h-100">
                    <a href="http://localhost:8080/shop">
                        <img src="https://cdn.pnj.io/images/thumbnails/485/485/detailed/179/bo-trang-suc-vang-trang-14k-dinh-ngoc-trai-freshwater-pnj-00006-00009-1.png" class="card-img-top" alt="...">
                    </a>
                    <div class="card-body">
                        <ul class="list-unstyled d-flex justify-content-between">
                            <li>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                                <i class="text-warning fa fa-star"></i>
                            </li>
                            <li class="text-muted text-right">$360.00</li>
                        </ul>
                        <a href="http://localhost:8080/shop" class="h2 text-decoration-none text-dark">Những hạt ngọc trời 🤗</a>
                        <p class="card-text">
                            Ngọc hải lam được săn đón nhiều nhất với màu xanh thuần khiết có cường độ mạnh. Ngọc hải lam xuất hiện phổ biến trong các loại đá quý dùng làm trang sức hàng ngày vì có độ bền được đánh giá cao: từ 7.5 - 8 điểm.                        </p>
                        <p class="text-muted">Reviews (74)</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Featured Product -->


<!-- Start Footer -->
<jsp:include page="Footer.jsp"></jsp:include>
<!-- End Footer -->

<!-- Start Script -->
<script src="assets/js/jquery-1.11.0.min.js"></script>
<script src="assets/js/jquery-migrate-1.2.1.min.js"></script>
<script src="assets/js/bootstrap.bundle.min.js"></script>
<script src="assets/js/templatemo.js"></script>
<script src="assets/js/custom.js"></script>

<!-- End Script -->
</body>

</html>