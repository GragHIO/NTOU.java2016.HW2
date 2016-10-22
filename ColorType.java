//HW2 ColorType.java

package ntou.cs.java2016.jimmy;

public class ColorType
{
	public enum colorSuit{
		BLUE, GREEN, RED, YELLOW, NONE;
		public static ColorType.colorSuit getValue(int i) {
			switch (i) {
				case 0: return BLUE;
				case 1: return GREEN;
				case 2: return RED;
				case 3: return YELLOW;
			}
			return NONE;
		}
	}
}