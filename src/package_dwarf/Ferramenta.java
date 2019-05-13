/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_dwarf;


public class Ferramenta {
    private String nomeFerramenta;
    private int quantidade;
    private int dano = 0;
    private int peso;

    public Ferramenta(String nomeFerramenta, int quantidade, int dano, int peso) {
        this.nomeFerramenta = nomeFerramenta;
        this.quantidade = quantidade;
        this.dano = dano;
        this.peso = peso;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getDano() {
        return dano;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return  nomeFerramenta ;
    }
    
    
}
