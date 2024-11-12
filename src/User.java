import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> friends;
    private ArrayList<Post> posts;

    // Constructor
    public User(String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    // Method to add a friend
    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
            System.out.println(user.getUsername() + " is now friends with " + username);
        } else {
            System.out.println(user.getUsername() + " is already a friend.");
        }
    }

    // Method to create a post
    public void createPost(String content) {
        Post newPost = new Post(content, this);
        posts.add(newPost);
        System.out.println("Post created by " + username + ": " + content);
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public ArrayList <Post> getPosts() {
        return posts;
    }
}