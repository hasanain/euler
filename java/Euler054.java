import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/*
 Project Euler Problem 54
 ========================

 In the card game poker, a hand consists of five cards and are ranked, from
 lowest to highest, in the following way:

 * High Card: Highest value card.
 * One Pair: Two cards of the same value.
 * Two Pairs: Two different pairs.
 * Three of a Kind: Three cards of the same value.
 * Straight: All cards are consecutive values.
 * Flush: All cards of the same suit.
 * Full House: Three of a kind and a pair.
 * Four of a Kind: Four cards of the same value.
 * Straight Flush: All cards are consecutive values of same suit.
 * Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.

 The cards are valued in the order:
 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace.

 If two players have the same ranked hands then the rank made up of the
 highest value wins; for example, a pair of eights beats a pair of fives
 (see example 1 below). But if two ranks tie, for example, both players
 have a pair of queens, then highest cards in each hand are compared (see
 example 4 below); if the highest cards tie then the next highest cards are
 compared, and so on.

 Consider the following five hands dealt to two players:

 Hand   Player 1            Player 2              Winner
 1      5H 5C 6S 7S KD      2C 3S 8S 8D TD        Player 2
 Pair of Fives       Pair of Eights
 2      5D 8C 9S JS AC      2C 5C 7D 8S QH        Player 1
 Highest card Ace    Highest card Queen
 3      2D 9C AS AH AC      3D 6D 7D TD QD        Player 2
 Three Aces          Flush with Diamonds
 4D 6S 9H QH QC      3D 6D 7H QD QS
 4      Pair of Queens      Pair of Queens        Player 1
 Highest card Nine   Highest card Seven
 2H 2D 4C 4D 4S      3C 3D 3S 9S 9D
 5      Full House          Full House            Player 1
 With Three Fours    with Three Threes

 The file poker.txt contains one-thousand random hands dealt to two players.
 Each line of the file contains ten cards (separated by a single space): the
 first five are Player 1's cards and the last five are Player 2's cards. You
 can assume that all hands are valid (no invalid characters or repeated
 cards), each player's hand is in no specific order, and in each hand there
 is a clear winner.

 How many hands does Player 1 win?
 */

public class Euler054 {
	private enum Suit {
		Clubs, Diamonds, Hearts, Spades;
	}

	private enum Rank {
		Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(
				10), Jack(11), Queen(12), King(13), Ace(14);
		public int rank;

		private Rank(int rank) {
			this.rank = rank;
		}
	}

	private class Card implements Comparable<Card> {
		public Suit s;
		public Rank r;

		public Card(Suit s, Rank r) {
			this.s = s;
			this.r = r;
		}

		@Override
		public int compareTo(Card o) {

			return this.r.compareTo(o.r);
		}

		public boolean equals(Object c) {
			if (c instanceof Card) {
				Card o = (Card) c;
				return (this.r == o.r && this.s == o.s);
			}
			return false;
		}
	}

	private class Hand implements Comparable<Hand>{
		ArrayList<Card> cards;
		public Hand(Card c1, Card c2, Card c3, Card c4, Card c5){
			cards = new ArrayList<Card>();
			cards.add(c1);
			cards.add(c2);
			cards.add(c3);
			cards.add(c4);
			cards.add(c5);
			Collections.sort(cards);
		}
		@Override
		public int compareTo(Hand h) {
			for(int i = 0; i < cards.size(); i++){
				if(cards.get(i).compareTo(h.cards.get(i) > 0){
					
				}
			}
			return ;
		}
		
	}

	public static void main(String[] args) {
		Date start, end;
		start = new Date();

		end = new Date();
		System.out.println("Execution Time: "
				+ (end.getTime() - start.getTime()));
	}
}
