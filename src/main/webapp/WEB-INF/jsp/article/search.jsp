<%@ page language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>明日论坛-国内领先的IT技术搜素引擎</title>
    <head>
    </head>
    <script type="text/javascript" src="../static/js/search.js"></script>
    <script type="text/javascript" src="../static/js/jquery.js"></script>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td height="26" background="../static/images/bbs_header_nav.gif" class="huise1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;明日软件
            | 明日图书 | 编程词典 | 网络学院 | 明日书店
        </td>
    </tr>
</table>
<br/>
<form action="doSearch" method="post" id="doSearchForm">
    <div><span><img src="../static/images/logo.gif"/></span> <span><input
            type="text" name="content" id="searchStr"
            style="width: 350px; margin-bottom: 10px;"/></span> <span><img
            src="../static/images/so.GIF" width="109" height="35"
            style="margin-left: 10px; cursor: hand;" onclick="doSearch()"/></span></div>
</form>
<br/>
<table width="100%" border="0" align="center" cellpadding="0"
       cellspacing="0">
    <tr>
        <td width="4"><img src="../static/images/left01.gif" width="4" height="33"/></td>
        <td background="../static/images/left02.gif">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <c:if test="${username!=null}">
                        <td><span class="hong">&nbsp;&nbsp;<a class="hong">欢迎您,${username}</a></span> <span
                                class="hong">&nbsp;&nbsp;<a
                                class="hong" href="*index">退出</a></span></td>
                    </c:if>
                    <c:if test="${username==null}">
                        <td><span class="hong">&nbsp;&nbsp; <s:a
                                action="toLoginPage" cssClass="hong">登录</s:a> </span> <span
                                class="henhong">|</span><span cssClass="hong"> <s:a
                                action="register" cssClass="hong">注册</s:a></span></td>
                    </c:if>
                    <td align="right" class="hong"><a href="#" class="hong">软件</a>
                        &nbsp;&nbsp;<span class="henhong">|</span>&nbsp;&nbsp;&nbsp;<a
                                href="#" class="hong">图书</a> &nbsp;&nbsp;<span class="henhong">|</span>&nbsp;&nbsp;&nbsp;<a
                                href="#" class="hong">词典</a> &nbsp;&nbsp;<span class="henhong">|</span>&nbsp;&nbsp;&nbsp;<a
                                href="#" class="hong">学院</a> &nbsp;&nbsp;<span class="henhong">|</span>&nbsp;&nbsp;&nbsp;<a
                                href="#" class="hong">书店</a>&nbsp;
                    </td>
                </tr>
            </table>
        </td>
        <td width="4"><img src="../static/images/left03.gif" width="4" height="33"/></td>
    </tr>
</table>
<br/>
<div id="path"><span class="huise"> <img
        src="../static/images/home32.gif" width="25" height="25"/> <a
        href="index" cssClass="hong">明日论坛 </a> </span></div>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <c:if test="${username!=null}">
            <td align="left">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td align="right"><a href="toAddArticlePage">
                            <img src="../static/images/grxx.gif" width="129" height="39" border="0"/>
                        </a> <a href="myArticle">
                            <img src="../static/images/wz.gif" width="129" height="39" border="0"/>
                        </a> <a href="update">
                            <img src="../static/images/wh.gif" width="129" height="39" border="0"/>
                        </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        </td>
                    </tr>
                </table>
            </td>
        </c:if>
        <c:if test="${username==null}">
            <td height="24"><span class="huise1">您可以</span><span
                    class="henhong"><a href="register"
                                       target="_blank" cssClass="chengse">注册</a></span><span
                    class="huise1">一个账户，并以此</span><span
                    class="henhong"><a href="toLoginPage"
                                       target="_blank" cssClass="chengse">登录</a></span><span class="huise1">，以便参与本站更多活动，与大家交流。</span>
            </td>
        </c:if>
    </tr>
</table>
</body>
<script type="text/javascript" src="../static/js/search.js"></script>