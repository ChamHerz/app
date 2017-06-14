package MyResftfullApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = "")
  public String  getRedirect()
  {
      return "redirect:/app";
  }

  @GetMapping(value = "/app/**")
  public String getIndex()
  {
      return "forward:/index.html";
  }
}
