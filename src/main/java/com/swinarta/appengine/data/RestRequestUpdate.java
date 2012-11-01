package main.java.com.swinarta.appengine.data;

public class RestRequestUpdate extends RestRequest{

	private int version;
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

}
