package Model;

public class Paciente {
        
    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private boolean jaEraPaciente;
    private boolean consultaRealizada;

    public Paciente() {
    }

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
