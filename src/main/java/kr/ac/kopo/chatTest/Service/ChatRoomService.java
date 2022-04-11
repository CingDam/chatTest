package kr.ac.kopo.chatTest.Service;

import java.util.List;

import kr.ac.kopo.chatTest.model.ChatRoom;

public interface ChatRoomService {

	List<ChatRoom> list();

	void add(ChatRoom item);

	void delete(int roomCode);

}
