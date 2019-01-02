package com.mangal.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.mangal.tutorials.MangalLog4jLevel;

@Path("/ftocservice")
public class FtoCService {

	private static final Logger LOGGER = Logger.getLogger(FtoCService.class.getName());

	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		jsonObject.put("CValue", celsius);
		jsonObject.put("FValue", fahrenheit);
		LOGGER.log(MangalLog4jLevel.MANGAL, "hi1!!!");
//		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.ok().entity(jsonObject.toString()).header("Access-Control-Allow-Origin", "*").build();
	}

	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius = (f - 32) * 5 / 9;
		jsonObject.put("F Value", f);
		jsonObject.put("C Value", celsius);
		LOGGER.log(MangalLog4jLevel.MANGAL, "hi2!!!");
//		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		
		return Response.status(200).entity(jsonObject.toString()).build();
	}
}
