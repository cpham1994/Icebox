package com.revature._1811_nov27_wvu.icebox.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature._1811_nov27_wvu.icebox.dao.AddressDao;
import com.revature._1811_nov27_wvu.icebox.entity.Address;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	AddressDao ad;

	@GetMapping
	public void getHomepage(HttpServletResponse response) throws IOException {
		response.sendRedirect("static/index.html");
	}
	
	@GetMapping("/addresses")
	public List<Address> getAddresses() {
		return ad.getAll();
	}
}
