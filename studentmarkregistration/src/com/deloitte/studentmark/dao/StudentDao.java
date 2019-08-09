package com.deloitte.studentmark.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.deloitte.studentmark.bean.StudentInfo;


@Repository
public class StudentDao {
	@Autowired
	JdbcTemplate template;
	
	public List<StudentInfo> getStudents(){
		String qry = "select * from student";
		List<StudentInfo> stdlist = template.query(qry, 
				new BeanPropertyRowMapper<StudentInfo>(StudentInfo.class));
		return stdlist;
	}
}
