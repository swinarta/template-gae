package main.java.com.swinarta.appengine.data;

import java.util.Map;

public class RestResponseBase{

	private String xd;
	private int status;
	private int startRow;
	private int endRow;
	private int totalRows;
	private Object[] data;
	private Map<String, String> errors;
		
	public String getXd() {
		return xd;
	}
	public void setXd(String xd) {
		this.xd = xd;
	}
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public Object[] getData() {
		return data;
	}
	public void setData(Object[] data) {
		this.data = data;
	}
	
}
