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
	<h3>인사관리조회화면</h3>
	<form action="./listPersonnel.jsp" method="get">
		<fieldset>
			<legend>인사관리 조회</legend>
			<input type="radio" name="search" checked="checked" value="y">사원번호로 조회&nbsp;<input type="text" name="id" id="id"><br/>
			<input type="radio" name="search" value="n">부서명으로 조회
			<select name="dept" id="dept">
				<option value="인사부">인사부</option>
				<option value="기획부">기획부</option>
				<option value="홍보부">홍보부</option>
				<option value="영업부">영업부</option>
				<option value="경리부">경리부</option>
			</select>
			<br/>
			<input type="submit" value="조회" class="button">
			<input type="button" value="취소" class="button" onclick="location.href='./index.jsp'">
		</fieldset>
	</form>
</body>
</html>