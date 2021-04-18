package Models;

import java.util.ArrayList;

public class Exemples extends Operation_1 {

	public Exemples() {
		super();
	}
	
	public ArrayList<Integer> Test(int num) {
		ArrayList<Integer> test=new ArrayList<Integer>();
		switch (num) {
		case 0:
			test.add(4);
			test.add(3);
			test.add(2);
			test.add(2);
			test.add(2);
			test.add(1);
			break;
		case 1:
			test.add(5);
			test.add(2);
			test.add(2);
			test.add(1);
			test.add(2);
			test.add(1);
			break;
		case 2:
			test.add(2);
			test.add(4);
			test.add(4);
			test.add(3);
			test.add(1);
			test.add(1);
			break;
			
		case 3:
			test.add(4);
			test.add(1);
			test.add(9);
			test.add(6);
			test.add(8);
			test.add(4);
			break;
			
		case 4:
			test.add(2);
			test.add(1);
			test.add(8);
			test.add(8);
			test.add(1);
			test.add(5);
			break;
			
		case 5:
			test.add(2);
			test.add(0);
			test.add(8);
			test.add(4);
			test.add(0);
			test.add(3);
			break;
			
		case 6:
			test.add(2);
			test.add(0);
			test.add(4);
			test.add(6);
			test.add(0);
			test.add(0);
			break;

		case 7:
			test.add(0);
			test.add(3);
			test.add(3);
			test.add(1);
			test.add(2);
			test.add(1);
			break;
		case 8:
			test.add(0);
			test.add(0);
			test.add(3);
			test.add(5);
			test.add(2);
			test.add(1);
			break;
		case 9:
			test.add(7);
			test.add(9);
			test.add(3);
			test.add(0);
			test.add(0);
			test.add(1);
			break;	
	
		}
		return test;
		
	}
	

}
