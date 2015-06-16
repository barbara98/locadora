/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Aluguel {
    
    String nota_fiscal,data_aluguel,data_devolução;
    int idAluguel;

    public Aluguel(String nota_fiscal, String data_aluguel, String data_devolução, int idAluguel) {
        this.nota_fiscal = nota_fiscal;
        this.data_aluguel = data_aluguel;
        this.data_devolução = data_devolução;
      
    }

    public Aluguel(String nota_fiscal, String data_aluguel, String data_devolução) {
        this.nota_fiscal = nota_fiscal;
        this.data_aluguel = data_aluguel;
        this.data_devolução = data_devolução;
    }
    
    


    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    
    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getData_aluguel() {
        return data_aluguel;
    }

    public void setData_aluguel(String data_aluguel) {
        this.data_aluguel = data_aluguel;
    }

    public String getData_devolução() {
        return data_devolução;
    }

    public void setData_devolução(String data_devolução) {
        this.data_devolução = data_devolução;
    }

   
    
    
    
}
