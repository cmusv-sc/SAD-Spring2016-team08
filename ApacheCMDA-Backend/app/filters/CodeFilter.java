//CodeFilter.java


package filters;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CodeFilter implements IFilter{
	
	String type = "code" , msg;

	public CodeFilter(JsonNode json) {
        if(json.get("wfCode") != null)
            this.msg = json.get("wfCode").asText();
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
		// TODO Auto-generated method stub
		return this.msg;
	}

	
}
