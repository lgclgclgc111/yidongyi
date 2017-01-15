package com.sectong.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sectong.entity.CinfoResult;
import com.sectong.entity.Sys_users;

import entity.CIDResult;

@RestController
@RequestMapping("/Controller")
public class LoginController
{
	@Autowired
	com.sectong.mapper.TeacherLoginMapper Teachermapper;
	@Autowired
	com.sectong.mapper.StudentLoginMapper Studentmapper;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * Teacher区域
	 */

	@RequestMapping(value = "/selectByJobID")
	@ResponseBody
	public List<com.sectong.entity.TeacherLogin> selectByJobID(HttpSession httpSession)
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			Sys_users sys_users = (Sys_users) httpSession.getAttribute("usermanager");
			Integer integer = sys_users.getJobIDorstudentID();
			return Teachermapper.selectByJobID(integer);
		} else
			return null;
	}

	// 返回一个学生名字列表
	@RequestMapping(value = "/selectByClassName/{ClassName}")
	@ResponseBody
	public List<com.sectong.entity.StudentName> selectByClassName(@PathVariable String ClassName, HttpSession httpSession)
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			return Studentmapper.selectByClassName(ClassName);
		} else
			return null;
	}

	@RequestMapping(value = "/TeacherqueryAll")
	@ResponseBody
	public List<com.sectong.entity.TeacherLogin> TeacherqueryAll()
	{
		return Teachermapper.TeacherqueryAll();
	}

	@RequestMapping(value = "/selectByJobID_Today")
	@ResponseBody
	public List<com.sectong.entity.TeacherLogin> selectByJobID_Today(HttpSession httpSession)
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			Sys_users sys_users = (Sys_users) httpSession.getAttribute("usermanager");
			Integer integer = sys_users.getJobIDorstudentID();
			Integer weekday = com.sectong.communal.Communal.getWeekday();
			return Teachermapper.selectByJobIDWeekday(integer, weekday);
		} else
			return null;

	}

	@RequestMapping(value = "/selectByJobID_Weekday/{WeekDay}")
	@ResponseBody
	public List<com.sectong.entity.TeacherLogin> selectByJobID_Weekday(@PathVariable Integer WeekDay, HttpSession httpSession)
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			Sys_users sys_users = (Sys_users) httpSession.getAttribute("usermanager");
			Integer integer = sys_users.getJobIDorstudentID();
			return Teachermapper.selectByJobIDWeekday(integer, WeekDay);
		} else
			return null;
	}

	@RequestMapping(value = "/selectByJobID_Weekday_Section/{WeekDay}&{Section}")
	@ResponseBody
	public List<com.sectong.entity.TeacherLogin> selectByJobIDWeekdaySection(@PathVariable Integer WeekDay, @PathVariable Integer Section,
			HttpSession httpSession)
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			Sys_users sys_users = (Sys_users) httpSession.getAttribute("usermanager");
			Integer integer = sys_users.getJobIDorstudentID();
			return Teachermapper.selectByJobIDWeekdaySection(integer, WeekDay, Section);
		} else
			return null;
	}

	@RequestMapping(value = "/selectByCurriculumId/{CurriculumId}")
	@ResponseBody
	public List<com.sectong.entity.TeacherLogin> selectByCurriculumId(@PathVariable Integer CurriculumId)
	{
		return Teachermapper.selectByCurriculumId(CurriculumId);
	}

	/*
	 * Student区域
	 */
	@RequestMapping(value = "/selectByStudentID")
	@ResponseBody
	public List<com.sectong.entity.StudentLogin> selectByStudentID(HttpSession httpSession)
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			Sys_users sys_users = (Sys_users) httpSession.getAttribute("usermanager");
			Integer integer = sys_users.getJobIDorstudentID();
			return Studentmapper.selectByStudentID(integer);
		} else
			return null;
	}

	@RequestMapping(value = "/StudentqueryAll")
	@ResponseBody
	public List<com.sectong.entity.StudentLogin> StudentqueryAll()
	{
		return Studentmapper.StudentqueryAll();
	}

	/*
	 * 存储过程相关区域
	 * 
	 */
	@RequestMapping("/CreateClassRoomByCurriculumId/{CurriculumId}")
	public CIDResult test(@PathVariable Integer CurriculumId) throws SQLException
	{
		CIDResult cidResult = new CIDResult();
		DataSource dataSource = jdbcTemplate.getDataSource();
		Connection conn = null;
		// Map ddMap = new HashMap();
		conn = dataSource.getConnection();
		CallableStatement cs = conn.prepareCall("{CALL CreateClassRoomByCurriculumId(?,?,?,?)}");
		cs.setInt(1, CurriculumId);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.registerOutParameter(4, Types.INTEGER);
		cs.execute();

		// 把结果放进一个实体里面,直接输出为Json格式
		cidResult.setClassroomId(cs.getInt(2));
		cidResult.setQrcodeInfo(cs.getString(3));
		cidResult.setRtn(cs.getInt(4));

		return cidResult;
	}

	@RequestMapping("/CreateAttendanceByQrcodeInfo/{QrcodeInfo}/{StudentNumber}")
	public CinfoResult test(@PathVariable String QrcodeInfo, @PathVariable Integer StudentNumber) throws SQLException
	{
		CinfoResult cinfoResult = new CinfoResult();
		DataSource dataSource = jdbcTemplate.getDataSource();
		Connection conn = null;
		conn = dataSource.getConnection();
		CallableStatement cs = conn.prepareCall("{CALL CreateAttendanceByQrcodeInfo(?,?,?)}");
		cs.setString(1, QrcodeInfo);
		cs.setInt(2, StudentNumber);
		cs.registerOutParameter(3, Types.INTEGER);
		cs.execute();

		// 把结果放进一个实体里面,直接输出为Json格式
		cinfoResult.setRtn(cs.getInt(3));
		return cinfoResult;
	}

	// 另外添加的方法

	@RequestMapping("/selectStudentNameByQrcodeInfo/{QrcodeInfo}")
	public List<com.sectong.entity.Attendance> ByQrcodeInfo(@PathVariable String QrcodeInfo, HttpSession httpSession) throws SQLException
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			return Studentmapper.selectStudentNameByQrcodeInfo(QrcodeInfo);
		} else
			return null;
	}

	/*
	 * 通过ClassRoomId查询这个班级的学生哪个在班里哪个签到了
	 */
	@RequestMapping("/SelectStudentsInClassByCurriculumId/{CurriculumId}")
	public List<com.sectong.entity.SelectStudentsInClassByCurriculumId> ByClassRoomId(@PathVariable Integer CurriculumId, HttpSession httpSession)
			throws SQLException
	{
		if ((Sys_users) httpSession.getAttribute("usermanager") != null)
		{
			return Teachermapper.SelectStudentsInClassByCurriculumId(CurriculumId);
		} else
			return null;
	}

}