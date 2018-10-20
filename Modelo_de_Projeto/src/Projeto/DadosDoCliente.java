package Projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lukas Souza
 */
public class DadosDoCliente {
    List<Cliente> clientes = new ArrayList<Cliente>();
    public void adicionarContado(Cliente contato) {
        clientes.add(contato);
	}
    public String quantidadeContado() {
	return clientes.size()+"";
	}
    public String quantidadeClite() {
		return clientes.size()+"";
	}
    public Cliente removeCliente(){
        int i = 0;
        return clientes.remove(i);
    }
}
