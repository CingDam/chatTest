package kr.ac.kopo.chatTest.Dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.chatTest.Service.MemberService;
import kr.ac.kopo.chatTest.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	SqlSession sql;

	@Override
	public Member login(Member member) {
		return sql.selectOne("member.login",member);
	}
}
