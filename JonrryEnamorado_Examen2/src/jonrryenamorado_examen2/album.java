/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonrryenamorado_examen2;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class album {
    private String name;
    private String artist;
    private ArrayList<song> songs = new ArrayList();

    public album() {
    }

    public album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
