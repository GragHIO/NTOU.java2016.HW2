//HW2 DeckOfUNOcards.java
package ntou.cs.java2016.jimmy;

import java.util.Random;

public class DeckOfUNOcards
{
	private final int NUMBER_OF_CARDS = 48;
	private UNOcard deck[];
	private int currentCard;
	private Random randomNumbers;
	
	public DeckOfUNOcards()
	{
		deck = new UNOcard[NUMBER_OF_CARDS];
		
		for(int i = 0; i < NUMBER_OF_CARDS ; ++i)
		{
			switch(i % 12)
			{
				case 10:
					deck[i] = new UNOcard(UNOcard.INVALID, UNOType.type.SKIP, ColorType.colorSuit.getValue(i/12));
					break;
				case 11:
					deck[i] = new UNOcard(UNOcard.INVALID, UNOType.type.DRAW2, ColorType.colorSuit.getValue(i/12));
					break;
				default:
					deck[i] = new UNOcard(i % 12, UNOType.type.NUMBER, ColorType.colorSuit.getValue(i/12));
			}
		}
	}//end of DeckOfUNOcards ctor
	
	public void shuffle()
	{
		currentCard = 0;
		
		for(int first = 0 ; first < deck.length ; first++)
		{
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			UNOcard temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public UNOcard dealCard()
	{
		if(currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}
}