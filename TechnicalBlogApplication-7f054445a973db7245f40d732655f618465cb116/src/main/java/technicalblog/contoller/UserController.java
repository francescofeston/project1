package technicalblog.contoller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
public class UserController {
    @Autowired
    private PostService postService;

    @RequestMapping("users/login")
    public String login(){

        return "users/login";
    }
    @RequestMapping("users/registration")
    public String registration(){

        return "users/registration";
    }
    @RequestMapping(value = "users/login", method= RequestMethod.POST) //can only submit post request for this method
    public String loginUser(User user) {
        return "redirect:/posts"; //

    }
    @RequestMapping(value = "users/logout", method= RequestMethod.POST) //can only submit post request for this method
    public String logout(Model model) throws SQLException {
        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts", posts);

        return "index";
    }
}
