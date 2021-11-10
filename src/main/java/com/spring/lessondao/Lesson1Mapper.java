package com.spring.lessondao;

import java.util.List;

import com.spring.lesson1vo.Lesson1VO;

public interface Lesson1Mapper {
	public List<Lesson1VO>listLesson1(Lesson1VO param);
	public Lesson1VO selectLesson1(int no);
	public int insertLesson1(Lesson1VO param);
	public int updateLesson1(Lesson1VO param);
	public int deleteLesson1(int no);
}
