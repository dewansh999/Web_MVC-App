package in.expedia.controller;



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
