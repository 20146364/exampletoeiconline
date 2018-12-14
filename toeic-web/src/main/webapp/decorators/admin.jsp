<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title><dec:title default="Admin Page"/></title>

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/bootstrap.min.css' />"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css'/>"/>

    <!-- text fonts -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/fonts.googleapis.com.css'/>"/>

    <!-- ace styles -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace.min.css'/>" class="ace-main-stylesheet"
          id="main-ace-style"/>

    <!-- ace settings handler -->
    <script src="<c:url value='/template/admin/js/ace-extra.min.js'/>"></script>


    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/font-awesome/4.5.0/css/font-awesome.min.css" />

    <!-- page specific plugin styles -->

    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-skins.min.css'/>" />
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-rtl.min.css'/>" />

    <dec:head/>

</head>
<body class="no-skin">

<!-- Begin header!-->
<%@include file="/common/admin/header.jsp" %>
<!-- End header!-->

<!-- Begin menu!-->
<%--<%@include file="/common/admin/menu.jsp"%>--%>
<!-- End menu!-->

<dec:body/>

<!-- Begin footer!-->
<%--<%@include file="/common/admin/footer.jsp"%>--%>
<!-- End footer!-->


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
