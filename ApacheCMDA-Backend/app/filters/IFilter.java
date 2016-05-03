package filters;

import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public interface IFilter {
	boolean isValid();
	TypeMsg Execute();
	String getType();
	String getMsg();
}

    