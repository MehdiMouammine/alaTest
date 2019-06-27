package com.alaTest.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Phone = args[0]; 
		List<String> Prefixes = getPrefixes(Phone);
		List<List<List<String>>> Operators = getOperators();
		getCall(Operators,Prefixes);
	}

	private static void getCall (List<List<List<String>>> Operators, List<String> Prefixes){
		/*In this function we take the phone number given by the user and divide get the prefixes from it 
		 * and since the exercise didn't specify any length of the prefixes i used the phone number length-1*/
		Boolean found = false;
		float pri = 10;
		int ope = 0;
		
		for(String pref: Prefixes){
			for(List<List<String>> operator: Operators){
				List<String> prefixes = operator.get(0);
				List<String> prices = operator.get(1);
				for(int i = 0; i < prefixes.size(); i++){
					float curpri =  Float.parseFloat(prices.get(i));
					if(prefixes.get(i).equals(pref) && curpri < pri){
						pri =  Float.parseFloat(prices.get(i));
						ope =  Operators.indexOf(operator)+1;
						found = true;
					}
				}
			}
			if(found){
				break;
			}
		}
		
		if(found){
			System.out.print("The best operator to make this call is operator number "+ope+" the price will be "+pri+"/min\n*****************************************\n");
		}
		else{
			System.out.print("Sorry none of our operators can handle your number\n*****************************************\n");
		}
	}
	
	private static List<String> getPrefixes(String Phone){
		/*In this function we take the phone number given by the user and divide get the prefixes from it 
		 * and since the exercise didn't specify any length of the prefixes i used the phone number length-1*/
		List<String> Prefixes = new ArrayList<>();
		
		for(int i = 1; i < Phone.length(); i++){
		   Prefixes.add(Phone.substring(0,Phone.length() - i));
		}
		
		return Prefixes;
	}
	
	private static List<List<List<String>>> getOperators(){
		/*In this function we create a list of operators with prefixes they can handle and the prices they offer 
		 * we can change this function to fetch from a database or to read from a JSON file or a properties file 
		 * but for now we are providing the data statically as the exercise requires*/
		List<String> Prefixes1 = new ArrayList<>(), Prefixes2 = new ArrayList<>(), Prefixes3 = new ArrayList<>();
		List<String> Prices1 = new ArrayList<>(), Prices2 = new ArrayList<>(), Prices3 = new ArrayList<>();
		List<List<String>> Operator1 = new ArrayList<>(),Operator2 = new ArrayList<>(),Operator3 = new ArrayList<>();
		List<List<List<String>>> Operators = new ArrayList<>();
		
		Prefixes1.addAll(Arrays.asList("21","212","2125","91","9199","919903","621","62155577"));
		Prices1.addAll(Arrays.asList("0.9","1.1","1.4","0.8","1.0","1.3","0.9","1.5"));
		Operator1.add(Prefixes1);
		Operator1.add(Prices1);
		Operators.add(Operator1);
		
		Prefixes2.addAll(Arrays.asList("21","215","25","91","919","919903","787","1255667"));
		Prices2.addAll(Arrays.asList("0.8","1.1","1.4","0.7","1.0","1.5","0.9","1.5"));
		Operator2.add(Prefixes2);
		Operator2.add(Prices2);
		Operators.add(Operator2);
		
		Prefixes3.addAll(Arrays.asList("1","212","2125","971","919","6622","621","62155577"));
		Prices3.addAll(Arrays.asList("0.9","1.0","1.9","0.8","1.7","1.3","0.7","1.2"));
		Operator3.add(Prefixes3);
		Operator3.add(Prices3);
		Operators.add(Operator3);
		
		return Operators;
	}
}
