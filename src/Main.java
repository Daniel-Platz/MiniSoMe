public class Main {
    public static void main(String[] args) {

        SocialNetwork network = new SocialNetwork();

        // Create users
        User alice = new User("Alice");
        User bob = new User("Bob");

        // Add users to the network
        network.addUser(alice);
        network.addUser(bob);

        // Make friends
        alice.addFriend(bob);

        // Bob creates posts
        bob.createPost("My first post!");
        bob.createPost("My second post!");

        // Like only the first post of Bob
        System.out.println("Alice likes Bob's first post:");
        bob.getPosts().get(0).like();

        // Display Bob's posts to verify the like
        System.out.println("Displaying Bob's posts:");
        for (Post post : bob.getPosts()) {
            post.displayPost();
        }

        // Display Alice's friend's posts using SocialNetwork
        System.out.println("Displaying Alice's friends' posts:");
        network.showFriendsPosts(alice);
    }
}