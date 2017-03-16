package com.sectong.entity;

import java.sql.Date;
import java.sql.Time;

public class TeacherLogin
{
	private Integer CurriculumId;
	private String TeacherJobID;
	private String TeacherName;
	private Integer CourseID;
	private Integer WeekDay;
	private Integer Section;
	private String ClassName;
	private Date CurriculumStartDate;
	private Date CurriculumEndDate;
	private String CourseName;
	private Integer FacultyId;
	private String FacultyName;
	private Time StratTime;
	private Time EndTime;

	public Integer getCurriculumId()
	{
		return CurriculumId;
	}

	public void setCurriculumId(Integer curriculumId)
	{
		CurriculumId = curriculumId;
	}

	public String getTeacherJobID()
	{
		return TeacherJobID;
	}

	public void setTeacherJobID(String teacherJobID)
	{
		TeacherJobID = teacherJobID;
	}

	public String getTeacherName()
	{
		return TeacherName;
	}

	public void setTeacherName(String teacherName)
	{
		TeacherName = teacherName;
	}

	public Integer getCourseID()
	{
		return CourseID;
	}

	public void setCourseID(Integer courseID)
	{
		CourseID = courseID;
	}

	public Integer getWeekDay()
	{
		return WeekDay;
	}

	public void setWeekDay(Integer weekDay)
	{
		WeekDay = weekDay;
	}

	public Integer getSection()
	{
		return Section;
	}

	public void setSection(Integer section)
	{
		Section = section;
	}

	public String getClassName()
	{
		return ClassName;
	}

	public void setClassName(String className)
	{
		ClassName = className;
	}

	public Date getCurriculumStartDate()
	{
		return CurriculumStartDate;
	}

	public void setCurriculumStartDate(Date curriculumStartDate)
	{
		CurriculumStartDate = curriculumStartDate;
	}

	public Date getCurriculumEndDate()
	{
		return CurriculumEndDate;
	}

	public void setCurriculumEndDate(Date curriculumEndDate)
	{
		CurriculumEndDate = curriculumEndDate;
	}

	public String getCourseName()
	{
		return CourseName;
	}

	public void setCourseName(String courseName)
	{
		CourseName = courseName;
	}

	public Integer getFacultyId()
	{
		return FacultyId;
	}

	public void setFacultyId(Integer facultyId)
	{
		FacultyId = facultyId;
	}

	public String getFacultyName()
	{
		return FacultyName;
	}

	public void setFacultyName(String facultyName)
	{
		FacultyName = facultyName;
	}

	public Time getStratTime()
	{
		return StratTime;
	}

	public void setStratTime(Time stratTime)
	{
		StratTime = stratTime;
	}

	public Time getEndTime()
	{
		return EndTime;
	}

	public void setEndTime(Time endTime)
	{
		EndTime = endTime;
	}
}
