import java.util.Iterator;

public class CardSort {

	public static void main(String[] args) {
		
	   int[]cards= {1,2,4,5,3,7,6,9,8};
	   
	   for (int i = 0; i < cards.length; i++) {
		for (int j = i+1; j < cards.length; j++) {
			if (cards[j]<cards[i]) {
				int swap=cards[j];
				cards[j]=cards[i];
				cards[i]=swap;
			}
		}
		
	}
	   
	   for (int i = 0; i < cards.length; i++) {
		System.out.println(cards[i]);
	}
	}
}
