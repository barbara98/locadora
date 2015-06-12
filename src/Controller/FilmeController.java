/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author info206
 */
public class FilmeController {
     public void Cadastrar(Filme f) throws SQLException {
        try {

            Util util = new Util();
             try (Connection conexao = util.conecta()) {
                 String sql = "INSERT INTO filme (Nome,Categoria,Codigo,Quantidade,id) VALUES (?, ?, ?, ?, ?)";
                 PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                 statement.setString(1, f.getNome());
                 statement.setString(2, f.getCategoria());
                 statement.setString(3, f.getCodigo());
                 statement.setString(4, f.getQuantidade());
                 statement.setString(5, f.getid());
          
            

                 int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                 if (rowsInserted > 0) {
                     System.out.println("Novo usuário inserido com sucesso");
                 }
                 statement.close();
             }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList listar(){
        return null;
}
}