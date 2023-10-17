<%--
  Created by IntelliJ IDEA.
  User: hieuh
  Date: 10/12/2023
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .f1-effect {
        position: relative;
        z-index: 99999999; }
    .f1-effect .f1-effect-flower {
        opacity: 1;
        border-radius: 100%;
        background: url(https://file.hstatic.net/200000259653/file/pages_17a8568517e94dcd9c8aec5587_570924d1fa4b4da1aa011044c9d7cc1c.png);
        position: fixed;
        top: -10%;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
        cursor: default;
        -webkit-animation-name: snowflakes-fall, snowflakes-shake;
        -webkit-animation-duration: 10s, 3s;
        -webkit-animation-timing-function: linear, ease-in-out;
        -webkit-animation-iteration-count: infinite, infinite;
        -webkit-animation-play-state: running, running;
        animation-name: snowflakes-fall, snowflakes-shake;
        animation-duration: 10s, 3s;
        animation-timing-function: linear, ease-in-out;
        animation-iteration-count: infinite, infinite;
        animation-play-state: running, running; }
    @media (max-width: 767px) {
        .f1-effect .f1-effect-flower:nth-of-type(2n) {
            display: none; } }
    .f1-effect .f1-effect-flower:nth-of-type(0) {
        left: 5%;
        -webkit-animation-delay: 1s, 1s;
        animation-delay: 1s, 1s;
        width: 16px;
        height: 16px;
        background-position: 0 -23px; }
    .f1-effect .f1-effect-flower:nth-of-type(1) {
        left: 10%;
        -webkit-animation-delay: 6s, 0.5s;
        animation-delay: 6s, 0.5s;
        width: 13px;
        height: 13px;
        background-position: 0 -50px; }
    .f1-effect .f1-effect-flower:nth-of-type(2) {
        left: 20%;
        -webkit-animation-delay: 4s, 2s;
        animation-delay: 4s, 2s;
        width: 15px;
        height: 15px;
        background-position: -49px -35px; }
    .f1-effect .f1-effect-flower:nth-of-type(3) {
        left: 30%;
        -webkit-animation-delay: 2s, 2s;
        animation-delay: 2s, 2s;
        width: 14px;
        height: 14px;
        background-position: -31px 0; }
    .f1-effect .f1-effect-flower:nth-of-type(4) {
        left: 40%;
        -webkit-animation-delay: 8s, 3s;
        animation-delay: 8s, 3s;
        width: 16px;
        height: 16px;
        background-position: 0 -23px; }
    .f1-effect .f1-effect-flower:nth-of-type(5) {
        left: 50%;
        -webkit-animation-delay: 6s, 2s;
        animation-delay: 6s, 2s;
        width: 13px;
        height: 13px;
        background-position: 0 -50px; }
    .f1-effect .f1-effect-flower:nth-of-type(6) {
        left: 60%;
        -webkit-animation-delay: 2.5s, 1s;
        animation-delay: 2.5s, 1s;
        width: 15px;
        height: 15px;
        background-position: -49px -35px; }
    .f1-effect .f1-effect-flower:nth-of-type(7) {
        left: 70%;
        -webkit-animation-delay: 1s, 0s;
        animation-delay: 1s, 0s;
        width: 14px;
        height: 14px;
        background-position: -31px 0; }
    .f1-effect .f1-effect-flower:nth-of-type(8) {
        left: 80%;
        -webkit-animation-delay: 2s, 2s;
        animation-delay: 2s, 2s;
        width: 14px;
        height: 14px;
        background-position: -31px 0; }
    .f1-effect .f1-effect-flower:nth-of-type(9) {
        left: 90%;
        -webkit-animation-delay: 8s, 3s;
        animation-delay: 8s, 3s;
        width: 16px;
        height: 16px;
        background-position: 0 -23px; }
    .f1-effect .f1-effect-flower:nth-of-type(10) {
        left: 95%;
        -webkit-animation-delay: 6s, 2s;
        animation-delay: 6s, 2s;
        width: 13px;
        height: 13px;
        background-position: 0 -50px; }

    @-webkit-keyframes snowflakes-fall {
        0% {
            top: -10%; }
        100% {
            top: 100%; } }

    @-webkit-keyframes snowflakes-shake {
        0% {
            -webkit-transform: translateX(0px);
            transform: translateX(0px); }
        50% {
            -webkit-transform: translateX(80px);
            transform: translateX(80px); }
        100% {
            -webkit-transform: translateX(0px);
            transform: translateX(0px); } }

    @keyframes snowflakes-fall {
        0% {
            top: -10%; }
        100% {
            top: 100%; } }

    @keyframes snowflakes-shake {
        0% {
            transform: translateX(0px); }
        50% {
            transform: translateX(80px); }
        100% {
            transform: translateX(0px); } }

</style>
<body>
<div class="f1-effect">

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

    <div class="f1-effect-flower">
    </div>

</div>


</body>
</html>
