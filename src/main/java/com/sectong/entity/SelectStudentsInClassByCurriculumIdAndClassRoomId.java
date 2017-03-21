package com.sectong.entity;

public class SelectStudentsInClassByCurriculumIdAndClassRoomId
{
	private Integer ID;
	private String StudentNumber;
	private String StudentName;
	private String Sex;
	private String RecordDateTime;
	private Integer ClassRoomId;
	private Integer CurriculumId;
	private String Status;

	public Integer getID()
	{
		return ID;
	}

	public void setID(Integer iD)
	{
		ID = iD;
	}

	public String getStatus()
	{
		return Status;
	}

	public void setStatus(String status)
	{
		Status = status;
	}

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

	public String getStudentName()
	{
		return StudentName;
	}

	public void setStudentName(String studentName)
	{
		StudentName = studentName;
	}

	public String getSex()
	{
		return Sex;
	}

	public void setSex(String sex)
	{
		Sex = sex;
	}

	public String getRecordDateTime()
	{
		return RecordDateTime;
	}

	public void setRecordDateTime(String recordDateTime)
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
