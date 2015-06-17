/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author info206
 */
public class FilmeController {
     public void Cadastrar(Filme f) throws SQLException {
        try {

            Util util = new Util();
             try (Connection conexao = util.conecta()) {
                 String sql = "INSERT INTO Filme (Nome,Categoria,Codigo,Quantidade) VALUES (?, ?, ?, ?)";
                 PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                 statement.setString(1, f.getNome());
                 statement.setString(2, f.getCategoria());
                 statement.setString(3, f.getCodigo());
                 statement.setString(4, f.getQuantidade());
                 
                
          
            

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
  
      /*  Essa função tem por finalidade popular o Combobox*/
    public Vector  getNomes(){
                    Vector s =new Vector();

        try {
     Util util= new Util();
     Connection conexao = util.conecta();
     String sql= "Select * from Filme";
         Statement statement = conexao.createStatement();
   ResultSet result = statement.executeQuery(sql);
   while (result.next()){               
        s.add(result.getString("Nome"));
     }
            
     

        } catch (SQLException ex) {
            Logger.getLogger(FilmeController.class.getName()).log(Level.SEVERE, null, ex);
        }
         return s;

    }
    
     public int  PegaIdPeloNomeSelecionado(String nome) throws SQLException{
        int id=-1;
            Util util= new Util();
            Connection conexao = util.conecta();
            String sql= "Select * from Filme where Nome like '"+nome+"'";
                Statement statement = conexao.createStatement();
          ResultSet result = statement.executeQuery(sql);
           while (result.next()){               
               id=result.getInt("idFilme");
            }

        return id;
    }
    public ArrayList listar(){
        return null;
}
}