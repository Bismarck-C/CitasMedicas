package com.una.citasmedicas.AdministracionPaciente.Controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteControllerTest {

    public PacienteControllerTest() {
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

    @Test
    public void testAdd() throws Exception {

        PacienteController instance = new PacienteController();
        String[] data = {"208310449", "Jose", "Valverde Solis", "85240612", "vsj@gmail.com", "Liberia", "12/12/1212", "Amigo", "88888888"};
        String expResult = "Paciente agregado";
        String result = instance.add(data);
        assertEquals(expResult, result);

    }

    @Test
    public void testDelete() throws Exception {
        PacienteController instance = new PacienteController();
        String id = "208310449";
        String expResult = "Paciente eliminado";
        String result = instance.delete(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscar() throws Exception {
        PacienteController instance = new PacienteController();
        String id = "208310449";
        String expResult = "208310449";
        String[] result = instance.buscar(id);
        assertEquals(expResult, result[0]);
    }

    @Test
    public void testModificar() throws Exception {
        PacienteController instance = new PacienteController();
        String cedula = "208310449";
        String[] data = {"0", "0", "0", "0", "0", "0", "0", "0"};
        String expResult = "Se modifico";
        String result = instance.modificar(data, cedula);
        assertEquals(expResult, result);
    }

    @Test
    public void testRetornarnumCitas() throws Exception {
        String cedula = "208310449";
        PacienteController instance = new PacienteController();
        String expResult = "1";
        System.out.println("Informacion: "+instance.retornarnumCitas(cedula));
        

    }

    @Test
    public void testSumarUnaCita() throws Exception {
        String cedula = "208310449";
        PacienteController instance = new PacienteController();
        String expResult = "Se agrego una cita";
        String result = instance.SumarUnaCita(cedula);
        assertEquals(expResult, result);

    }

}
