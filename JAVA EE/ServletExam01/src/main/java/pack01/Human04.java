package pack01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/human004")
public class Human04 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		out.println("getSchema : " + req.getScheme() + "<br>");
		out.println("getServername : " + req.getServerName() + "<br>");
		out.println("getLocalAddr : " + req.getLocalAddr() + "<br>");
		out.println("getServerPort : " + req.getServerPort() + "<br>");
		out.println("getRemoteAddr : " + req.getRemoteAddr() + "<br>");
		out.println("getRemoteHost : " + req.getRemoteHost() + "<br>");
		out.println("getRemotePort : " + req.getRemotePort() + "<br>");
		
		out.println("<br>");
		out.println("URI : " + req.getRequestURI() + "<br>");
		out.println("URL : " + req.getRequestURL() + "<br>");
		out.println("getContextPath : " + req.getContextPath() + "<br>");
		out.println("getProtocol : " + req.getProtocol() + "<br>");
		out.println("getServletPath : " + req.getServletPath() + "<br>");
		
		out.println("<br>");
		out.println("getHeaderNames : " + req.getHeaderNames() + "<br>");
		Enumeration<String> em = req.getHeaderNames();
		while (em.hasMoreElements()) {
			String s = em.nextElement();
			out.println("getHeader : " + req.getHeader(s) + "<br>");
			
		}
	}
}
