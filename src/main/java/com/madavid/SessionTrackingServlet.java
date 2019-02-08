package com.madavid;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session-track")
public class SessionTrackingServlet extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession sesh = req.getSession();
		resp.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
		synchronized (sesh) {
			String heading;
			Integer accessCount = (Integer) sesh.getAttribute("accessCount");
			if (accessCount == null) {
				accessCount = 0;
				heading = "Welcome, noob!";
			} else {
				accessCount++;
				heading = "Welcome back, noobnoob";
			}
			sesh.setAttribute("accessCount", accessCount);
			PrintWriter out = resp.getWriter();
			out.println("<!DOCTYPE HTML>" +
					"<HTML>\n" +
							"<HEAD><TITLE>" + "EYYYYYOOO" + "</TITLE></HEAD>\n" +
							"<BODY BGCOLOR=\"#FDF5E6\">\n" +
							"<CENTER>\n" +
							"<H1>" + heading + "</H1>\n" +
							"<H2>Information on Your Session:</H2>\n" +
							"<TABLE BORDER=1>\n" +
							"<TR BGCOLOR=\"#FFAD00\">\n" +
							" <TH>Info Type<TH>Value\n" +
					" <TD>Number of Previous Accesses\n" +
							" <TD>" + accessCount + "\n" +
							"</TABLE>\n" +
							"</CENTER></BODY></HTML>"
			);
		}
	}

	@Override
	public void destroy() {
		System.out.println("Goodbye session!");
		super.destroy();

	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Hello session!");
	}

}
