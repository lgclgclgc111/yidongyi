package entity;

public class CIDResult
{
	private Integer ClassroomId;
	private String QrcodeInfo;
	private Integer rtn;

	public Integer getClassroomId()
	{
		return ClassroomId;
	}

	public void setClassroomId(Integer classroomId)
	{
		ClassroomId = classroomId;
	}

	public String getQrcodeInfo()
	{
		return QrcodeInfo;
	}

	public void setQrcodeInfo(String qrcodeInfo)
	{
		QrcodeInfo = qrcodeInfo;
	}

	public Integer getRtn()
	{
		return rtn;
	}

	public void setRtn(Integer rtn)
	{
		this.rtn = rtn;
	}

}
