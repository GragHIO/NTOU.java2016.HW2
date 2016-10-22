//HW2 UNOcard.java

package ntou.cs.java2016.jimmy;

public class UNOcard
{
	public static final int INVALID = -1;
	
	//enum type{NUMBER, SKIP, DRAW2};
	//enum colorSuit{BLUE, GREEN, RED, YELLOW};
	
	private int number;
	//private UNOType cardType = new UNOType();
	private UNOType.type ccardType;
	//private ColorType cardColor = new ColorType();
	private ColorType.colorSuit ccardColor;
	
	public UNOcard(int initNumber, UNOType.type initType, ColorType.colorSuit initColor)
	{
		number = initNumber;
		ccardType = initType;
		ccardColor = initColor;
	}
	
	public String toString()
	{
		if(ccardType == UNOType.type.NUMBER) return String.format("%s", ccardColor) + " " + number;
		return String.format("%s", ccardColor) + " " + String.format("%s", ccardType);
	}
}