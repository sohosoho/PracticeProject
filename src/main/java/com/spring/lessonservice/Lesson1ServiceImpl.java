package com.spring.lessonservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.lesson1vo.Lesson1VO;
import com.spring.lessondao.Lesson1Mapper;

@Service
@Transactional
public class Lesson1ServiceImpl implements Lesson1Service{
	
	@Autowired
	private Lesson1Mapper lesson1Mapper;
	
	@Override
	public List<Lesson1VO> listLesson1(Lesson1VO param) {
		List<Lesson1VO>list=new ArrayList<Lesson1VO>();
		list=lesson1Mapper.listLesson1(param);
		return list;
	}

	@Override
	public Lesson1VO selectLesson1(int no) {
		return lesson1Mapper.selectLesson1(no);
	}

	@Override
	public int insertLesson1(Lesson1VO param) {
		return lesson1Mapper.insertLesson1(param);
	}

	@Override
	public int updateLesson1(Lesson1VO param) {
		return lesson1Mapper.updateLesson1(param);
	}

	@Override
	public int deleteLesson1(int no) {
		return lesson1Mapper.deleteLesson1(no);
	}

}
