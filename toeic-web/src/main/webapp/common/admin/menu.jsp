<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div id="sidebar" class="sidebar  responsive  ace-save-state">
    <script type="text/javascript">
        try{ace.settings.loadState('sidebar')}catch(e){}
    </script>
    <div class="sidebar-shortcuts">
        <div class="sidebar-shortcuts-large">
            <button class="btn btn-success">
                <i class="ace-icon fa fa-signal"></i>
            </button>

            <button class="btn btn-info">
                <i class="ace-icon fa fa-pencil"></i>
            </button>

            <button class="btn btn-warning">
                <i class="ace-icon fa fa-users"></i>
            </button>

            <button class="btn btn-danger">
                <i class="ace-icon fa fa-cogs"></i>
            </button>
        </div>
        <div class="sidebar-shortcuts-mini">
            <span class="btn btn-success"></span>

            <span class="btn btn-info"></span>

            <span class="btn btn-warning"></span>

            <span class="btn btn-danger"></span>
        </div>
    </div>
    <ul class="nav nav-list">
        <%--<li class="">--%>
            <%--<a href="#" class="dropdown-toggle">--%>
                <%--<i class="menu-icon fa fa-list"></i>--%>
                <%--<span class="menu-text"></span>--%>
                <%--<fmt:message key="label.guideline.listen" bundle="${lang}"/>--%>
                <%--<b class="arrow fa fa-angle-down"></b>--%>
            <%--</a>--%>
            <%--<b class="arrow"></b>--%>
            <%--&lt;%&ndash;<ul class="submenu">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<li class="">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<a href="${listenGuidelineListUrl}">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<i class="menu-icon fa fa-caret-right"></i>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<fmt:message key="label.guideline.listen.list" bundle="${lang}"/>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</a>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<b class="arrow"></b>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
        <%--</li>--%>
        <%--<li class="">--%>
            <%--<a href="#" class="dropdown-toggle">--%>
                <%--<i class="menu-icon fa fa-list"></i>--%>
                <%--<span class="menu-text"></span>--%>
                <%--<fmt:message key="label.dashboard" bundle="${lang}"/>--%>
                <%--<b class="arrow fa fa-angle-down"></b>--%>
            <%--</a>--%>
            <%--<b class="arrow"></b>--%>
            <%--&lt;%&ndash;<ul class="submenu">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<li class="">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<a href="${userListUrl}">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<i class="menu-icon fa fa-caret-right"></i>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<fmt:message key="label.user.management" bundle="${lang}"/>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</a>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<b class="arrow"></b>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
        <%--</li>--%>
        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"></span>
                <b class="arrow fa fa-angle-down"></b>
            </a>
            <b class="arrow"></b>
            <ul class="submenu">
                <li class="">
                    <%--<a href="<c:url value="/admin-exericse-upload.html"/>">--%>
                        <%--<i class="menu-icon fa fa-caret-right"></i>--%>
                        <%--<fmt:message key="label.exercise.audio.image.upload" bundle="${lang}"/>--%>
                    <%--</a>--%>
                    <b class="arrow"></b>
                </li>
            </ul>
        </li>
    </ul>
    <div class="sidebar-toggle sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
    </div>
</div>