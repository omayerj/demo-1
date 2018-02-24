package com.coupon.main.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coupon.main.facad.CouponClientFacade;
//import com.coupon.main.facad.CouponClientFacade;
import com.coupon.main.facad.CouponSystem;

@Controller
public class LoginServlet {
	@Autowired
	private CouponSystem couponSystem;

	@RequestMapping(value = "/loginservlet", method = RequestMethod.GET)
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		String usertype = request.getParameter("usertype");
		System.out.println("userName :" + username + " password :" + password + " usertype : " + usertype);
		CouponClientFacade facade = couponSystem.login(username, password, usertype);

		if (facade == null) {
			// login failed!
			response.sendRedirect("http://localhost:8080/index.html");
		} else {
			// write facade to session
			request.getSession().setAttribute("facade", facade);

			// here check the client type to make the correct redirect
			// for demo i only use 1 client type - company
			response.sendRedirect("https://spring.io/guides/tutorials/bookmarks/");
		}
	}

}
