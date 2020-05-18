package jithin.blogapp;

public class User {

    private int ID;
    private  String email, password;


    public  User (int ID, String email, String password){
        this.ID = ID;
        this.email = email;
        this.password = password;
    }
    public int getID() {
        return ID;
    }

    public  String getEmail (String email){
        return  email;
    }

    public String getPassword() {
        return password;
    }



}
