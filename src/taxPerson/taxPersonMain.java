package taxPerson;

import java.util.Scanner;

public class taxPersonMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double initialPrice = -1.0;
		String luxuryStatusInput = "";  
		
		do{
		System.out.println("Please input the price of an item as an integer or floating point number with two decmials");
		initialPrice = parseCostInput(scan.nextLine());
		}while(initialPrice == -1.0);
		
		do {
			System.out.println("Please input 'yes' if this is a luxury item, which covers everything not needed for basic survival");
			luxuryStatusInput = scan.nextLine();
		}while(!(luxuryStatusInput.matches("yes") || luxuryStatusInput.matches("no")));
		
		Item itemToPrice = new Item();
		itemToPrice.setIsLuxury(parseLuxuryStatus(luxuryStatusInput));
		itemToPrice.setCost(initialPrice);
		
		System.out.println("Item cost is: " + itemToPrice.calculateCostAfterTax());
	}
	
	public static double parseCostInput(String costInput){
		
		if(costInput.matches("\\d+\\.\\d") || costInput.matches("\\d+\\.\\d\\d") || costInput.matches("\\d+")){
			return Double.parseDouble(costInput);
		}
		return -1.0;
	}
	
	public static Boolean parseLuxuryStatus(String isLuxuryInput){
		
		if(isLuxuryInput.matches("yes")){
			return true;
		}
		return false;
	}
}
