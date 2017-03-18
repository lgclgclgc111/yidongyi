package com.sectong.entity;

import java.sql.Time;

public class SelectStudentsInClassByCurriculumIdAndClassRoomId
{
	private String StudentNumber;
	private String ClassName;
	private String Sex;
	private Time RecordDateTime;
	private Integer ClassRoomId;
	private Integer CurriculumId;

	public Integer getCurriculumId()
	{
		return CurriculumId;
	}

	public void setCurriculumId(Integer curriculumId)
	{
		CurriculumId = curriculumId;
	}

	public String getStudentNumber()
	{
		return StudentNumber;
	}

	public void setStudentNumber(String studentNumber)
	{
		StudentNumber = studentNumber;
	}

	public String getClassName()
	{
		return ClassName;
	}

	public void setClassName(String className)
	{
		ClassName = className;
	}

	public String getSex()
	{
		return Sex;
	}

	public void setSex(String sex)
	{
		Sex = sex;
	}

	public Time getRecordDateTime()
	{
		return RecordDateTime;
	}

	public void setRecordDateTime(Time recordDateTime)
	{
		RecordDateTime = recordDateTime;
	}

	public Integer getClassRoomId()
	{
		return ClassRoomId;
	}

	public void setClassRoomId(Integer classRoomId)
	{
		ClassRoomId = classRoomId;
	}

}
