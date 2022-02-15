package com.date.jum5.user.review.dao;

import java.util.List;
import java.util.Map;

import com.date.jum5.user.review.vo.Criteria;
import com.date.jum5.user.review.vo.ReviewVo;

public interface ReviewDAO {
	
	//게시글 조회
	public List<ReviewVo> list(Criteria cri) throws Exception;
	
	//게시글 총 갯수
	public int listCount() throws Exception;
	
	//게시글 seq 맥스
	Integer getMaxSeq();
	
	//게시글 등록
	int reviewWriting(ReviewVo vo);
	
	// 조회수 증가
	public void updateReadCount(int seq);
	
	//게시글 보기
	public ReviewVo view(int seq);
	
	//게시글 수정
	int update(ReviewVo vo);
	
	//게시글 삭제
	int delete(int seq);
	
	//첨부파일 업로드
	public void insertFile(Map<String, Object>map) throws Exception;
	
	//첨부파일 조회
	public List<Map<String , Object>> selectFileList(int seq) throws Exception ;
	
	//첨부파일 다운로드
	public Map<String , Object> selectFileInfo(Map<String , Object> map) throws Exception;
}
