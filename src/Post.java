public class Post {
    private String content;
    private User author;
    private int likes;

    // Constructor
    public Post(String content, User author) {
        this.content = content;
        this.author = author;
        this.likes = 0;
    }

    // Method to like a post
    public void like() {
        likes++;
    }

    // Method to display post details
    public void displayPost() {
        System.out.println("Post: " + content);
        System.out.println("Author: " + author.getUsername());
        System.out.println("Likes: " + likes);
        System.out.println();
    }
}