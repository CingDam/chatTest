package kr.ac.kopo.chatTest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.chatTest.Dao.MemberDao;
import kr.ac.kopo.chatTest.model.Member;

@Service
public class MemberSerivceImpl implements MemberService {
	
	@Autowired
	MemberDao dao;
	
	@Override
	public boolean login(Member member) {
		
		Member item = dao.login(member);
		
		if(item != null) {
			member.setUserId(item.getUserId());
			member.setUserPw(null);
			
			return true;
		}
		
		return false;
	}

}
