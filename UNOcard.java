//HW2 UNOcard.java

package ntou.cs.java2016.jimmy;

public class UNOcard
{
	public static final int INVALID = -1;
	
	//enum type{NUMBER, SKIP, DRAW2};
	//enum colorSuit{BLUE, GREEN, RED, YELLOW};
	
	private int number;
	private UNOType cardType = new UNOType();
	private ColorType cardColor = new ColorType();
	
	public UNOcard(int initNumber, UNOType initType, ColorType initColor)
	{
		number = initNumber;
		cardType.type = initType.type;
		cardColor.colorSuit = initColor.colorSuit;
	}
	
	public String toString()
	{
		if(cardType.type == UNOType.type.NUMBER) return String.format("%s", cardColor.colorSuit) + " " + number;
		return String.format("%s", cardColor.colorSuit) + " " + String.format("%s", cardType.type);
	}
}