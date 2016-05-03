//CategoryFilter.java


package filters;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CategoryFilter implements IFilter{

	String type = "category" , msg;

	public CategoryFilter(JsonNode json) {
	    if(json.get("wfCategory") != null)
		    this.msg = json.get("wfCategory").asText();
		else
		    this.msg = null;
	}

	@Override
	public TypeMsg Execute() {
		return new TypeMsg(type, msg);
	}

	@Override
	public boolean isValid() {
		return msg != null;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public String getMsg() {
		return this.msg;
	}


}
