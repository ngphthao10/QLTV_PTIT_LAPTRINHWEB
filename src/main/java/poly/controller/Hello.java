package poly.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/hello")
	public String welcome(HttpServletRequest request) {
		request.setAttribute("photo", "resources/images/loginbg.jpg");
		return "sach/tuasach";
	}
}
