package com.deloitte.studentmark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.studentmark.bean.StudentInfo;
import com.deloitte.studentmark.dao.StudentDao;


@Controller
public class StudentController {
	@Autowired
	StudentDao dao;
	@RequestMapping("/homesubmit")
	public ModelAndView viewStudent(){
	ModelAndView mav = new ModelAndView();
		List<StudentInfo> stdlist = dao.getStudents();
		/*String id_list[] = new String[stdlist.size()];
		for(int i = 0; i< stdlist.size(); i++)
		{
			id_list[i] = stdlist.get(i).getStudent_id();
		}*/
			
		mav.addObject("list",stdlist);
		mav.setViewName("Home");
		return mav;
	}
}
