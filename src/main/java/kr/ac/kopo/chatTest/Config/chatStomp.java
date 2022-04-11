package kr.ac.kopo.chatTest.Config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;


@Configuration
@EnableWebSocketMessageBroker
public class chatStomp implements WebSocketMessageBrokerConfigurer{
	 @Override
	    public void registerStompEndpoints(StompEndpointRegistry registry) {
	        registry.addEndpoint("/stomp/chat")
	                .setAllowedOrigins("http://localhost:8080")
	                .withSockJS();
	    }

	    /*어플리케이션 내부에서 사용할 path를 지정할 수 있음*/
	    @Override
	    public void configureMessageBroker(MessageBrokerRegistry registry) {
	        registry.setApplicationDestinationPrefixes("/pub");
	        registry.enableSimpleBroker("/sub");
	    }

		@Override
		public void configureWebSocketTransport(WebSocketTransportRegistration registry) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void configureClientInboundChannel(ChannelRegistration registration) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void configureClientOutboundChannel(ChannelRegistration registration) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean configureMessageConverters(List<MessageConverter> messageConverters) {
			// TODO Auto-generated method stub
			return false;
		}
	
}
