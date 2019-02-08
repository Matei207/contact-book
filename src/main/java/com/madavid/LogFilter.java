package com.madavid;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class LogFilter implements Filter {

	final static Logger logger = LogManager.getLogger(LogFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String testParam = filterConfig.getInitParameter("test-param");
		System.out.println("Test param: " + testParam);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String ipAddr = request.getRemoteAddr();
		System.out.println("IP "+ ipAddr + ", Time " + new Date().toString());
		logger.info("IP [" + ipAddr + "]" + " came in!");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}
}
