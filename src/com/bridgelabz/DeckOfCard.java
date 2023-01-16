package com.bridgelabz;

public class DeckOfCard {
	
	String [] suit = {"club", "diamond", "heart", "spead"};
	String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
	
	String [][] cardDeck = new String [4][13];
	
	String[] player1Cards = new String [9];
	String[] player2Cards = new String [9];
	String[] player3Cards = new String [9];
	String[] player4Cards = new String [9];
	
	void createCardDeck() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				cardDeck[i] [j] = suit[i] + rank[j];
			}
		}
		System.out.println("Deck of cards created.\n");
	}
	
	void showCardDeck() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				System.out.print(cardDeck[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	
	void suffleDeck() {
		for (int i = 0; i < cardDeck.length; i++) {
			for (int j = 0; j < cardDeck[i].length; j++) {
				int x = (int) (Math.random() * 10 % 4);
				int y = (int) (Math.random() * 10 % 13);
				String temp = cardDeck[i][j];
				cardDeck[i][j] = cardDeck[x][y];
				cardDeck[x][y] = temp;
			}
		}
		System.out.println("Card Deck suffled successfully.\n");
	}
	
	void distributeCard(){
		for(int i = 0; i < 4; i++) {
			for(int j= 0; j < 9; j++) {
				if(i == 0)
					player1Cards[j] = cardDeck[i][j];
				if(i ==1)
					player2Cards[j] = cardDeck[i][j];
				if(i == 2)
					player3Cards[j] = cardDeck[i][j];
				if(i ==3)
					player4Cards[j] = cardDeck[i][j];
			}
		}
		System.out.println("9 Cards are distributed to each player.");
		
		System.out.println("Player1 cards: ");
		showArray(player1Cards);
		
		System.out.println("Player2 cards: ");
		showArray(player2Cards);
		
		System.out.println("Player3 cards: ");
		showArray(player3Cards);
		
		System.out.println("Player4 cards: ");
		showArray(player4Cards);	
	}
	
	
	void showArray(String[] array) {
		System.out.print("{ ");
		for (String i : array) {
			System.out.print(i + "  ");
		}
		System.out.println(" }");
	}

	public static void main(String[] args) {
		DeckOfCard deck1 = new DeckOfCard();
		
		deck1.createCardDeck();
		deck1.showCardDeck();
		deck1.suffleDeck();
		deck1.showCardDeck();
		
		deck1.distributeCard();
	}

}
