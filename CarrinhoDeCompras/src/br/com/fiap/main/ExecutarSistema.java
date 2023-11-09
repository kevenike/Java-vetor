package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class ExecutarSistema {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	// valor total da compra 
	static double valorTotal(Produto[] p , int i) {
		double total = 0;
		
		for(int c = 0; c < i ;  c ++) {
			total += p[c].getPreco() * p[c].getQuantidade();
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		// instaciar objetos
		
		// preparar a quantidade de posiçoes
		Produto[] produto = new Produto[3];
		
		// controlar posiçoes de entrada de cada produto
		int indice = 0;
		
		// faça
		do {
		
			produto[indice] = new Produto();
			
		    produto[indice].setCodigo(inteiro("digite o codigo"));
		    produto[indice].setTipo(texto("Digite o tipo"));
		    produto[indice].setMarca(texto("Digite a marca"));
		    produto[indice].setQuantidade(inteiro("digite a quantidade"));
		    produto[indice].setPreco(real("Digite o valor"));
		    
		    indice ++;
		// enquanto
		}while(JOptionPane.showConfirmDialog(null, "Adicionar no carrinho de compras", 
											"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		// For
		for(int contador = 0; contador < indice; contador++) {
			System.out.println("\n\nCodigo: " + produto[contador].getCodigo() +
							"\ntipo: " + produto[contador].getTipo() +
							"\nMarca: " + produto[contador].getMarca() +
							"\nQuantidade: " + produto[contador].getQuantidade() +
							"\nPreço: " + produto[contador].getPreco());
		}
		
			System.out.println("\n\nValor Total: " + valorTotal(produto, indice));
		
		
	}
}
