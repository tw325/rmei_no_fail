
import java.util.*;

public class dice{
	private int sides;
	public dice(int s){	
		sides = s;
	}
	public int roll(){
		int x = (int)(Math.random()*sides) + 1;
		return x;
	}						
	public int countTimes(){
		int start=0;
		int count=0;
		int num;
		while (start < 100){
			num = roll();
			if (num < 50){
				count += 1;
			}
			start+=1;
		}
		return count;

	}
	public static void main(String[] args){
		dice dice1 = new dice(100);
		//System.out.println(dice1.roll());
		System.out.println(dice1.countTimes());
	}
}