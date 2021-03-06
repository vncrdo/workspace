package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementarVendaConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venda objeto = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.s("Data"),
				Magica.f("Total"),
				new Produto(
						Magica.i("ID"),
						Magica.s("Descri��o"),
						Magica.i("Qtde"),
						Magica.f("Valor Compra"),
						Magica.f("Valor de Venda")
						),
				new Cliente(
						Magica.i("ID do Cliente"),
						Magica.s("Nome"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("CEP"),
								Magica.s("Numero"),
								Magica.s("Complemento")
								)
						)
				
						
				);
		System.out.println(objeto.getAll());
	}

}
