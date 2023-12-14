package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.taikhoandao;
import com.example.demo.entity.taikhoanentity;


@Controller
public class taikhoanController {
	@Autowired
	taikhoandao tkdao;
	@GetMapping("/taikhoan")
	public String gettaikhoan(Model model)
	{
		/*
		 * taikhoanentity tkEntity = new taikhoanentity();
		 * 
		 * model.addAttribute("tkEntity",tkEntity);
		 */
		
		List<taikhoanentity> list = tkdao.findAll();
		//model là một biến tương tác với view 
		model.addAttribute("model",list);

		
		return "admin/taikhoan";
		
	}
}
