package iphone7;

import funçoesIphone.*;

public class Iphone implements ReprodutorMusical,Navegador,Telefone {
	
	

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
		
	}

	@Override
	public void iniciarCorreiodeVoz() {
		System.out.println("Iniciar correio de voz");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Aba criada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocar Musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pusar Musica");
		
	}


	@Override
	public void ligar(String num) {
		System.out.println("Ligar para "+num );
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibir Pagina WEB"+url);
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecione uma Musica"+musica);
		
	}

}
