<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<h3>인사관리시스템</h3>
	<fieldset class="main_menu">
		<legend>인사관리 메인메뉴</legend>
		<input type="button" value="조회" class="button" onclick="location.href='./searchPersonnel.jsp'">
		<input type="button" value="사원등록" class="button" onclick="location.href='./signPersonnel.jsp'">
		<input type="button" value="정보변경" class="button" onclick="location.href='updatePersonnel.jsp'">
		<br/>
		<input type="button" value="퇴사처리" class="button" onclick="location.href='removePersonnel.jsp'">
		<input type="button" value="종료" class="button" onclick="window.close()">			
	</fieldset>
</body>
</html>