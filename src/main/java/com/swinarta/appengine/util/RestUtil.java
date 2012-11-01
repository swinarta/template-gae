package main.java.com.swinarta.appengine.util;

import com.swinarta.appengine.data.RestResponse;
import com.swinarta.appengine.data.RestResponseBase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class RestUtil {

	public static <T> RestResponse convertResponse(Serializable object){
		RestResponse resp = createResponse();
		RestResponseBase response = resp.getResponse();
			
		if(object != null){
			response.setEndRow(1);
			response.setTotalRows(1);
			response.setData(new Serializable[]{object});
		}else{
			response.setEndRow(0);
			response.setTotalRows(0);
		}
				
		resp.setResponse(response);

		return resp;
	}

	public static RestResponse createResponse(){
		RestResponse resp = new RestResponse();
		
		RestResponseBase response = new RestResponseBase();
		response.setStartRow(0);
		response.setEndRow(1);
		response.setTotalRows(1);
		response.setStatus(0);
		
		resp.setResponse(response);

		return resp;
	}

	public static RestResponse createDeleteResponse(Integer id, String xd){
		RestResponse response = createResponse();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("id", id);
		Object[] data = new Object[1];
		data[0] = map;

		response.getResponse().setData(data);

		if(xd != null){
			response.getResponse().setXd(xd);
		}

		return response;
	}

}