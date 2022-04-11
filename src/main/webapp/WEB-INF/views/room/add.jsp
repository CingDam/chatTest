<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>${sessionScope.member.userId }님</div>
	<form method="post">
		<label>채팅방 이름</label>
		<input type="text" name="roomName">
		<label>개설자</label>
		<input type="text" name="userCode" value="${sessionScope.member.userCode }">
		<button>등록</button>
	</form>
</body>
</html>