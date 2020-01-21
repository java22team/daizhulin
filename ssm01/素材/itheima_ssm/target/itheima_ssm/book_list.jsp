<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>会员登录</title>
    <link rel="stylesheet" href="/itheima_ssm/css/bootstrap.min.css" type="text/css"/>
    <script src="/itheima_ssm/js/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="/itheima_ssm/js/bootstrap.min.js" type="text/javascript"></script>
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet" href="/itheima_ssm/css/style.css" type="text/css"/>

    <style>
        body {
            margin-top: 20px;
            margin: 0 auto;
            width: 100%;
        }

        .carousel-inner .item img {
            width: 100%;
            height: 300px;
        }
    </style>




</head>

<body>


<!-- 登录 注册 购物车... -->
<div class="container-fluid">
    <div class="col-md-4">
        <img src="/itheima_ssm/img/logo2.png"/>
    </div>
    <div class="col-md-5">
        <img src="/itheima_ssm/img/header.png"/>
    </div>
    <div class="col-md-3" style="padding-top:20px">
        <ol class="list-inline">
            <li><a href="login.jsp">登录</a></li>
            <li><a href="/itheima_ssm/register.jsp">注册</a></li>
            <li><a href="itheima_ssm/cart.jsp">购物车</a></li>
            <li><a href="itheima_ssm/order_list.jsp">我的订单</a></li>
        </ol>
    </div>
</div>

<!-- 导航条 -->
<div class="container-fluid">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">首页</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">公务员考试<span class="sr-only">(current)</span></a></li>
                    <li><a href="#">高考</a></li>
                    <li><a href="#">中考</a></li>
                    <li><a href="#">专升本</a></li>
                </ul>
                <form class="navbar-form navbar-right" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </div>
        </div>
    </nav>
</div>


<div class="row" id="div" style="width: 1210px; margin: 0 auto;">



    <c:forEach items="${pageBean.data}" var="bk" varStatus="vs">
        <div class="col-md-2" style="height: 230px">
            <a href="product_info.htm"> <img src="/itheima_ssm/img/${bk.bimage}"
                                             width="170" height="170" style="display: inline-block;">
            </a>
            <p>
                <a href="product_info.html" style='color: green'>${bk.bname}</a>
            </p>
            <p>
                <font color="#FF0000">商城价：&yen;${bk.bprice}</font>
            </p>
        </div>
    </c:forEach>

</div>

<!--分页 -->
<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
    <ul class="pagination" style="text-align: center; margin-top: 10px;">
        <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=${pageBean.currentPage-1}" aria-label="Next"> <span aria-hidden="false">上一页</span>
        </a></li>
        <c:forEach step="1" end="${pageBean.pages}" begin="1" var="i">
            <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=${i}">${i}</a></li>
        </c:forEach>
        <li><a href="${pageContext.request.contextPath}/book/findAll?pageNum=${pageBean.currentPage+1}" aria-label="Next"> <span aria-hidden="false">下一页</span>
        </a></li>
        <span>共${pageBean.pages}页 共${pageBean.total}条记录 </span>

    </ul>
</div>
<!-- 分页结束 -->


<div class="container-fluid">
    <div style="margin-top:50px;">
        <img src="/itheima_ssm/img/footer.jpg" width="100%" height="78" alt="我们的优势" title="我们的优势"/>
    </div>

    <div style="text-align: center;margin-top: 5px;">
        <ul class="list-inline">
            <li><a href="/itheima_ssm/info.jsp">关于我们</a></li>
            <li><a>联系我们</a></li>
            <li><a>招贤纳士</a></li>
            <li><a>法律声明</a></li>
            <li><a>友情链接</a></li>
            <li><a>支付方式</a></li>
            <li><a>配送方式</a></li>
            <li><a>服务声明</a></li>
            <li><a>广告声明</a></li>
        </ul>
    </div>
    <div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
        Copyright &copy; 2005-2018 黑马商城 版权所有
    </div>
</div>

</body>

</html>