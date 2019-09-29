package org.change.model;

public class User {
    private long id;
    private String email;
    private String mobile;

    public User() {
    }

    public User(long id, String email, String mobile, String username, String role) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
        this.username = username;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String username;
    private String role;
}
