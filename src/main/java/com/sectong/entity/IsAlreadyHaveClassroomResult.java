package com.sectong.entity;

public class IsAlreadyHaveClassroomResult
{
	private Integer ClassRoomId;
	private Integer CurriculumId;
	private String QrcodeInfo;

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

	public String getQrcodeInfo()
	{
		return QrcodeInfo;
	}

	public void setQrcodeInfo(String qrcodeInfo)
	{
		QrcodeInfo = qrcodeInfo;
	}

}
