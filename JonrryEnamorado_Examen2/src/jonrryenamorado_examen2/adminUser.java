/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonrryenamorado_examen2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class adminUser {
    private ArrayList<user> listauser = new ArrayList();
    private File archivo = null;

    public adminUser(String path) {
    archivo = new File(path);
    }

    public ArrayList<user> getListauser() {
        return listauser;
    }

    public void setListauser(ArrayList<user> listauser) {
        this.listauser = listauser;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUser(user p){
        this.listauser.add(p);
    }
    
    public void cargarArchivo() {
        try {
            listauser = new ArrayList();
            user temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (user) objeto.readObject()) != null) {
                        listauser.add(temp);
                    }
                } catch (Exception e) {
                    //encontro el final del archivo siempre se lanza la excepcion al terminar
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (user t : listauser) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
