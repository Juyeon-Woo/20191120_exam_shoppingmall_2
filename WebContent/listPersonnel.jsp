<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="personnel.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="./css/style.css">
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");
String dept = request.getParameter("dept");
String type = request.getParameter("search");
PersonnelMgr psn_dao = PersonnelMgr.getInstance();
ArrayList<PersonnelBean> personnel = psn_dao.searchPersonnel(id, dept, type);
%>
	<h3>직원 정보 조회 결과</h3>
	<hr/>
	<table border="1">
		<tr>
			<td>성명</td>
			<td>사번</td>
			<td>직급</td>
			<td>직책</td>
			<td>연락처</td>
			<td>소속부서</td>
		</tr>
		<%
		for(PersonnelBean psn : personnel) {
		%>
		<tr>
			<td><%=psn.getName() %></td>
			<td><%=psn.getId() %></td>
			<td><%=psn.getPosition() %></td>
			<td><%=psn.getDuty() %></td>
			<td><%=psn.getPhone() %></td>
			<td><%=psn.getDept() %></td>
		</tr>
		<%}%>
	</table>
	<br/><br/>
	<input type="button" value="확인" class="button" onclick="location.href='index.jsp'">
</body>
</html>