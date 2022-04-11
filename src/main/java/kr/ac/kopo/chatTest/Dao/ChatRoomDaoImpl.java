package kr.ac.kopo.chatTest.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.chatTest.model.ChatRoom;

@Repository
public class ChatRoomDaoImpl implements ChatRoomDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<ChatRoom> list() {
		
		return sql.selectList("room.list");
	}

	@Override
	public void add(ChatRoom item) {
		
		sql.insert("room.add", item);

	}

	@Override
	public void delete(int roomCode) {
		
		sql.delete("room.delete", roomCode);

	}

}
