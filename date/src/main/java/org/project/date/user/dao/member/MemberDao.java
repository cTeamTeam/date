package org.project.date.user.dao.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.project.date.user.vo.member.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public MemberDao(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate=sqlSessionTemplate;
	}
	
	public void registMember(MemberVo member) {
		sqlSessionTemplate.insert("insert", member);
	}
	
	public int idCheck(String id) {
		return sqlSessionTemplate.selectOne("idCheck", id);
	}
	
	public int nickNameCheck(String nickName) {
		return sqlSessionTemplate.selectOne("nickNameCheck", nickName);
	}
	
	public int emailCheck(String email) {
		return sqlSessionTemplate.selectOne("emailCheck", email);
	}
}
