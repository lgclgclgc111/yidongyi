package com.sectong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Sys_usersMapper
{
	List<com.sectong.entity.Sys_users> selectByjobIDorstudentID(String jobIDorstudentID);
}
