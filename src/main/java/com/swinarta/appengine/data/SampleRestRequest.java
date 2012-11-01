package main.java.com.swinarta.appengine.data;


public class SampleRestRequest<T> {

	private String componentId;
	private T data;

	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
