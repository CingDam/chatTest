package kr.ac.kopo.chatTest.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import kr.ac.kopo.chatTest.util.chatHandler;

@Configuration
@EnableWebSocket
public class chatConfig implements WebSocketConfigurer {
	
	private final chatHandler chatHandler = new chatHandler();

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		
		registry.addHandler(chatHandler, "/handler").setAllowedOrigins("*")
		.withSockJS().setClientLibraryUrl("https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.0/sockjs.min.js");
		
	}
	
	
	
	

}
