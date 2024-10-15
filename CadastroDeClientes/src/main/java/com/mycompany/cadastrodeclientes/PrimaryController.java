package com.mycompany.cadastrodeclientes;

import util.Buscador;
import util.Clientes;
import util.Endereco;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class PrimaryController {

    @FXML
    private TextField nomeField, cepField, ruaField, numeroField, cidadeField, estadoField, telefoneField;

    // Criação da lista para armazenar os clientes cadastrados
    private ArrayList<Clientes> listaClientes = new ArrayList<>();

    // Método acionado ao clicar no botão "Buscar"
    @FXML
    private void buscarCep() {
        String cep = cepField.getText();  // Captura o CEP digitado
        
        try {
            // Chama o método estático buscar da classe Buscador
            Endereco endereco = Buscador.buscar(cep);

            // Preenche os campos de endereço se o CEP for encontrado
            ruaField.setText(endereco.getRua());
            cidadeField.setText(endereco.getCidade());
            estadoField.setText(endereco.getEstado());
        } catch (Exception e) {
            // Se o CEP não for encontrado, exibe uma mensagem de erro
            mostrarAlertaErro("CEP não encontrado", "O CEP fornecido não foi encontrado.");
        }
    }

    // Método para salvar o cliente
    @FXML
    private void salvarCliente() {
        // Captura os dados inseridos no formulário
        String nome = nomeField.getText();
        String cep = cepField.getText();
        String rua = ruaField.getText();
        String numero = numeroField.getText();
        String cidade = cidadeField.getText();
        String estado = estadoField.getText();
        String telefone = telefoneField.getText();

        // Cria um novo objeto Cliente com os dados capturados
        Clientes cliente = new Clientes(nome, cep, rua, numero, cidade, estado, telefone);

        // Adiciona o cliente à lista
        listaClientes.add(cliente);

        // Exibe uma mensagem de confirmação
        mostrarAlertaInformacao("Cliente Salvo", "O cliente " + nome + " foi salvo com sucesso e adicionado à lista.");

        // Limpa o formulário após salvar
        limparFormulario();
    }

    // Método para limpar o formulário
    @FXML
    private void limparFormulario() {
        nomeField.clear();
        cepField.clear();
        ruaField.clear();
        numeroField.clear();
        cidadeField.clear();
        estadoField.clear();
        telefoneField.clear();
    }

    // Método para exibir uma mensagem de erro
    private void mostrarAlertaErro(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    // Método para exibir uma mensagem de informação
    private void mostrarAlertaInformacao(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
