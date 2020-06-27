package com.crunchify.restjersey;

/**
 * 
 * @author abi
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {

	@GET
	@Produces("application/xml")
	public String convertCtoF(){
		
		Double farenheit;
		Double celsius=36.8;
		farenheit=((celsius*9)/5)+32;
		String result ="Producess(\"application/xml\") output: \n\nC to F Converter Output";
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>"	;	
	}
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c){
		Double farenheit;
		Double celsius =c;
		farenheit=((celsius*9)/5)+32;
		String result ="Producess(\"application/xml\") output: \n\nC to F Converter Output";
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>"	;	
	
	}
}
