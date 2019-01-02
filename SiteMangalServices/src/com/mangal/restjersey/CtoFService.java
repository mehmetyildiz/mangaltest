package com.mangal.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.mangal.tutorials.MangalLog4jLevel;

@Path("/ctofservice")
public class CtoFService {

	private static final Logger LOGGER = Logger.getLogger(CtoFService.class.getName());

	@GET
	@Produces("application/xml")
	public String convertCtoF() {
		Double fahrenheit;
		Double celsius = 36.8;
		LOGGER.log(MangalLog4jLevel.MANGAL, "hi3!!!");
		fahrenheit = ((celsius * 9) / 5) + 32;
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>"
				+ "</ctofservice>";
	}

	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		LOGGER.log(MangalLog4jLevel.MANGAL, "hi4!!!");
		fahrenheit = ((celsius * 9) / 5) + 32;
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>"
				+ "</ctofservice>";
	}

}
