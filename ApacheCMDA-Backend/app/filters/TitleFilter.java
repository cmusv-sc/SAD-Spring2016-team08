//TitleFilter.java

package filters;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TitleFilter implements IFilter{
	
	String type = "title", msg;

    public TitleFilter(JsonNode json) {
        if(json.get("wfTitle") != null)
            this.msg = json.get("wfTitle").asText();
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
