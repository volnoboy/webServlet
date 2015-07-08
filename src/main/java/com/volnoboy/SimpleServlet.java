package com.volnoboy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 7/6/15 10:43 AM
 */
public class SimpleServlet extends HttpServlet {

	private String message;
	String appName = "My application";

	public void init() throws ServletException {
		// Do required initialization
		message = "Hello World";
		appName = getInitParameter("ProductName");
		appName = getServletContext().getInitParameter("ProductName");
	}


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name  = request.getParameter("name");
		if (name != null) {
			response.setContentType("text/xml");
			response.getWriter().printf(
					"<application>" +
							"<name>Hello %s</name>" +
							"<product>%s</product>" +
							"</application>", name, appName);
		} else {
			throw new ServletException("A name should be entered");
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name  = request.getParameter("name");
		if (name != null && name != "") {
			response.getWriter().printf("Hello %s", name);
		} else {
			response.getWriter().write("Please enter name value!");
		}
	}
}
