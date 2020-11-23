package javaAssigment;

import java.util.Scanner;

public class SearchOperation {
	
	public static int countOccurence(String searchWord, String search){
		
		String[] str = search.split(" ");
		
		int count=0;
		
		for(int i=0; i<str.length; i++){
			if(searchWord.equalsIgnoreCase(str[i])){
				count++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter input  :: ");
		String search = sc.nextLine();
		
		System.out.print("Please Enter word to search  ::  ");
		String searchWord = sc.nextLine();
		
		System.out.println(countOccurence(searchWord, search));
		
		sc.close();

	}

}
