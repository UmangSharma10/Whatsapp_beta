package com.example.whatsapp_beta.Models;

public class Users {
    String profilepic, Username, mail, password, userId, lastmessage;

    public Users(String profilepic, String username, String mail, String password, String userId, String lastmessage) {
        this.profilepic = profilepic;
        this.Username = username;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastmessage = lastmessage;
    }

    public Users(){}

    //signup constructor

    public Users(String username, String mail, String password) {

        this.Username = username;
        this.mail = mail;
        this.password = password;


    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }
}
