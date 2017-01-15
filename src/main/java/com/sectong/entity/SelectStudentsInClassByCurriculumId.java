package com.sectong.entity;

public class SelectStudentsInClassByCurriculumId
{
	private String StudentName;
	private Integer StudentNumber;
	private String ClassName;
	private Integer ClassRoomId;
	private Integer CurriculumId;

	public String getStudentName()
	{
		return StudentName;
	}

	public void setStudentName(String studentName)
	{
		StudentName = studentName;
	}

	public Integer getStudentNumber()
	{
		return StudentNumber;
	}

	public void setStudentNumber(Integer studentNumber)
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

	public Integer getClassRoomId()
	{
		return ClassRoomId;
	}

	public void setClassRoomId(Integer classRoomId)
	{
		ClassRoomId = classRoomId;
	}

	public Integer getCurriculumId()
	{
		return CurriculumId;
	}

	public void setCurriculumId(Integer curriculumId)
	{
		CurriculumId = curriculumId;
	}

}
