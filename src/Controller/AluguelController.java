/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aluguel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author info206
 */
public class AluguelController {
       public void Cadastrar(Aluguel a) throws SQLException {
         Util util = new Util();
          try (Connection conexao = util.conecta()){
         String sql ="INSERT INTO Aluguel (Nota_fiscal,Data_aluguel,Data_devolução,idAluguel,Cliente_idCliente)VALUES (?, ?, ?,?,?)";
         PreparedStatement statement = conexao.prepareStatement(sql);
         statement.setString(1, a.getNota_fiscal());
         statement.setString(2, a.getData_aluguel());
         statement.setString(3, a.getData_devolução());
      //Lembrar de pegar o id do aluguel(q não é auto incremento) e do cliente
         statement.setInt(4, 2);
            
    
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
     

