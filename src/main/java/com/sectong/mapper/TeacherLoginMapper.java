package com.sectong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherLoginMapper
{
	List<com.sectong.entity.TeacherLogin> selectByJobID(String integer);

	List<com.sectong.entity.TeacherLogin> TeacherqueryAll();

	List<com.sectong.entity.TeacherLogin> selectByJobIDWeekday(String integer, Integer Weekday);

	List<com.sectong.entity.TeacherLogin> selectByJobIDWeekdaySection(String id, Integer Weekday, Integer Section);

	List<com.sectong.entity.TeacherLogin> selectByCurriculumId(Integer CurriculumId);

	List<com.sectong.entity.SelectStudentsInClassByCurriculumIdAndClassRoomId> SelectStudentsInClassByCurriculumIdAndClassRoomId(Integer CurriculumId,
			Integer ClassRoomId);

	List<com.sectong.entity.IsAlreadyHaveClassroomResult> IsAlreadyHaveClassroomResult(Integer CurriculumId);

	List<com.sectong.entity.NewDetails> SqlNewDetails(Integer id);

}
