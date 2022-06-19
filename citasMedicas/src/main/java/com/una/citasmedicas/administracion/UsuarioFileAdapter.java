
package com.una.citasmedicas.administracion;

import java.io.EOFException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UsuarioFileAdapter {

    public UsuarioFileAdapter() {

    }

    
    protected void write(ArrayList<Usuario> usuario) throws Exception {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("usuario.bej"));
            for (int i = 0; i < usuario.size(); i++) {
                out.writeObject(usuario.get(i));
            }
        } catch (IOException ex) {
            throw new Exception("Error en la escritura!!");
        } finally {
            out.close();
        }
    }

    protected ArrayList<Usuario> read() throws Exception {
        ObjectInputStream in;
        ArrayList<Usuario> usuario = new ArrayList<>();
        try {
            in = new ObjectInputStream(new FileInputStream("usuario.bej"));
            if (in != null) {
                Usuario user = (Usuario) in.readObject();
                while (user != null) {
                    usuario.add(user);
                    user = (Usuario) in.readObject();
                }
            }
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            if (!(ex instanceof EOFException)) {
                throw new Exception(ex.getMessage());
            }
        }
        return usuario;
    }

    protected void writeBakup(ArrayList<Usuario> user) throws Exception {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("usuario_backup.bak"));
            for (int i = 0; i < user.size(); i++) {
                out.writeObject(user.get(i));
            }
        } catch (IOException ex) {
            throw new Exception("Error en la escritura!!");
        } finally {
            out.close();
        }
    }

    protected ArrayList<Usuario> readBackup() throws Exception {
        ObjectInputStream in;
        ArrayList<Usuario> usuario = new ArrayList<>();
        try {
            in = new ObjectInputStream(new FileInputStream("usuario_backup.bak"));
            if (in != null) {
                Usuario user = (Usuario) in.readObject();
                while (usuario != null) {
                    usuario.add(user);
                    user = (Usuario) in.readObject();
                }
            }
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            if (!(ex instanceof EOFException)) {
                throw new Exception(ex.getMessage());
            }
        }
        return usuario;
    }

}
