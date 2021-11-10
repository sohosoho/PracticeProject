package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.lesson1vo.Lesson1VO;
import com.spring.lessonservice.Lesson1Service;

@Controller
@RequestMapping(value="/lesson1")
public class Lesson1Controller {
	private static final String CONTEXT_PATH="lesson1";
	
	@Autowired
	private Lesson1Service lesson1Service;
	
	/* 전체 조회 */
	@RequestMapping("/listLesson1")
	public ModelAndView listLesson1(@ModelAttribute Lesson1VO param) {
		
		List<Lesson1VO>list=lesson1Service.listLesson1(param);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("lesson1List",list);
		mav.addObject("paramName",param.getLname());
		mav.setViewName(CONTEXT_PATH + "/lesson1");
		
		return mav;
	}
	
	/* 상세 정보 보기 */
	@RequestMapping("/selectLesson1")
	public ModelAndView selectLesson1(@RequestParam("no")int no) {
		ModelAndView mav=new ModelAndView();
		if(no==0) {
			mav.addObject("mode","insert");
		}else {
			mav.addObject("lesson1VO",lesson1Service.selectLesson1(no));
			mav.addObject("mode","update");
		}
		mav.setViewName(CONTEXT_PATH + "/lesson1_pop");
		return mav;
	}
	
	/* 레코드 추가 */
	@RequestMapping("/insertLesson1")
	public ModelAndView insertLesson1(@ModelAttribute Lesson1VO param) {
		String resultStr="";
		int result=lesson1Service.insertLesson1(param);
		
		if(result>0)resultStr="등록이 완료되었습니다.";
		else resultStr="등록에 문제가 있어 완료하지 못하였습니다.";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("result",resultStr);
		mav.setViewName("/result");
		
		return mav;
	}
	
	/* 레코드 수정 */
	@RequestMapping("/updateLesson1")
	public ModelAndView updateLesson1(@ModelAttribute Lesson1VO param) {
		String resultStr="";
		int result=lesson1Service.updateLesson1(param);
		
		if(result>0)resultStr="수정이 완료되었습니다.";
		else resultStr="수정에 문제가 있어 완료하지 못하였습니다.";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("result",resultStr);
		mav.setViewName("/result");
		
		return mav;
	
	}
	
	/* 레코드 삭제 */
	@RequestMapping("/deleteLesson1")
	public ModelAndView deleteLesson1(@RequestParam("no")int no) {
		String resultStr="";
		int result=lesson1Service.deleteLesson1(no);
		
		if(result>0)resultStr="삭제가 완료되었습니다.";
		else resultStr="삭제에 문제가 있어 완료하지 못하였습니다.";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("result",resultStr);
		mav.setViewName("/result");
		
		return mav;
	}
	
}
