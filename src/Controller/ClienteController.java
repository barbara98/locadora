/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author info206
 */

//
public class ClienteController {
    //CRUD
    public void Cadastrar(Cliente c) throws SQLException {
        try {

            Util util = new Util();
            Connection conexao = util.conecta();
            String sql = "INSERT INTO Cliente (Nome, Endereco, Email, Data_de_nascimento , Telefone, CPF) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, c.getNome());
            statement.setString(2, c.getEndereco());
            statement.setString(3, c.getEmail());
            statement.setString(4, c.getData_de_nascimento());
            statement.setString(5, c.gettelefone());
            statement.setString(6, c.getcpf()); 
            

            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo usuário inserido com sucesso");
            }
            statement.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList listar(){
        return null;
    
    }
    
}
