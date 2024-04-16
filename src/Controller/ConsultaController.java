package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Controller.Paciente;
import View.ConsultaView;
import View.InicialView;

public class ConsultaController {
    
    private ConsultaView view;
    private ArrayList<Paciente> listaPacientes;
    private InicialView inicialView;
    
public ConsultaController(ConsultaView view, ArrayList<Paciente> listaPacientes, InicialView inicialView) {
    this.view = view;
    this.listaPacientes = listaPacientes;
    this.view.setCadastrarListener(new CadastrarListener(inicialView)); // Passe a referência de InicialView para CadastrarListener
}

    
    class CadastrarListener implements ActionListener {
        private InicialView inicialView;
        
        public CadastrarListener(InicialView inicialView) {
            this.inicialView = inicialView;
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNome();
            String cpf = view.getCPF();
            String telefone = view.getTelefone();
            String data = view.getData();
            boolean jaEraPaciente = view.isJaEraPaciente();
            
            // Validações
            if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || data.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Por favor, preencha todos os campos.");
                return;
            }
            
            // Adicionar validações de formato de CPF, telefone e data aqui
            
            // Adicionar novo paciente à lista
            Paciente novoPaciente = new Paciente(nome, cpf, telefone, data, jaEraPaciente);
            listaPacientes.add(novoPaciente);
            
            // Atualizar a tabela na View
            inicialView.atualizarTabela(listaPacientes);
            
            // Fechar a janela
            view.dispose();
        }
    }
    
}
