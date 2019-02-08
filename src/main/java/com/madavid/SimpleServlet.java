package com.madavid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = -4397024895463550201L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Set error code and reason.
		res.getWriter().print("Hello a\n");
		Cookie uiColorCookie = new Cookie("color", "red");
		uiColorCookie.setMaxAge(60*2);
		res.addCookie(uiColorCookie);
		uiColorCookie.setPath("/SomeOtherPath");
		Optional<String> cookie = readACookie(req, "color");
		if (cookie.isPresent()) res.getWriter().println(cookie.get());
		else res.getWriter().println("NO COOKIE MA FREND");
		// RequestDispatcher view = req.getRequestDispatcher("/index.jsp");
		// view.forward(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Servlet " + this.getServletName() + " has spun up!\n" + "[" + new Date() + "]");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet" + this.getServletName() + " has stopped!\n" + "[" + new Date() + "]");
	}

private Optional<String> readACookie(HttpServletRequest request, String key) {
	return Arrays.stream(request.getCookies())
			.filter(c -> key.equals(c.getName()))
			.map(Cookie::getValue)
			.findAny();
}

}

