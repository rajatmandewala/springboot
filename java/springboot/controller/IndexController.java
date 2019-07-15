package springboot.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController implements ErrorController{
	
	private static final String PATH="/error";

	@Override
	@RequestMapping(PATH)
    @ResponseBody
	public String getErrorPath() {		
		return "not mapping found";
	}
	
}
