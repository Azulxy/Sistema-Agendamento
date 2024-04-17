/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jvazu
 */
public class PacienteRepository {
    public static ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();


    
    public static ArrayList<Paciente> listarPaciente(){
        listaPacientes.add(new Paciente("Maria", "12345678901", "123456789", "01/01/2024", true));
        listaPacientes.add(new Paciente("João", "98765432109", "987654321", "02/01/2024", false));
        return listaPacientes;
    }
    public void adicionarPaciente(Paciente paciente){
            listaPacientes.add(paciente);
    }
}

