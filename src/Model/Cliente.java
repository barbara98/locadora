/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Cliente {
    
    String nome,endereco,email,data_de_nascimento;
    int id,telefone,cpf;

    //para cadastrar o cliente, não precisamos do atributo ID
    public Cliente(String nome, String endereco, String email, String data_de_nascimento, int telefone, int cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.data_de_nascimento = data_de_nascimento;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    
    //para consultar a tabela usamos construtor de cliente com ID
    public Cliente(String nome, String endereco, String email, int id, int telefone, int cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.id = id;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String gettelefone() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getcpf() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    
}
    
