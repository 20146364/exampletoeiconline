<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<c:url var="requestURI" value="/admin-guideline-listen-list.html"/>
<c:url value="" var="listenGuidelineEditUrl">
    <c:param name="urlType" value="url_edit"/>
</c:url>
<%--<c:url var="formUrl" value="/admin-guideline-listen-list.html"/>--%>
<html>
<head>
    <title><fmt:message key="label.guideline.listen.list" bundle="${lang}"/></title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try {
                    ace.settings.check('breadcrumbs', 'fixed')
                } catch (e) {
                }
            </script>

            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#"><fmt:message key="label.home" bundle="${lang}"/></a>
                </li>
                <li class="active"><fmt:message key="label.guideline.listen.list" bundle="${lang}"/></li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <a href="${listenGuidelineEditUrl}" type="button"/>
                    <fmt:bundle basename="ApplicationResources">
                        <div class="table-responsive">
                            <display:table id="tableID" name="items.list" partialList="true" size="${items.totalItem}"
                                           pagesize="${items.maxPageItem}" sort="external" requestURI="${requestURI}"
                                           class="table table-fcv-ace table-striped table-bordered table-hover dataTable no-footer"
                                           style="margin: 3em 0 1.5em;">
                                <display:column property="titleName" titleKey="label.guideline.title" sortable="true" sortName="titleName"></display:column>
                                <display:column property="content" titleKey="label.guideline.content" sortable="true" sortName="content"></display:column>
                                <display:column property="createdTime" titleKey="label.guideline.createdTime" sortable="true" sortName="createdTime"></display:column>
                                <display:column property="modTime" titleKey="label.guideline.modTime" sortable="true" sortName="modTime"></display:column>
                            </display:table>
                        </div>
                    </fmt:bundle>
                </div>
            </div>
        </div>
    </div>
</div>
<%--<script>--%>
    <%--$(document).ready(function () {--%>
        <%--$('#btnSearch').click(function () {--%>
            <%--$('#formUrl').submit();--%>
        <%--});--%>
    <%--});--%>

    <%--function warningBeforeDelete() {--%>
        <%--showAlertBeforeDelete(function () {--%>
            <%--$('#crudaction').val('redirect_delete');--%>
            <%--$('#formUrl').submit();--%>
        <%--});--%>
    <%--}--%>
<%--</script>--%>
</body>
</html>
