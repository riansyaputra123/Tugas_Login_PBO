/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2109106078_rian.syaputra.ainun.naim_tugas_pbo;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class User {
    //properties
    private String username;
    private String password;
    private static ArrayList<User> dUser = new ArrayList<>();
    
    
    //set and get
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username= username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setDamage(String password) {
        this.password = password;
    }
    
    public ArrayList<User> getUser() {
        return this.dUser;
    }

    public void setUser(ArrayList<User> user) {
        this.dUser = user;
    }
    
    //constructor
    public User (String user, String pass){
        this.username = user;
        this.password = pass;
    }
    
    
    public static boolean login(String username, String password) {
        for (User user : dUser) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean register(String username, String password) {
        for (User user : dUser) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        dUser.add(new User(username, password));
        return true;
    }
}
