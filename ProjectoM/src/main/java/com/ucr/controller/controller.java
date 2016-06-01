package com.ucr.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

@Controller
public class controller 
{
	@RequestMapping(value="/prueba", method = RequestMethod.GET)
	public String helloWorld7() 
	{
		return "prueba";
	}
	
	@RequestMapping(value="/ejemplo", method = RequestMethod.GET)
	public String helloWorld8() 
	{
		return "ejemplo";
	}
	

	
	
	
}
