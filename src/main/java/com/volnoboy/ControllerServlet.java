package com.volnoboy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 7/6/15 12:16 PM
 */
public class ControllerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user  = new User();
		user.setName("Valera");
		user.setEmail("valera@mozgov.net");

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		request.setAttribute("user", user);
		dispatcher.forward(request, response);
	}
}
