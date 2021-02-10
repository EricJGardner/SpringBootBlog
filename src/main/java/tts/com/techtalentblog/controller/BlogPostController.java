package tts.com.techtalentblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import tts.com.techtalentblog.model.BlogPost;

@Controller
public class BlogPostController {

    @GetMapping("/")
    public String index(BlogPost blogpost) {
        //since we are utilizing thymeleaf
        //our output will be generated in a template
        //returning a reference to said template
        //will allow us to show the data that we want
        return "blogpost/index";
    }

}
