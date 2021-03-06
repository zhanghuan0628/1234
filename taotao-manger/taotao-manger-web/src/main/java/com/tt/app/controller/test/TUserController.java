package com.tt.app.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tt.app.model.TUser;
import com.tt.app.service.TUserService;

@Controller
@RequestMapping("/TUserController")
public class TUserController {
	@Autowired
	private TUserService tUserService;
	
	@ResponseBody
	@RequestMapping("/selectUserList")
	public List<TUser> selectUserList(){
		return tUserService.selectByExample(null);
		
	}

}
