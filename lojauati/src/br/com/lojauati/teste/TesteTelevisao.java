package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisao objeto = new Televisao();
		
		//objeto.aumentarVolume();
		//objeto.aumentarVolume();
		//objeto.aumentarVolume();
		//.aumentarVolume();
		System.out.println(objeto.exibirTudo());
		//objeto.ligar();
		//objeto.mudarCanal(10);
		//objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.mudarCanal(30);
		System.out.println(objeto.exibirTudo());
		
		objeto.ligar();
		objeto.mudarCanal(600);
		objeto.mudarCanal(30);
		objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.desligar();
		objeto.aumentarVolume();
		objeto.diminuirVolume();
		System.out.println(objeto.exibirTudo());
		
	}

}