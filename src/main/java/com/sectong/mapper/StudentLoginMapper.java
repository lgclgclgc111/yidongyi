package com.sectong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentLoginMapper
{
	List<com.sectong.entity.StudentLogin> selectByStudentID(Integer id);

	List<com.sectong.entity.StudentLogin> StudentqueryAll();

	List<com.sectong.entity.StudentName> selectByClassName(String classname);

	List<com.sectong.entity.Attendance> selectStudentNameByQrcodeInfo(String QrcodeInfo);
}
