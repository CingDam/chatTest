package kr.ac.kopo.chatTest.Dao;

import java.util.List;

import kr.ac.kopo.chatTest.model.ChatRoom;

public interface ChatRoomDao {

	List<ChatRoom> list();

	void add(ChatRoom item);

	void delete(int roomCode);
	
}
