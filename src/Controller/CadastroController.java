package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Paciente;
import Repository.PacienteRepository;
import View.CadastroView;
import View.InicialView;
import java.util.HashSet;

public class CadastroController {
    
    private PacienteRepository repository;
    private CadastroView view;
    private Paciente paciente;
    private InicialView inicialView;
    
public CadastroController(CadastroView view,Paciente paciente, InicialView inicialView) {
    this.view = view;
    this.paciente = paciente;
    this.view.setCadastrarListener(new CadastrarListener(inicialView));
}

    
    class CadastrarListener implements ActionListener {
        private InicialView inicialView;
        
        public CadastrarListener(InicialView inicialView) {
            this.inicialView = inicialView;
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            
            paciente.setNome(view.getNome());
            paciente.setCpf(view.getCPF());
            paciente.setTelefone(view.getTelefone());
            paciente.setData(view.getData());
            paciente.setJaEraPaciente(view.isJaEraPaciente());
            paciente.setConsultaRealizada(false);

            // Validações
//            if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || data.isEmpty()) {;;;;
//                JOptionPane.showMessageDialog(view, "Por favor, preencha todos os campos.");
//                return;
//            }
//            
//            // Realizando validação dos dados
//            if (nome.isEmpty() || telefone.isEmpty() || cpf.isEmpty() || data.isEmpty()) {
//                JOptionPane.showMessageDialog(view, "Todos os campos devem ser preenchidos.");
//                return;
//            }
//            if (!telefone.matches("\\d{4}-\\d{4}")) {
//                JOptionPane.showMessageDialog(view, "Formato de telefone inválido. Use o formato 9999-9999.");
//                return;
//            }
//            if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
//                JOptionPane.showMessageDialog(view, "Formato de CPF inválido. Use o formato 111.111.111-11.");
//                return;
//            }
//            if (!data.matches("\\d{2}/\\d{2}/\\d{2}")) {
//                JOptionPane.showMessageDialog(view, "Formato de data inválido. Use o formato dd/mm/aa.");
//                return;
//        }
            
            // Adicionar novo paciente à lista
            repository.adicionarPaciente(paciente);
            
            // Atualizar a tabela na View
            inicialView.atualizarTabela();
            
            // Fechar a janela
            view.dispose();
        }
    }
    
}
