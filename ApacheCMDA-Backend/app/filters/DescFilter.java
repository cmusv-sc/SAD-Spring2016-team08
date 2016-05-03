//DescFilter.java

package filters;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DescFilter implements IFilter{

	String type = "desc", msg;

	public DescFilter(JsonNode json) {
        if(json.get("wfDesc") != null)
            this.msg = json.get("wfDesc").asText();
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
