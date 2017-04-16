package com.sectong.entity;

public class StudentLogin
{
	private Integer StudentID;
	private String StudentName;
	private Integer StudentNumber;
	private String Sex;
	private Integer ClassID;
	private String ClassName;
	private Integer facultyID;
	private String FacultyName;

	public Integer getStudentID()
	{
		return StudentID;
	}

	public void setStudentID(Integer studentID)
	{
		StudentID = studentID;
	}

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

	public String getSex()
	{
		return Sex;
	}

	public void setSex(String sex)
	{
		Sex = sex;
	}

	public Integer getClassID()
	{
		return ClassID;
	}

	public void setClassID(Integer classID)
	{
		ClassID = classID;
	}

	public String getClassName()
	{
		return ClassName;
	}

	public void setClassName(String className)
	{
		ClassName = className;
	}

	public Integer getFacultyID()
	{
		return facultyID;
	}

	public void setFacultyID(Integer facultyID)
	{
		this.facultyID = facultyID;
	}

	public String getFacultyName()
	{
		return FacultyName;
	}

	public void setFacultyName(String facultyName)
	{
		FacultyName = facultyName;
	}

}
