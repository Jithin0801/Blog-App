package jithin.blogapp;

public class User {

    private int ID;
    private  String email;
    private String username;
    private String gender;


    public User(int ID, String email, String username, String gender) {
        this.ID = ID;
        this.email = email;
        this.username = username;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }





}
