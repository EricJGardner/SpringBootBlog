package tts.com.techtalentblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tts.com.techtalentblog.model.BlogPost;
import tts.com.techtalentblog.repo.BlogPostRepository;

//Start by giving the controller class the @Controller annotation.
// This will help send the output to a template, rather than write
// output directly from the controller. When prompted, add the
// accompanying package for the annotation.
@Controller
public class BlogPostController {

//    In the controller, we start by using the
//    @Autowired annotation to add our BlogPostRepository to the controller.
    @Autowired
    private BlogPostRepository blogPostRepository;


    //below is a constructor based dependency injection
    //if you only have one dependency, this is considered best practice
//    public BlogPostController(BlogPostRepository blogPostRepository) {
//        this.blogPostRepository = blogPostRepository;
//    }

//    This annotation will be used for our index method, which
//    will return the template specified - a template called "index"
//    in our blog post template directory.
    @GetMapping(value = "/")
    public String index(BlogPost blogPost) {
        //since we are utilizing thymeleaf
        //our output will be generated in a template
        //returning a reference to said template
        //will allow us to show the data that we want
        return "blogpost/index";
    }

//    @Autowired
    private BlogPost blogPost;

//    We set up another method that will take in the data entered
//    in the form and add it to the database.  This method will
//    Post the information to the database and display a "confirmation" on
//    a new template called "result".

    @PostMapping(value = "/")
    public String addNewBlogPost (BlogPost blogPost, Model model) {
//        blogPostRepository.save(new BlogPost(blogPost.getTitle(),
//                blogPost.getAuthor(), blogPost.getBlogEntry()));
        blogPostRepository.save(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }

}
