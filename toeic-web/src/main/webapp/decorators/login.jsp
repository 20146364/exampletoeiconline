<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><dec:title default="Admin Page" /></title>
    <link rel="stylesheet" href="<c:url value='/template/admin/assets/css/bootstrap.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css' />" />
    <link rel="stylesheet" href="<c:url value='/template/admin/assets/css/ace.min.css' />" class="ace-main-stylesheet" id="main-ace-style" />
    <script src="<c:url value='/template/admin/assets/js/ace-extra.min.js' />"></script>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type='text/javascript' src='<c:url value="/template/admin/js/jquery-2.2.3.min.js" />'></script>
    <script src="<c:url value='/template/admin/assets/js/jquery.2.1.1.min.js' />"></script>
    <link rel="stylesheet" href="<c:url value="/template/admin/css/global_admin_style.css"/>">
    <script type="text/javascript" src="<c:url value="/template/admin/js/global_admin_script.js"/>"></script>
    <script src="<c:url value='/template/admin/assets/js/jquery.validate.min.js' />"></script>

    <%--ckeditor plugin--%>
    <script type="text/javascript" src="<c:url value="/ckeditor/ckeditor.js"/>"></script>

    <%--sweetalert--%>
    <script type='text/javascript' src='<c:url value="/template/admin/sweetalert/sweetalert2.min.js"/>'></script>
    <link rel="stylesheet" href="<c:url value="/template/admin/sweetalert/sweetalert2.min.css"/>">
    <script type="text/javascript" src="<c:url value="/ckfinder/ckfinder.js"/>"></script>
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

<!-- /.main-container -->

<script src="<c:url value='/template/admin/assets/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/jquery-ui.custom.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/jquery.ui.touch-punch.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/jquery.easypiechart.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/jquery.sparkline.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/jquery.flot.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/jquery.flot.pie.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/jquery.flot.resize.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/ace-elements.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/ace.min.js' />"></script>
<script src="<c:url value='/template/admin/assets/js/bootstrap.min.js'/>"></script>

<!-- page specific plugin scripts -->
<script src="<c:url value='/template/admin/assets/js/jquery-ui.min.js'/>"></script>

<script type="text/javascript">
    function showAlertBeforeDelete(callback) {
        swal({
            title: "Xác nhận xóa",
            text: "Bạn có chắc chắn xóa những dòng đã chọn",
            type: "warning",
            showCancelButton: true,
            confirmButtonText: "Xác nhận",
            cancelButtonText: "Hủy bỏ",
            confirmButtonClass: "btn btn-success",
            cancelButtonClass: "btn btn-danger"
        }).then(function (isConfirm) {
            if (isConfirm) {
                callback();
            }
        });
    }
</script>
</body>
</html>
