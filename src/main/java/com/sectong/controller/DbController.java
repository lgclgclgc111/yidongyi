package com.sectong.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.CIDResult;

@RestController
@RequestMapping("/ControllerTest")
public class DbController
{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/getUsers")
	public List<Map<String, Object>> getDbType()
	{
		String sql = "select * from yw_students";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> map : list)
		{
			Set<Entry<String, Object>> entries = map.entrySet();
			if (entries != null)
			{
				Iterator<Entry<String, Object>> iterator = entries.iterator();
				while (iterator.hasNext())
				{
					Entry<String, Object> entry = (Entry<String, Object>) iterator.next();
					Object key = entry.getKey();
					Object value = entry.getValue();
					System.out.println(key + ":" + value);
				}
			}
		}
		return list;
	}

	// 调用存储过程相关
	@RequestMapping("/CreateClassRoomByCurriculumId/{CurriculumId}")
	public CIDResult test(@PathVariable Integer CurriculumId) throws SQLException
	{
		CIDResult cidResult = new CIDResult();
		DataSource dataSource = jdbcTemplate.getDataSource();
		Connection conn = null;
		// Map ddMap = new HashMap();
		conn = dataSource.getConnection();
		CallableStatement cs = conn.prepareCall("{CALL CreateClassRoomByCurriculumId(?,?,?,?)}");
		cs.setInt(1, CurriculumId);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.registerOutParameter(4, Types.INTEGER);
		cs.execute();

		// 把结果放进一个实体里面,直接输出为Json格式
		cidResult.setClassroomId(cs.getInt(2));
		cidResult.setQrcodeInfo(cs.getString(3));
		cidResult.setRtn(cs.getInt(4));

		return cidResult;
	}

	@RequestMapping("/user/{id}")
	public Map<String, Object> getUser(@PathVariable String id)
	{
		Map<String, Object> map = null;

		List<Map<String, Object>> list = getDbType();

		for (Map<String, Object> dbmap : list)
		{

			Set<String> set = dbmap.keySet();

			for (String key : set)
			{
				if (key.equals(id))
				{
					if (dbmap.get(key).equals(id))
					{
						map = dbmap;
					}
				}
			}
		}

		if (map == null)
			map = list.get(Integer.valueOf(id).intValue());
		return map;
	}

	@RequestMapping(value = "/home")
	public String home()
	{
		return "This is a test message!";
	}
}
