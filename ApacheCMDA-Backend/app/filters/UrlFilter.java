//UrlFilter.java


package filters;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UrlFilter implements IFilter{

	String type = "url" , msg;


    public UrlFilter(JsonNode json) {
        if(json.get("wfUrl") != null)
            this.msg = json.get("wfUrl").asText();
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
