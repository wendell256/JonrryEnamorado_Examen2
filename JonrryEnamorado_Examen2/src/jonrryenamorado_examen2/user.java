/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonrryenamorado_examen2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class user implements Serializable {
    private String name;
    private String age;
    private String username;
    private String password;
    private ArrayList<song> favoritos = new ArrayList();
    private ArrayList<playlist> playlists = new ArrayList();
    private static final long SerialVersonUID = 777L;

    public user() {
    }

    public user(String name, String age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<song> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<song> favoritos) {
        this.favoritos = favoritos;
    }

    public ArrayList<playlist> getPlaylist() {
        return playlists;
    }

    public void setPlaylist(ArrayList<playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
