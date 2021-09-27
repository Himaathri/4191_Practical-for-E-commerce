 
package lk.ac.vau.Model;

public class Link {
	private String URL;
	private String rel;
	public Link(String uRL, String rel) {
		super();
		URL = uRL;
		this.rel = rel;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	
	

}