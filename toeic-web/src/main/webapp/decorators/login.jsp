<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title><dec:title default="Login Page"/></title>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/bootstrap.min.css' />"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/fonts.googleapis.com.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace.min.css'/>" class="ace-main-stylesheet"
          id="main-ace-style"/>
    <script src="<c:url value='/template/admin/js/ace-extra.min.js'/>"></script>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="assets/font-awesome/4.5.0/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-skins.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-rtl.min.css'/>"/>
    <dec:head/>
</head>
<body class="login-layout">

<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">
                    <div class="center">
                        <%@include file="/common/login/header.jsp" %>
                        <dec:body/>
                        <%@include file="/common/login/footer.jsp" %>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="<c:url value='/template/admin/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/excanvas.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery-ui.custom.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.ui.touch-punch.min.js'/>"></script>
<script src="<c:url value="/template/admin/js/jquery.easypiechart.min.js"/>"></script>
<script src="<c:url value='/template/admin/js/jquery.sparkline.index.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.flot.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.flot.pie.min.js'/>"></script>
<script src="<c:url value="/template/admin/js/jquery.flot.resize.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/ace-elements.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/ace.min.js"/>"></script>

</body>
</html>
