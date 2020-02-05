package com.mawote.xadrez;

import com.mawote.tabuleirodojogo.Peca;
import com.mawote.tabuleirodojogo.Tabuleiro;

public class PecaDeXadrez extends Peca {
	
	private Cor cor;

	public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	
}
