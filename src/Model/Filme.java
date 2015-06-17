/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Filme {
    
    String nome,categoria,codigo,quantidade;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //cadastrar
    public Filme(String nome, String categoria, String codigo, String quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    //consultar
    public Filme(String nome, String categoria, String codigo, String quantidade, int id) {
        this.nome = nome;
        this.categoria = categoria;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.id = id;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    
    


    
    
}
