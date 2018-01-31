package com.giaduc.java4.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(name = "/LoginController", urlPatterns = { "/admin/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final String userID = "admin";
	private final String password = "password";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get request parameters for userID and password
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (userID.equals(username) && password.equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", "Pankaj");
			// setting session to expiry in 30 mins
			session.setMaxInactiveInterval(30 * 60);
			Cookie userName = new Cookie("user", username);
			userName.setMaxAge(30 * 60);
			response.addCookie(userName);
			request.getRequestDispatcher("WEB-INF/jsps/admin/index.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("WEB-INF/jsps/admin/login.jsp").forward(request, response);
		}
	}

}
