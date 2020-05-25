package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.lang.reflect.Array;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

import static java.sql.DriverManager.getConnection;

@Service
public class PostService {

    public PostService(){
        System.out.println("*** PostService ***");
    }

    public ArrayList<Post> getAllPosts() throws SQLException {

        ArrayList<Post> posts = new ArrayList<>();
/*
        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;

 */
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver"); //JBC driver class
            connection = getConnection("jdbc:postgresql://localhost:5432/technicalblog", "postgres", "admin"); //load the driver
            Statement statement = connection.createStatement(); //creates a statement object => enables statement in database
            ResultSet rs = statement.executeQuery("SELECT * FROM posts");
                while(rs.next()){
                    Post post = new Post();
                    post.setTitle(rs.getString("title"));
                    post.setBody(rs.getString("body"));
                    posts.add(post);

                }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally{
            connection.close();
        }
        return posts;
    }
    public ArrayList<Post> getOnePost() throws SQLException {
        ArrayList<Post> posts = new ArrayList<>();
        /*
        Post post1 = new Post();
        post1.setTitle("This is your first Post ");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        posts.add(post1);

         */
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver"); //JBC driver class
            connection = getConnection("jdbc:postgresql://localhost:5432/technicalblog", "postgres", "admin"); //load the driver
            Statement statement = connection.createStatement(); //creates a statement object => enables statement in database
            ResultSet rs = statement.executeQuery("SELECT * FROM posts WHERE id = 4");
            while(rs.next()){
                Post post = new Post();
                post.setTitle(rs.getString("title"));
                post.setBody(rs.getString("body"));
                posts.add(post);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
        return posts;

    }
}
