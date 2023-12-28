public class User {
    private String username;
    private String password;
    private boolean isLoggedIn;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isLoggedIn = false;
    }

    public String getUsername() {
        return username;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getRole() {
        return role;
    }

    public boolean hasRole(String role) {
        return this.role == role;
    }


}

