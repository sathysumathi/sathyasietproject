package jbr.springmvc.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import jbr.springmvc.controller.Search;

import jbr.springmvc.model.User;
import jbr.springmvc.model.ViewRide;
@Controller
@SessionAttributes({"user" , "uride"})

public class UserController {

	@Autowired
	private Search sc;
	
	@RequestMapping(value="/login",method=RequestMethod.POST) 
	public String checkUser(@RequestParam("userId") String userId,
			@RequestParam("password") String password, ModelMap model,HttpServletRequest req, String username)
	{
		RestTemplate template = new RestTemplate();
		String url = "https://localhost:8180/user/checkUser?oauth_token="+req.getAttribute("oauth_token");
		//String url = "https://localhost:8180/user/checkUser";
		Map<String,String> params = new HashMap<String,String>();
		params.put("username", username);
		params.put("password", password);
		
		User user = new User();
		List<ViewRide> vr = new ArrayList<ViewRide>();
		user.setUsername(username);
		user.setPassword(password);
		Boolean result = template.postForObject(url, user,Boolean.class);
		model.addAttribute("result",result);
		if(!result)
			return "login";			
		else
		{
			user = getUser(username);
			vr = sc.getRide(userId);
			if(vr!=null)
				model.addAttribute("uride",vr);
			model.addAttribute("user",user);
			System.out.println(user.getEmail()+"   "+user.getFirstname());
			return "profile";
		}
	}

	private User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
