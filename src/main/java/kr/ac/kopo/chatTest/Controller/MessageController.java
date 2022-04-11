package kr.ac.kopo.chatTest.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import kr.ac.kopo.chatTest.model.ChatMessage;

@Controller
public class MessageController {
	private SimpMessagingTemplate template;
	
	@MessageMapping(value = "/chat/enter")
	public void enter(ChatMessage message) {
		message.setMessageContents(message.getUserCode()+"님이 채팅방에 참여하였습니다.");
		template.convertAndSend("/sub/chat/room/"+ message.getRoomCode(),message);
	}
	
	@MessageMapping(value = "/chat/message")
	public void message(ChatMessage message) {
		template.convertAndSend("/sub/chat/room/" + message.getRoomCode(), message);
	}
}
