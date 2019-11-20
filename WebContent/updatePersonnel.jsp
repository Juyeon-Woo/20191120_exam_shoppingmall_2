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
	<h3>인사관리 사원정보 변경화면</h3>
	<hr/>
	<form action="UpdatePersonnelServlet" method="post">
		<fieldset>
			<table>
				<tr>
					<td>성명</td>
					<td>
					: <input type="text" name="name">
					</td>
				</tr>
				<tr>
					<td>사원번호</td>
					<td>
					: <input type="text" name="id">
					</td>
				</tr>
				<tr>
					<td>소속부서</td>
					<td>
					: <select name="dept">
						<option value="인사부">인사부</option>
						<option value="기획부">기획부</option>
						<option value="홍보부">홍보부</option>
						<option value="영업부">영업부</option>
						<option value="경리부">경리부</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>직급</td>
					<td>
					: <select name="position">
						<option value="1">1급</option>
						<option value="2">2급</option>
						<option value="3">3급</option>
						<option value="4">4급</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>직책</td>
					<td>
					: <input type="text" name="duty">
					</td>
				</tr>
				<tr>
					<td>연락처</td>
					<td>
					: <input type="text" name="phone">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" class="button" value="변경">
						<input type="button" class="button" value="취소" onclick="location.href='index.jsp'">
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>