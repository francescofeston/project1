package technicalblog.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    public HomeController(){
        System.out.println("*** HomeController ***");
    }

    @Autowired
    private PostService postService; //instance variable of PostService allows to call the method wherever necessary

    @RequestMapping("/") //homepage
    public String getAllPosts(Model model){

        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts", posts);

        return "index"; // as a view resolver

    }
}
