package romanLeet;

import java.util.HashMap;
import java.util.Map;

public class consecutiveMinCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = {3,4,2,3,4,7};
		System.out.println(minimumCardPickup(cards));
	}

	public static int minimumCardPickup(int[] cards)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < cards.length; i++)
        {
            if(map.containsKey(cards[i]))
                {
            	
            	min = Math.min(i-map.get(cards[i])+1,min);
            	System.out.println(i + " " + map.get(cards[i])+1);
                }
            map.put(cards[i],i); 
        }
        return min == Integer.MAX_VALUE?-1:min;
    }

}
