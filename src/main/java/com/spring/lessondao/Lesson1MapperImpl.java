package com.spring.lessondao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.lesson1vo.Lesson1VO;

@Repository
public class Lesson1MapperImpl implements Lesson1Mapper{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="com.spring.lesson1dao.Lesson1Mapper";

	@Override
	public List<Lesson1VO> listLesson1(Lesson1VO param) {
		return sqlSession.selectList(namespace + ".listLesson1",param);
	}

	@Override
	public Lesson1VO selectLesson1(int no) {
		return sqlSession.selectOne(namespace + ".selectLesson1",no);
	}

	@Override
	public int insertLesson1(Lesson1VO param) {
		return sqlSession.insert(namespace + ".insertLesson1",param);
	}

	@Override
	public int updateLesson1(Lesson1VO param) {
		return sqlSession.update(namespace + ".updateLesson1",param);
	}

	@Override
	public int deleteLesson1(int no) {
		return sqlSession.delete(namespace + ".deleteLesson1",no);
	}
	
	

}
