package br.com.dio.desafio.dominio;

public class Ementa {
	
	Conteudo conteudo;	
	
	public Ementa(Conteudo conteudo) {
		super();
		this.conteudo = conteudo;
	}
	
	public Conteudo getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}		
	
	public String toString() {
		return "Titulo: " + conteudo.getTitulo()+"\n"+
				"Ementa: " + conteudo.getDescricao()+"\n"+
				"Codigo do Curso: " + conteudo.hashCode() +"\n"+
				"XP: " + conteudo.XP_PADRAO+"\n";
	}
	
}