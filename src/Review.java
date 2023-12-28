import java.util.Scanner;
class Review {
    private int productId;
    private String username;
    private int rating;
    private String comments;
    Scanner scanner = new Scanner(System.in);





    public Review() {

    }
    public Review(int productId, String username, int rating, String comments) {
        this.productId = productId;
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

    public int getProductId() {
        return productId;
    }

    public String getUsername() {
        return username;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    public void setProductId() {
        System.out.println("Enter Product ID");
        int productId1 = scanner.nextInt();
        scanner.nextLine();
        this.productId = productId;
    }

    public void setUsername() {
        System.out.println("Enter Username");
        String username1 = scanner.nextLine();
        scanner.nextLine();
        this.username = username;
    }

    public void setRating() {
        System.out.println("Enter Rating");
        int rating1 = scanner.nextInt();
        scanner.nextLine();
        this.rating = rating;
    }

    public void setComments() {
        System.out.println("Enter Comments");
        String comments1 = scanner.nextLine();
        scanner.nextLine();
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Review{" +
                "productId=" + productId +
                ", username='" + username + '\'' +
                ", rating=" + rating +
                ", comments='" + comments + '\'' +
                '}';
    }


}