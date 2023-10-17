<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<style>

    .col-12 {
        margin-bottom: 10px;
        align-content: center;
    }

    .card bg-light mb-3 {
        margin-right: 10px;
    }

    .image-container {
        position: relative;
    }

    .image-icons {
        display: none;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        z-index: 1;
    }

    .card:hover .image-icons {
        display: block;
    }

</style>
<body>
<!--begin of menu-->
<jsp:include page="Flower.jsp"></jsp:include>
<jsp:include page="Header.jsp"></jsp:include>
<!--end of menu-->

<div class="container py-5">
    <div class="row">
        <jsp:include page="Left.jsp"></jsp:include>


        <div class="col-sm-9">
            <div class="row">
                <c:forEach items="${listP}" var="o">
                    <div class="col-12 col-md-6 col-lg-4">
                        <div class="card">
                            <div class="image-container">
                                <img class="card-img-top" src="${o.image}" alt="Card image cap">
                                <ul class="list-unstyled image-icons">
                                    <li><a class="btn btn-success text-white" href="detail?pid=${o.id}"><i
                                            class="far fa-heart"></i></a></li>
                                    <li><a class="btn btn-success text-white mt-2" href="detail?pid=${o.id}"><i
                                            class="far fa-eye"></i></a></li>
                                    <li><a class="btn btn-success text-white mt-2" href="detail?pid=${o.id}"><i
                                            class="fas fa-cart-plus"></i></a></li>
                                </ul>
                            </div>
                            <div class="card-body">
                                <h4 class="card-title show_txt">${o.name}</h4>
                                <p class="card-text show_txt">${o.title}</p>
                                <div class="row">
                                    <div class="col">
                                        <p class="btn btn-danger btn-block">${o.price} $</p>
                                    </div>
                                    <div class="col">
                                        <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>


    </div>
</div>
<!-- Start Brands -->
<section class="bg-light py-5">
    <div class="container my-4">
        <div class="row text-center py-3">
            <div class="col-lg-6 m-auto">
                <h1 class="h1">Hợp tác sản xuất</h1>
                <p>
                    Tất cả những bộ trang sức làm nên thương hiệu riêng của shop đều được các thương hiệu riêng phân
                    phối trên toan
                </p>
            </div>
            <div class="col-lg-9 m-auto tempaltemo-carousel">
                <div class="row d-flex flex-row">
                    <!--Controls-->
                    <div class="col-1 align-self-center">
                        <a class="h1" href="#multi-item-example" role="button" data-bs-slide="prev">
                            <i class="text-light fas fa-chevron-left"></i>
                        </a>
                    </div>
                    <!--End Controls-->

                    <!--Carousel Wrapper-->
                    <div class="col">
                        <div class="carousel slide carousel-multi-item pt-2 pt-md-0" id="multi-item-example"
                             data-bs-ride="carousel">
                            <!--Slides-->
                            <div class="carousel-inner product-links-wap" role="listbox">

                                <!--First slide-->
                                <div class="carousel-item active">
                                    <div class="row">
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://cdn1.vieclam24h.vn/upload/files_cua_nguoi_dung/logo/2020/04/22/5938158_vieclam24h_1587547881.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://longbeachpearl.com/wp-content/uploads/2022/11/Logo-LongBeachPearl.webp"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://gigamall.com.vn/data/2019/09/20/16350118_LOGO-DOJI.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://pnj.com.vn/images/logo/logo_pnj.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                    </div>
                                </div>
                                <!--End First slide-->

                                <!--Second slide-->
                                <div class="carousel-item">
                                    <div class="row">
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://pnj.com.vn/images/logo/logo_pnj.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://gigamall.com.vn/data/2019/09/20/16350118_LOGO-DOJI.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://cdn1.vieclam24h.vn/upload/files_cua_nguoi_dung/logo/2020/04/22/5938158_vieclam24h_1587547881.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://longbeachpearl.com/wp-content/uploads/2022/11/Logo-LongBeachPearl.webp"
                                                             alt="Brand Logo"></a>
                                        </div>
                                    </div>
                                </div>
                                <!--End Second slide-->

                                <!--Third slide-->
                                <div class="carousel-item">
                                    <div class="row">
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://longbeachpearl.com/wp-content/uploads/2022/11/Logo-LongBeachPearl.webp"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://gigamall.com.vn/data/2019/09/20/16350118_LOGO-DOJI.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://cdn1.vieclam24h.vn/upload/files_cua_nguoi_dung/logo/2020/04/22/5938158_vieclam24h_1587547881.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                        <div class="col-3 p-md-5">
                                            <a href="#"><img class="img-fluid brand-img"
                                                             src="https://pnj.com.vn/images/logo/logo_pnj.png"
                                                             alt="Brand Logo"></a>
                                        </div>
                                    </div>
                                </div>
                                <!--End Third slide-->

                            </div>
                            <!--End Slides-->
                        </div>
                    </div>
                    <!--End Carousel Wrapper-->

                    <!--Controls-->
                    <div class="col-1 align-self-center">
                        <a class="h1" href="#multi-item-example" role="button" data-bs-slide="next">
                            <i class="text-light fas fa-chevron-right"></i>
                        </a>
                    </div>
                    <!--End Controls-->
                </div>
            </div>
        </div>
    </div>
</section>
<!--End Brands-->

<!-- Footer -->
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>

