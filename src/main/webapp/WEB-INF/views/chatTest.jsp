<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" 
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" 
	crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.0/sockjs.min.js" 
	integrity="sha512-ksHM9XpigYGeRdXZfI4GddPsUjmLj6zd1MCNXL4fsfDwp1G+u6hC73uwDjlpjdX4tbEtj/N1AWkLo6WjDwQkyA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<h3>채팅 테스트</h3>
	<div id="userId">${sessionScope.member.userId }</div>
	<input type="text" id="message" />
	<input type="button" id="sendBtn" value="Send"/>
	<input type="button" id="disConBtn" value="Disconnect"/>
	
	<div id="messageArea"></div>
	
<script src="js/chat.js"></script>
</body>
</html>