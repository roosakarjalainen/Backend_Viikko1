package backend.viikko1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/index")
    @ResponseBody
    public String returnMessage1() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String returnMessage2() {
        return "This is the contact page";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    }

}
