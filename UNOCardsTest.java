//HW2 UNOCardsTest.java
package ntou.cs.java2016.jimmy;

public class UNOCardsTest
{
	
	
	public static void main( String args[] )
	{		
		DeckOfUNOcards deck = new DeckOfUNOcards();
		for(int i = 0 ; i < 48  ; ++i)
		{
			System.out.printf("%s\n", deck.dealCard());
		}
	}
}