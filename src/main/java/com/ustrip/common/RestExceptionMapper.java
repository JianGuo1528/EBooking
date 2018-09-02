package com.ustrip.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Provider
public class RestExceptionMapper implements ExceptionMapper<Exception> {

	private static Logger logger = LogManager.getLogger(RestExceptionMapper.class.getName());	
	@Override
	public Response toResponse(Exception exception) {
		Map<String, Object> model = new HashMap<String, Object>();
		if(exception  instanceof MiniException){
			model.put("errorId", ((MiniException) exception).getErrorId());
			model.put("errorMessage", ((MiniException) exception).getErrorMessage());
			
		    logger.info("Catch Exception = " + ((MiniException)exception).getErrorId() + " = " + exception+" | Line = "+exception.getStackTrace()[0].getLineNumber()+" | Method = "+exception.getStackTrace()[0].getMethodName()+" | Class = "+exception.getStackTrace()[0].getClassName());
			return Response.status(Status.OK).entity(model).build();
		}else if(exception  instanceof CtripException){
			CtripException cp = (CtripException)exception;
			String response = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
					"<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +
					"<soap:Body>" +
					"<"+cp.getCategory()+" xmlns=\"http://www.opentravel.org/OTA/2003/05\" EchoToken=\"" + cp.getEchoToken() + "\" PrimaryLangId=\"en-us\" TimeStamp=\"" + new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()) + ".0Z\">" +
					"<Errors>" +
					"<Error Type=\"" + cp.getType() + "\" Code=\"" + cp.getCode() + "\" ShortText=\"" + cp.getShortText() + "\"></Error>" +
					"</Errors>" +
					"</"+cp.getCategory()+">" +
					"</soap:Body>" +
					"</soap:Envelope>";
			logger.fatal("Catch Ctrip Exception = " + exception+" | Line = "+exception.getStackTrace()[0].getLineNumber()+" | Method = "+exception.getStackTrace()[0].getMethodName()+" | Class = "+exception.getStackTrace()[0].getClassName(),exception);
			return Response.status(Status.OK).entity(response).build();
		}
		logger.fatal("Catch Exception = " + exception+" | Line = "+exception.getStackTrace()[0].getLineNumber()+" | Method = "+exception.getStackTrace()[0].getMethodName()+" | Class = "+exception.getStackTrace()[0].getClassName(),exception);
		MiniException error = new MiniException(UsiTripConstant.ERRORCODE_ER1001,ErrorCodeEnum.ER1001.getMsg());
		model.put("errorId", error.getErrorId());
		model.put("errorMessage", error.getErrorMessage());
	    return Response.status(Status.OK).entity(model).build();
	}

}
