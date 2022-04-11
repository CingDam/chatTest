<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>채팅방 목록</h3>
		<div>${sessionScope.member.userId }님</div>
	<table border="1">
		<thead>
			<tr>
				<th>채팅방 번호</th>
				<th>채팅방 이름</th>
				<th>관리</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${list.size() < 1}">
				<tr>
					<td colspan="3">개설된 채팅방이 없습니다</td>
				</tr>
			</c:if>
			<c:forEach var="item" items="${list }">
				<tr>
					<td>${item.roomCode }</td>
					<td>${item.roomName }</td>
					<td><a href="delete/${item.roomCode}">삭제</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a href ="add">채팅방 생성</a>
	</div>
</body>
</html>