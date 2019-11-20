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
	<h3>인사관리 퇴사처리 화면</h3>
	<hr/>
	<form action="RemovePersonnelServlet" method="post">
		<fieldset>
			<legend>인사관리 사원정보 변경</legend>
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
					<td colspan="2">
						<input type="submit" class="button" value="삭제">
						<input type="button" class="button" value="취소" onclick="location.href='index.jsp'">
					</td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>