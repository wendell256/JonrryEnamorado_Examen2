/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonrryenamorado_examen2;

/**
 *
 * @author wende
 */
public class song {
    private String name;
    private String artista;
    private int seconds;
    private String genero;

    public song() {
    }

    public song(String name, String artista, int seconds, String genero) {
        this.name = name;
        this.artista = artista;
        this.seconds = seconds;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
