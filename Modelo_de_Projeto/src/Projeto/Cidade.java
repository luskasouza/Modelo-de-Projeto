package Projeto;

/**
 *
 * @author Lukas Souza
 */
public class Cidade {
    private String nome;
    private String uf;
    private double quilometro; 

    public Cidade() {
    }

    public Cidade(String nome, String uf, double quilometro) {
        this.nome = nome;
        this.uf = uf;
        this.quilometro = quilometro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getQuilometro() {
        return quilometro;
    }

    public void setQuilometro(double quilometro) {
        this.quilometro = quilometro;
    }
    
}
