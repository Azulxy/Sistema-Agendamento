package Controller;

import View.InicialView;
import View.ConsultaView;
import java.util.ArrayList;
import Controller.Paciente;

public class InicialController {
    
    private InicialView view;
    
    public InicialController(InicialView view) {
        this.view = view;
        initComponents();
    }
    
    private void initComponents() {
        view.getjButtonNovaConsulta().addActionListener(e -> abrirConsultaView());
        view.getjButtonExcluirConsulta().addActionListener(e -> excluirConsulta());
        view.getjButtonFinalziarConsulta().addActionListener(e -> finalizarConsulta());
    }
    
private void abrirConsultaView() {
    ArrayList<Paciente> listaPacientes = new ArrayList<>(); // Crie uma lista de pacientes vazia ou populada, conforme necessário
    InicialView inicialView = new InicialView(); // Crie uma instância de InicialView
    ConsultaView consultaView = new ConsultaView(listaPacientes, inicialView); // Passe a instância de InicialView
    consultaView.setVisible(true);
}
    
    private void excluirConsulta() {
        // Lógica para excluir uma consulta selecionada na tabela
    }
    
    private void finalizarConsulta() {
        // Lógica para finalizar uma consulta em andamento
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            InicialView view = new InicialView();
            InicialController controller = new InicialController(view);
            view.setVisible(true);
        });
    }
}
