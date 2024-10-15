package util;

public class Clientes {
    private String nome;
    private String cep;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String telefone;

    // Construtor
    public Clientes(String nome, String cep, String rua, String numero, String cidade, String estado, String telefone) {
        this.nome = nome;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
    }

    // Getters e Setters (opcionais, dependendo do seu uso)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
