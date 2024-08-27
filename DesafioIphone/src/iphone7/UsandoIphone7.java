package iphone7;

import funçoesIphone.*;

public class UsandoIphone7 {

	public static void main(String[]args) {
		Iphone iphone = new Iphone();
		
		
		Navegador navegar = iphone;
		ReprodutorMusical reproduzirMusica = iphone; 
		Telefone  telefone = iphone; 
		
		navegar.exibirPagina(" http//:iphone7.com");
		navegar.adicionarNovaAba();
		navegar.atualizarPagina();
		
		reproduzirMusica.selecionarMusica(" Musica 1");
		reproduzirMusica.tocar();
		reproduzirMusica.pausar();
		
		telefone.atender();
		telefone.ligar("(85)515475528");
		telefone.iniciarCorreiodeVoz();
	}
}
