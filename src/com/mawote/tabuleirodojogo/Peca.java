package com.mawote.tabuleirodojogo;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca() {
	}
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}
	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
