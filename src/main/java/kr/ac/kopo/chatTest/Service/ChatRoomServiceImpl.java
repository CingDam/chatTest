package kr.ac.kopo.chatTest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.chatTest.Dao.ChatRoomDao;
import kr.ac.kopo.chatTest.model.ChatRoom;

@Service
public class ChatRoomServiceImpl implements ChatRoomService{
	
	@Autowired
	ChatRoomDao dao;

	@Override
	public List<ChatRoom> list() {
		
		return dao.list();
	}

	@Override
	public void add(ChatRoom item) {
		
		dao.add(item);
		
	}

	@Override
	public void delete(int roomCode) {
		dao.delete(roomCode);
		
	}

}
