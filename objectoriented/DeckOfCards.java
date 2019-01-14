package com.bridgelabz.objectoriented;


import com.bridgelabz.utility.Utility;

public class DeckOfCards {


	
	public static void main(String[] args) {

		 String suits[] = {"Clubs","Diamonds", "Hearts", "Spades"};
		String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		 String cardssString[][]= new String[suits.length][rank.length];
		Utility.card(cardssString, rank, suits);
		Utility.cardShuffle(cardssString, rank, suits);
		Utility.printcards(cardssString);
		
		
//		 DeckOfCards ddCards = new DeckOfCards();
//		
//		ddCards.suffleCards();
//		ddCards.showCards();
//		
//		String[] cccc = deckArrayList.toArray(new String[deckArrayList.size()]);
//		int x=0;
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<9;j++) {
//				cardshuffle[i][j]=cccc[x++];
//			}
//		}
//		System.out.println("array");
//		for(String ds:cccc) {
//			System.out.println(ds);
//		}
		
	}
}
