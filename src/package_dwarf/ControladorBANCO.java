/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_dwarf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ControladorBANCO {
    Connection conexaoDB;
    String URL_DB = "jdbc:mysql://localhost:3306/dwarf";
    
    public ControladorBANCO(){
        try{
            conexaoDB = DriverManager.getConnection(URL_DB, "root", null);
            System.out.println("Conexao concluida com exito");
        }catch(SQLException sqle){
            System.out.println(sqle);
        }   
    }
    
    public void inserirFerramenta(Ferramenta ex){
        try{
            String nome = ex.getNomeFerramenta();
            int qtd = ex.getQuantidade();
            int dano = ex.getDano();
            int peso = ex.getPeso();
            
            System.out.println( nome + qtd + dano + peso);
            
            Statement comando = conexaoDB.createStatement();
            String sqlInsert = "INSERT INTO `tb_ferramenta` (`ID`, `tb_nome`, `tb_quantidade`, `tb_dano`, `tb_peso`) "
                + "VALUES(NULL,\'"+ nome +"\', "+ qtd +", "+ dano +", "+ peso +")";

            comando.executeUpdate(sqlInsert);
            comando.close();            
        }catch(SQLException sqle){
                 System.out.println(sqle);   
        }  
    }
    public void recuperarFerramentas(ArrayList<Ferramenta> lista){
        try{
            Statement comando = conexaoDB.createStatement();
            String sqlQuery = "SELECT * "
                            + "FROM tb_ferramenta";
            ResultSet resultado = comando.executeQuery(sqlQuery);
            while(resultado.next()){
                String nome = resultado.getString("tb_nome");
                int quantidade = resultado.getInt("tb_quantidade");
                int dano = resultado.getInt("tb_dano");
                int peso = resultado.getInt("tb_peso");
                Ferramenta e = new Ferramenta(nome, quantidade, dano, peso);
                lista.add(e);                
            }            
        }catch(SQLException se){
             System.out.println(se);  
        }
    }   
}