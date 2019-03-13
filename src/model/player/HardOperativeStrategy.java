package model.player;

import model.board.Bipartite;
import model.board.Card;
import model.board.CardType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.board.Clue;

/**
 * Hard mode strategy: The operatives know exactly where their cards are.
 * 
 * @author Simon Huang
 *
 */

public class HardOperativeStrategy implements OperativeStrategy{
	
	private CardType team;
        private Clue currentClue;
	
	/**
	 * Constructor for HardOperativeStrategy
	 * @param team The team of the Operative (Takes a CardType)
	 */
	public HardOperativeStrategy(CardType team){
		this.team = team;
	}
	

	/**
	 * Loops through all the cards and add the cards of their team into an ArrayList (cardsToChoose)
	 * Then picks a card at random from the ArrayList
	 */
	@Override
	public Card pickCard(List<Card> cards, Bipartite bipartite) {
		List<Card> cardsToChoose = new ArrayList<Card>();
		
		for(Card card : cards) {
			if(card.getTypeProperty() == team) {
				cardsToChoose.add(card);
			}
		}
		
		Random rand = new Random();
		return cardsToChoose.get(rand.nextInt(cardsToChoose.size()));
	}

    @Override
    public Clue getClue() {
return currentClue;   
    }

    @Override
    public void setClue(Clue clue) {
currentClue = clue;
    }

}
