package com.sectong.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sectong.message.Message;

@RestController
@RequestMapping("/FrontDesk")
public class FrontDeskLogin
{
	private Message message = new Message();

	@Autowired
	com.sectong.mapper.Sys_usersMapper sys_usersMapper;

	@RequestMapping(value = "/Login={jobIDorstudentID}&{passward}")
	@ResponseBody
	public ResponseEntity<Message> Login(@PathVariable String jobIDorstudentID, @PathVariable String passward, HttpSession httpSession)
	{
		List<com.sectong.entity.Sys_users> usermanager = sys_usersMapper.selectByjobIDorstudentID(jobIDorstudentID);

		if (!usermanager.isEmpty())
		{
			
			System.out.println(usermanager.get(0).getId());
			System.out.println(usermanager.get(0).getJobIDorstudentID());
			System.out.println(usermanager.get(0).getPassward());
			
			if (usermanager.get(0).getPassward().equals(passward))
			{
				System.out.println(passward+"第二疵");
				httpSession.setAttribute("usermanager", usermanager.get(0));
				System.out.println(usermanager.get(0).getJobIDorstudentID()+"登陆成功！");
				message.setMsg(1, "用户登录成功", usermanager);
			} else
				message.setMsg(0, "用户登录失败");

		} else
			message.setMsg(0, "用户登录失败");

		return new ResponseEntity<Message>(message, HttpStatus.OK);
	}
}
