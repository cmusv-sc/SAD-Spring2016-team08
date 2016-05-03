package filters;
import java.util.ArrayList;
import java.util.List;
import models.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Pipeline {

	private List<IFilter> _filters = new ArrayList<IFilter>();

	public Pipeline register(IFilter filter)
    {
        _filters.add(filter);
        return this;
    }

    public void execute(Workflow workflow)
    {

        for(IFilter filter: _filters){
        	if(filter.isValid()){
	        	if(filter.getType() == "title"){
                    workflow.setWfTitle(filter.getMsg());
	        	}
	        	else if(filter.getType() == "code"){
	        		workflow.setWfCode(filter.getMsg());
	        	}
	        	else if(filter.getType() == "desc"){
                	 workflow.setWfDesc(filter.getMsg());
                }
                else if(filter.getType() == "img"){
	        		workflow.setWfImg(filter.getMsg());
	        	}
	        	else if(filter.getType() == "category"){
                    workflow.setWfCategory(filter.getMsg());
                }
	        	else if(filter.getType() == "visibility"){
                    workflow.setWfVisibility(filter.getMsg());
                }
                else if(filter.getType() == "url"){
                    workflow.setWfUrl(filter.getMsg());
                }
                else if(filter.getType() == "input"){
                    workflow.setWfInput(filter.getMsg());
                }
                else if(filter.getType() == "output"){
                    workflow.setWfOutput(filter.getMsg());
                }
                else if(filter.getType() == "status"){
                     workflow.setStatus(filter.getMsg());
                }

        	}

        }
    }
}
