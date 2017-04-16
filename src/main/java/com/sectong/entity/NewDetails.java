package com.sectong.entity;

import java.sql.Time;

public class NewDetails
{
	private Integer id;
	private String content;
	private Time datetime;
	private String img;
	private String title;
	private Integer user_id;
	private String secondarytitle;
	private String readerlevel;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Time getDatetime()
	{
		return datetime;
	}

	public void setDatetime(Time datetime)
	{
		this.datetime = datetime;
	}

	public String getImg()
	{
		return img;
	}

	public void setImg(String img)
	{
		this.img = img;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Integer getUser_id()
	{
		return user_id;
	}

	public void setUser_id(Integer user_id)
	{
		this.user_id = user_id;
	}

	public String getSecondarytitle()
	{
		return secondarytitle;
	}

	public void setSecondarytitle(String secondarytitle)
	{
		this.secondarytitle = secondarytitle;
	}

	public String getReaderlevel()
	{
		return readerlevel;
	}

	public void setReaderlevel(String readerlevel)
	{
		this.readerlevel = readerlevel;
	}

	@Override
	public String toString()
	{
		return "NewDetails [id=" + id + ", content=" + content + ", datetime=" + datetime + ", img=" + img + ", title=" + title + ", user_id="
				+ user_id + ", secondarytitle=" + secondarytitle + ", readerlevel=" + readerlevel + "]";
	}

}
