package Controller;

import java.util.ArrayList;

public class Paciente {

    public static ArrayList<Paciente> listar() {
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        
        listaPacientes.add(new Paciente("Maria", "12345678901", "123456789", "01/01/2024", true));
        listaPacientes.add(new Paciente("João", "98765432109", "987654321", "02/01/2024", false));
        listaPacientes.add(new Paciente("Ana", "45678912301", "456789123", "03/01/2024", true));
        
        return listaPacientes;
    }
    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private boolean jaEraPaciente;
    private boolean consultaRealizada;

    // Construtor
    public Paciente(String nome, String cpf, String telefone, String data, boolean jaEraPaciente) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.jaEraPaciente = jaEraPaciente;
        this.consultaRealizada = consultaRealizada;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isJaEraPaciente() {
        return jaEraPaciente;
    }

    public void setJaEraPaciente(boolean jaEraPaciente) {
        this.jaEraPaciente = jaEraPaciente;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

       public String getCPF() {
        return this.cpf;
    }
}
