package com.example.recyclerviewtest;

public class Profile {
    private String name;
    private String email;
    private boolean permission;
    private String profilePic;

    public Profile(String name, String email, boolean permission, String profilePic) {
        this.name = name;
        this.email = email;
        this.permission = permission;
        this.profilePic = profilePic;
    }

    public Profile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
