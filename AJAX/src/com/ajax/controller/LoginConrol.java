package com.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginConrol {
	@RequestMapping("login")
	public ModelAndView login(HttpServletResponse response) throws IOException{
		PrintWriter out=response.getWriter();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.getModel().put("number", 123);
		out.print("bbbb");
		out.flush();
		out.close();
		return mv;
	}
	
	@RequestMapping("int")
	public void interfacea(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String  name=(String) request.getParameter("username");
		String  pwd=(String) request.getParameter("pwd");
		PrintWriter out=response.getWriter();
/*		List list=new ArrayList();
		list.add("张三");
		list.add("李四");*/
	/*	JSONArray json=new JSONArray();*/
		if(name.equals("abc")&&pwd.equals("123")){
			out.print("登录成功");
		}else{
			out.print("登录失败");
		}
		System.out.println(name+""+pwd);
		/*out.print(list);*/
		out.flush();
		out.close();
	}
}
