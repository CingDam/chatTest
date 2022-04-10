package kr.ac.kopo.chatTest.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
@RequestMapping("/handler")
public class chatHandler extends TextWebSocketHandler{
  
	private List<WebSocketSession> sessionList = new ArrayList<WebSocketSession>(); //웹소킷 세션 사용 코드
	
	private static Logger logger = LoggerFactory.getLogger(chatHandler.class);
	
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		sessionList.add(session);
		logger.info("{}연결됨",session.getId());
	} //session이 웹소켓에 연결된 상태에서 실행되는 메소드
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		logger.info("{}로 부터 {}받음",session.getId(), message.getPayload());
		for (WebSocketSession sess : sessionList) {
			sess.sendMessage(new TextMessage(message.getPayload()));
		}
	}//session이 보내는 메세지를 보여주는 로그 메소드
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		sessionList.remove(session);
		logger.info("{}연결 끊김", session.getId());
	}//session이 웹소켓과 연결이 끊긴 경우
	
	
}
