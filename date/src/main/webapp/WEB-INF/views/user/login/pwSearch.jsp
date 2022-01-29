<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/date/resources/style.css" />
<title>비밀번호 찾기 페이지</title>
</head>
<body>
<div style="float:right"><a href ="loginForm">로그인</a> <a href ="signup">회원가입</a></div>
<h1 style="color:pink"><a href="mainPage">쩜오 0.5</a></h1>

 <div class="dropdown">
      <button class="dropbtn">사이트 안내</button>
      <div class="dropdown-content">
        <a href="service">서비스 안내</a>
        <a href="#">멤버쉽 안내</a>
      </div>
    </div>
     <div class="dropdown">
      <button class="dropbtn">결제 관련 메뉴</button>
      <div class="dropdown-content">
        <a href="#">결제 안내</a>
        <a href="#">멤버쉽 구매</a>
      </div>
    </div>
      <div class="dropdown">
      <button class="dropbtn">매칭 관련 메뉴</button>
      <div class="dropdown-content">
        <a href="#">이상형 리스트</a>
        <a href="#">매칭 현환</a>
      </div>
    </div>
      <div class="dropdown">
      <button class="dropbtn">게시판 관련 메뉴</button>
      <div class="dropdown-content">
        <a href="#">공지사항</a>
        <a href="#">매칭 후기</a>
        <a href="#">Q & A</a>
      </div>
    </div>
	<form action="/pwForGot" method="post">
		<p>아이디 : <input type="text" name = "id" size="13"></p>
		<p>연락처 : <input type="text" name = "phoneNum" size="13"></p>
		<input type="submit" value="확인">
		<input type="button" value="메인페이지이동" onclick="location.href='/'">
	</form>
	
	<c:if test="${ pwSearchOk.password == null}">
		<script type="text/javascript">
			alert('일치하는 비밀번호가 없습니다.');
		</script>
	</c:if>
	<c:if test="${ pwSearchOk.password != null }">
		<p>찾으시는 비밀번호는</p>
		<p>${pwSearchOk.password}</p>
		<p>입니다</p>
	</c:if>
	
</body>
</html>