package com.sectong.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CheckVersion")
public class CheckVersion
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/APP")
	public String home()
	{
		String sql = "SELECT version.type, version.version, version.path FROM version WHERE version.type='app'";
		Map<String, Object> appversion = jdbcTemplate.queryForMap(sql);
		String result = appversion.get("version").toString();
		return result;
	}

	@RequestMapping(value = "/UpdatePath")
	public String path()
	{
		String sql = "SELECT version.type, version.version, version.path FROM version WHERE version.type='app'";
		Map<String, Object> appversion = jdbcTemplate.queryForMap(sql);
		String result = appversion.get("path").toString();
		return result;
	}
}
