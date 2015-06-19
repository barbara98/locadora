/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author info206
 */

//
public class ClienteController {
    private String cpf;
    //CRUD
    public void Cadastrar(Cliente c) throws SQLException {
        try {

            Util util = new Util();
            Connection conexao = util.conecta();
            String sql = "INSERT INTO Cliente (Nome, Endereço, Email, Data_de_nascimento , Telefone, CPF) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, c.getNome());
            statement.setString(2, c.getEndereco());
            statement.setString(3, c.getEmail());
            statement.setDate(4, c.getData_de_nascimento());
            statement.setInt(5, c.getTelefone());
            statement.setInt(6, c.getCpf()); 
            

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
    
     public Vector  getNomes(){
                    Vector s =new Vector();

        try {
     Util util= new Util();
     Connection conexao = util.conecta();
     String sql= "Select Nome from Cliente";
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
    
          public int  PegaIdPeloNomeSelecionado(String nome){
        int id=-1;
            try {
            Util util= new Util();
            Connection conexao = util.conecta();
            String sql= "Select idCliente from Cliente where Nome like '"+nome+"'";
                Statement statement = conexao.createStatement();
          ResultSet result = statement.executeQuery(sql);
           while (result.next()){               
               id=result.getInt("idCliente");
            }
       } catch (SQLException ex) {
            Logger.getLogger(FilmeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public ArrayList listar(){
        return null;
    
    }

    public Cliente getPessoaByCPF(int cpf) throws SQLException {
       String sql = "SELECT * FROM Cliente WHERE CPF like '" + cpf+"';" ; //Consulta SQL
        Util util = new Util(); //inicializando minha classe q faz conexão com banco de dados
        Connection conexao = util.conecta(); //faz a conexão com banco
        Statement statement = conexao.createStatement();//usa da conqxão para pegar a credencial para acesso ao banco
        ResultSet result = statement.executeQuery(sql);//executa a consulta SQL e agora retoena valores, por isso ResultSet
        Cliente c = null;  //declaração de variavel  pessoa 
        while (result.next()) {
    c = new Cliente(result.getString("Nome"), result.getString("Endereço"), result.getString("Email"), result.getInt("idCliente"), result.getInt("Telefone"), result.getInt("CPF"));// inicializa pessoa
        
        }
        
        return c ;
    }

    public ArrayList<Cliente> getAll() {
try {
            String sql = "SELECT * FROM Cliente";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Cliente> lista = new ArrayList<Cliente>();
            int count = 0;

            while (result.next()) {
                Cliente p = new Cliente(result.getString("Nome"), result.getString("Endereço"), result.getString("Email"), result.getInt("Data_de_nascimento"),result.getInt("Telefone") , result.getInt("CPF"));// inicializa pessoa
                lista.add(p);
            }
  statement.close();
            conexao.close();
            return lista;
          

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }   
    
    }

}
    
