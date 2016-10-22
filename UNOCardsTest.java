//HW2 UNOCardsTest.java
package ntou.cs.java2016.jimmy;

public class UNOCardsTest
{
	
	
	public static void main( String args[] )
	{		
		DeckOfUNOcards deck = new DeckOfUNOcards();
		
		System.out.println("Before shuffle:");
		for(int i = 0 ; i < 48  ; ++i)
		{
			System.out.printf("%s\n", deck.dealCard());
		}
		
		System.out.println("\nAfter shuffle\n");
		deck.shuffle();
		for(int i = 0 ; i < 48  ; ++i)
		{
			System.out.printf("%s\n", deck.dealCard());
		}
	}
}