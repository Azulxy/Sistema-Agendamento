package Controller;

import View.InicialView;
import View.CadastroView;
import java.util.ArrayList;
import Model.Paciente;

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
    Paciente paciente = new Paciente();
    InicialView inicialView = new InicialView(); // Crie uma instância de InicialView
    CadastroView consultaView = new CadastroView(paciente, inicialView); // Passe a instância de InicialView
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
