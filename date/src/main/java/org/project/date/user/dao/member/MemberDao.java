package org.project.date.user.dao.member;

import java.util.List;

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
	
	//마이페이지
	public List<MemberVo> myPage(String id){
		return sqlSessionTemplate.selectList("myPage",id);
	}
	
	//마이페이지 테스트
	public List<MemberVo> list(){
		return sqlSessionTemplate.selectList("list");
	}
	
	//회원 탈퇴 테스트
	public int withdraw() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("withdraw");
	}
	
}
