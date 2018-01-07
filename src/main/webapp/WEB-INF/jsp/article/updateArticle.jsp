<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>明日知道-国内领先的IT技术搜素引擎</title>
<link href="../static/css/css.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.huise {
	COLOR: #666666;
}
</style>
<SCRIPT type="text/javascript" src="../static/jsjquery.js"></SCRIPT>
<%--<SCRIPT type="text/javascript">
    function updateArticle1() {
        var articleId = '${article.articleid}';
    	updateArticleForm = updateArticleForm + '?id=' + articleId;
    	updateArticleForm.submit();
    }
</SCRIPT>--%>
</head>
<body style="padding: 0px 30px 0px 30px;">
<%@include file="/WEB-INF/jsp/article/search.jsp"%>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<table width="100%" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="4"><img src="../static/images/left011.gif" width="4"
				height="33" /></td>
			<td background="../static/images/left022.GIF">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td style="">修改文章</td>
					<td>&nbsp;</td>
				</tr>
			</table>
			</td>
			<td width="4"><img src="../static/images/left033.gif" width="4"
				height="33" /></td>
		</tr>
	</table>
	<div style="margin-left: 20px;">
	<form action="updateArticle1?id=${article.articleid}" method="post"
		id="updateArticleForm">
	<table>
		<tr>
			<td class="huise">文章标题：</td>
			<td><input typoe="text" name="title" id="title"
				value="${article.title}"></td>
		</tr>
		<tr>
			<td class="huise">所属类型：</td>
			<td>${article.articletypename}</td>
		</tr>
		<tr>
			<td class="huise">文章内容：</td>
			<td><textarea name="content" cols="80" rows="10"
				id="content">${article.content}</textarea></td>
		</tr>
	</table>
	<p align="center"><input type="submit" value="修   改"/></p>
	</form>
	</div>
	<table width="100%" height="26" border="0" align="center"
		cellpadding="0" cellspacing="0">
		<tr>
			<td height="51" background="../static/images/end.gif" class="huise1">
			<table width="95%" border="0" align="center" cellpadding="0"
				cellspacing="0">
				<tr>
					<td class="henhong">关于我们 | 广告招商 | 举报中心 | 联系方式 | 客户服务 | 会员注册 <br />
					Powered by mingrisoft.com</td>
					<td align="right" class="henhong">E-mail：mingrisoft@mingrisoft.com
					&nbsp;&nbsp;电话：400-676-1066 &nbsp;&nbsp;吉ICP备07500273号<br />
					Copyright &nbsp;&copy;吉林省明日科技有限公司 1999-2009, All Rights Reserved</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
</body>
<script language="JavaScript" type="text/javascript" src="../static/jssearch.js"></script>
<script language="JavaScript" type="text/javascript">
     var data = new Array();// 存放路径对象
     data.push(forum);
     data.push(updateArticle);
     new PathUtil(data)
  </script>