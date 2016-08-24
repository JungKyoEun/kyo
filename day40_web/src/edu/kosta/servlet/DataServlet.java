package edu.kosta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Java + Html
//@WebServlet("/DateServlet") //annotation
@WebServlet(name="/DataServlet",urlPatterns="/hello.do")
public class DataServlet extends HttpServlet {// HttpServlet 클래스 상속 받아서..

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	   throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		process(req, resp);
	}
	
	private void process(HttpServletRequest req,HttpServletResponse resp )
			throws ServletException, IOException {
		System.out.println("Hello Servlet!!!");
		
		PrintWriter out = resp.getWriter();
		out.write("<html><head><title>Servlet Test</title></head>");
		out.write("<body><h1><font color='red'>Hello Servlet</font></h1></body></html>");
	}
	
}
