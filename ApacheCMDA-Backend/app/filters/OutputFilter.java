//OutputFilter.java

package filters;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OutputFilter implements IFilter{

	String type = "output", msg;

    public OutputFilter(JsonNode json) {
        if(json.get("wfOutput") != null)
            this.msg = json.get("wfOutput").asText();
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
