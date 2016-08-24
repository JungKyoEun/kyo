package edu.kosta.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	public String user ="wjdrydms";
	public String password = "oracle";

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		process(req, resp);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html; charset= utf-8");
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><head><title> Login Servlet Test </title></head><body><b><br>");
		if( user.equalsIgnoreCase(id) && password.equalsIgnoreCase(pwd)){
			 pw.println("반갑다...<br>");
			 pw.println("당신의 아이디는"+id+"이군요<br>");
			 pw.println("그리고 암호는"+pwd+"입니다 <br>");
		}else if(user.equals(id)&& !password.equals(pwd)){
			pw.println("암호가 틀렸습니다.<br>");
			pw.println("<a href='view/login.html'>Login</a>");
		}else {
			pw.println("등록되지 않은 사용자 입니다.<br>");
			pw.println("<a href='view/login.html'>Login</a>");
		}
		
		pw.println("</b></body></html>");
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
	  throws ServletException, IOException {
		process(req, resp);
	}
    
}
