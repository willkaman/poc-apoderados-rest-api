package cl.banchile.apo_rest_api.service.to;

import java.io.Serializable;

public class SifOperation implements Serializable {
	
	private static final long serialVersionUID = -4260527079926573750L;

	private String third_code;

	private String subrut;

	public String getThird_code() {
		return third_code;
	}

	public void setThird_code(String third_code) {
		this.third_code = third_code;
	}

	public String getSubrut() {
		return subrut;
	}

	public void setSubrut(String subrut) {
		this.subrut = subrut;
	}
	
}
