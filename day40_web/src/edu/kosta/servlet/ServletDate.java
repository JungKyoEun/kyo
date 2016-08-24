package edu.kosta.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ServletDate")
public class ServletDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ServletDate() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			process(request,response);
	}

	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		System.out.println("console mode print");
		
		Calendar cal = Calendar.getInstance();//system�� �����ִ³�¥�ð�������
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MARCH);
		int second = cal.get(Calendar.SECOND);
		
		PrintWriter out = response.getWriter();
		out.write("<html><head><title> Servlet Date </title></head><body>");
		out.write("<h1>���� �ð���");
		out.write(Integer.toString(hour)+ "��");
		out.write(Integer.toString(minute)+ "��");
		out.write(Integer.toString(second)+ "�� �Դϴ�.");

		out.write("</h1></body></html>");
		out.close();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		process(request,response);
	}

}
