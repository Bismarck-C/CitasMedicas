/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.una.citasmedicas.controller.usuario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eithel
 */
public class UsuarioControllerTest {
    
    public UsuarioControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of agregar method, of class UsuarioController.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        String data[]={"123","pepe","a","45","@","sur","12/11","pino","lolo"};
       
        UsuarioController instance = new UsuarioController();
        String expResult = "se agrego un usuario correctamente";
        String result = instance.agregar(data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of modificar method, of class UsuarioController.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        String usuario = "";
        String[] data = null;
        UsuarioController instance = new UsuarioController();
        String expResult = "";
        String result = instance.modificar(usuario, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class UsuarioController.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String usuario = "";
        UsuarioController instance = new UsuarioController();
        String expResult = "";
        String result = instance.eliminar(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class UsuarioController.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        UsuarioController instance = new UsuarioController();
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
