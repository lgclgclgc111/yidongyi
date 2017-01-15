package com.sectong.entity;

import java.sql.Time;

public class Attendance
{
	private Integer StudentNumber;
	private String StudentName;
	private Time QrcodeInfo;

	public Integer getStudentNumber()
	{
		return StudentNumber;
	}

	public void setStudentNumber(Integer studentNumber)
	{
		StudentNumber = studentNumber;
	}

	public String getStudentName()
	{
		return StudentName;
	}

	public void setStudentName(String studentName)
	{
		StudentName = studentName;
	}

	public Time getQrcodeInfo()
	{
		return QrcodeInfo;
	}

	public void setQrcodeInfo(Time qrcodeInfo)
	{
		QrcodeInfo = qrcodeInfo;
	}

}
