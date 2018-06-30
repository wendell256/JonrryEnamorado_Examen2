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
public class playlist implements Serializable {

    private String name;
    private ArrayList<song> songs = new ArrayList();
    private static final long SerialVersonUID = 777L;

    public playlist() {
    }

    public playlist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
