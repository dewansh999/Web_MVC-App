package in.expedia.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	public UserController() {
		System.out.println("UserController");
	}

	@GetMapping("/user")
	public ModelAndView getUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("id", 101);
		mav.addObject("name", "Raju");
		mav.addObject("email", "raju@gmail.com");
		mav.setViewName("user");

		return mav;
	}
}
