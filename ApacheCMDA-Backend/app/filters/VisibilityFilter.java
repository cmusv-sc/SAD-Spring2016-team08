//VisibilityFilter.java


package filters;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VisibilityFilter implements IFilter{

	String type = "visibility" , msg;


    public VisibilityFilter(JsonNode json) {
        if(json.get("wfVisibility") != null)
            this.msg = json.get("wfVisibility").asText();
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
