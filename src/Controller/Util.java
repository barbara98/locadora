/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author info206
 */
class Util {

    public Util() {
    }

    Connection conecta() {
         Connection conexao = null;

        String url = "jdbc:mysql://192.200.63.121/Locadora";  //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = "123456"; //senha do MySQL
        try {
            conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException sqlex) {
            System.out.println("Erro na conexão " + sqlex);
        }
        return conexao;
    }
    
}
