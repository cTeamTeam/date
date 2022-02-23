<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>메인 페이지</title>
<link href="/date/resources/css/styles.css" rel="stylesheet" />
<link href="/date/resources/css/banner.css" rel="stylesheet" />
<link href="/date/resources/css/footer.css" rel="stylesheet" />
<link href="/date/resources/css/metchList.css" rel="stylesheet" />
<script type="text/javascript" src="/date/resources/js/scripts.js"></script>
<style>
a:link{color:pink;}
a:visited{color:pink;}
a{text-decoration:none;}
body { text-align: center; }
.dropbtn {
    background-color: gray;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}
.dropdown {
    position: relative;
    display: inline-block;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
.dropdown-content a:hover {
    background-color: pink
}
.dropdown:hover .dropdown-content {
    display: block;
}
.dropdown:hover .dropbtn {
    background-color: pink;
}
</style>
</head>
<body>

<!-- 네비게이션 바 -->
<%@include file="/WEB-INF/views/user/common/header.jsp" %>

<h3 style="color:pink;font-weight:800;margin-top:60px;">매칭 현황</h3>

<div class="metchListWrap">
<table border="1">
	<tr>
	<th>데이트 신청 상대 아이디</th>
	<th>상태</th>
	</tr>
	<c:forEach var="requestList" items="${requestList }" varStatus="loop">
	<tr>
	<td>${requestList.receiverId }</td>
	<c:choose>
	
	<c:when test = "${requestList.metchStatus == -1}">
		<td>거절</td>
	</c:when>
	
	<c:when test = "${requestList.metchStatus == 0}">
		<td>대기</td>
	</c:when>
	
	<c:when test = "${requestList.metchStatus ==1}">
		<td>수락</td>
	</c:when>
	
	</c:choose>
	</tr>
	</c:forEach>
</table>
<c:if test="${empty requestList }">
	<script type="text/javascript">
		alert("매칭 현황이 없습니다!");
		location.href="/date/";
	</script>
</c:if>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<%@include file="/WEB-INF/views/user/common/footer.jsp" %>
</body>
</html>