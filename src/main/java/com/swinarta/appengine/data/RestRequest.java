package main.java.com.swinarta.appengine.data;

import java.util.Map;

public abstract class RestRequest {

	private String componentId;
	private Map<String, Object> data;

	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}	
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
}
