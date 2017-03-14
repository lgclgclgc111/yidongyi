package com.sectong.entity;

public class Sys_users
{
	private String jobIDorstudentID;
	private String Password;
	private String name;
	private String role;

	public String getJobIDorstudentID()
	{
		return jobIDorstudentID;
	}

	public void setJobIDorstudentID(String jobIDorstudentID)
	{
		this.jobIDorstudentID = jobIDorstudentID;
	}

	public String getPassword()
	{
		return Password;
	}

	public void setPassword(String password)
	{
		Password = password;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getRole()
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}

}
