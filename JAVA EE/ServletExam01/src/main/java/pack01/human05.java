package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/human005")
public class human05 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		String strX = req.getParameter("x");
		String strY = req.getParameter("y");
		
		int intX = 0;
		int intY = 0;
		
		if (strX != null && !strX.equals("")) {
			intX = Integer.parseInt(strX);
		}
		if (strY != null && !strY.equals("")) {
			intY = Integer.parseInt(strY);
		}
		
		out.printf("두수의 합은 %d입니다.", intX + intY);
	}
}
