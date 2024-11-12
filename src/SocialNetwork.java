import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<User> users;

    // Constructor
    public SocialNetwork() {
        this.users = new ArrayList<>();
    }

    // Method to add a user to the network
    public  void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            System.out.println(user.getUsername() + " has joined the social network.");
        } else {
            System.out.println(user.getUsername() + " is already in the social network.");
        }
    }

    // Method to show posts from a user's friends
    public void showFriendsPosts(User user) {
        System.out.println("Posts from " + user.getUsername() + "'s friends:");
        for (User friend : user.getFriends()) {
            for (Post post : friend.getPosts()) {
                post.displayPost();
            }
        }
    }
}
