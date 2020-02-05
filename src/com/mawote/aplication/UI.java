package com.mawote.aplication;

import com.mawote.xadrez.PecaDeXadrez;

public class UI {
	
	public static void imprimaTabuleiro(PecaDeXadrez[][] pecas) {
		for(int i=0;i<pecas.length;i++) {
			System.out.print((8 - i) + " ");
			for(int j=0;j<pecas.length;j++) {
				imprimaPeca(pecas[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void imprimaPeca(PecaDeXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}
		else {
			System.out.print("peca");
		}
		System.out.print(" ");
	}
}
