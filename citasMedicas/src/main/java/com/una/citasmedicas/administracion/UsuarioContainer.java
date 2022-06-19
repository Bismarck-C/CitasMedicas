/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.citasmedicas.administracion;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eithel
 */
public class UsuarioContainer extends UsuarioFileAdapter {

    private static Map<String, Usuario> cUser = new HashMap<>();

    public UsuarioContainer() throws Exception {
        super();

        File archivo = new File("usuario.bej");
        if (!archivo.exists()) {
            archivo.createNewFile();
        } else {
            loadFile();
        }
    }

    public static boolean exist(String usuario) {
        if (cUser.containsKey(usuario)) {
            return true;
        }
        return false;
    }

    public boolean add(Usuario user) throws Exception {

        if (!exist(user.getNombreUsuario())) {
            cUser.put(user.getNombreUsuario(), user);
            this.write(new ArrayList<Usuario>(cUser.values()));
            return true;
        }
        return false;

    }

    private void loadFile() throws Exception {

        ArrayList<Usuario> data = this.read();

        for (Usuario user : data) {
            cUser.put(user.getNombreUsuario(), user);
        }
    }

    public static Usuario find(String usuario) {
        if (exist(usuario)) {
            return cUser.get(usuario);
        }
        return null;
    }

    public boolean delete(String usuario) throws Exception {
        if (usuario != null) {
            cUser.remove(usuario);
            this.write(new ArrayList<Usuario>(cUser.values()));
            return true;
        }
        return false;
    }

    public static Usuario get(String usuario) {
        if (exist(usuario)) {
            return cUser.get(usuario);
        }
        return null;
    }

    public static void mostrar() {
        cUser.values().toString();

    }

    public void crearBackUp() throws Exception {

        DateFormat formatoFecha = new SimpleDateFormat("ddMMyyyy");

        Date fecha = new Date();
        String fechaCreacion = formatoFecha.format(fecha);

        UsuarioFileAdapter backup = new UsuarioFileAdapter();
        File archivo = new File("usuario_backup.bak");

        if (!archivo.exists()) {
            archivo.createNewFile();

            backup.writeBakup(new ArrayList<Usuario>(cUser.values()));
            System.out.println("Se creo el Backup");

        } else {
            backup.writeBakup(new ArrayList<Usuario>(cUser.values()));
            archivo.renameTo(new File("usuario_backup_" + fechaCreacion + ".bak"));

            System.out.println("Se ha creado correctamente el backup");
        }
    }
}
