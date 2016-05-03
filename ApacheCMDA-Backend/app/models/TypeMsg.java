package models;

public class TypeMsg {
	private String type = "";
	private String msg = "";

	public TypeMsg(String _type, String _msg) {
		this.setType(_type);
		this.setMsg(_msg);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
