package Projeto;

import java.util.Date;

/**
 *
 * @author Lukas Souza
 */
public class Passagem {
    private double preco;
    private String destino;
    private Date data;
    public Passagem(){
    }
    public Passagem(double preco, String destino, Date data){
        this.preco = preco;
        this.destino = destino;
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
