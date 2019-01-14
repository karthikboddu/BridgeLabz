package com.bridgelabz.objectoriented;

import com.bridgelabz.datastructures.LinkedListString;
import com.bridgelabz.utility.Utility;

public class DeckOfCardsQueue {

	public static void main(String[] args) {
		
		String suits[] = {"Clubs","Diamonds", "Hearts", "Spades"};
		String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		LinkedListString[] cards = new LinkedListString[52];
		int index =0;
		for(int i=0;i<52;i++) {
			cards[i] = new LinkedListString();
		}
		
		for(int i=0;i<suits.length;i++) {
			for(int j=0;j<rank.length;j++) {
				cards[index++].insert(rank[j]+" "+suits[i]);
			}
		}
		
		String players[][] = Utility.distributeCards(cards);
		
	}

}
