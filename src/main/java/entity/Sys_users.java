package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_users")
public class Sys_users
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "jobIDorstudentID", nullable = false, length = 30)
	private String jobIDorstudentID;

	@Column(name = "passward", nullable = false, length = 10)
	private int passward;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getJobIDorstudentID()
	{
		return jobIDorstudentID;
	}

	public void setJobIDorstudentID(String jobIDorstudentID)
	{
		this.jobIDorstudentID = jobIDorstudentID;
	}

	public int getPassward()
	{
		return passward;
	}

	public void setPassward(int passward)
	{
		this.passward = passward;
	}

}
