package com.mawote.aplication;

import com.mawote.xadrez.PartidaDeXadrez;

public class JogoDeXadrezProgram {

	public static void main(String[] args) {

		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		UI.imprimaTabuleiro(partidaDeXadrez.getPecas());
	}

}
