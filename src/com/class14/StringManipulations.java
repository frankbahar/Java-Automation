package com.class14;

public class StringManipulations {

	public static void main(String[] args) {
		// 1 replace() will replace old char or value with new char or value 
		String str = "I am good tester#1!";
		String newStr = str.replace("a", "e");
		System.out.println(newStr);
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		String newStr2 = str.replace("tester", "programmer");
		System.out.println(newStr2);
		
		str = str.replace("!", "?");
		System.out.println(str);
		
		str = str.replace("1", "2");
		System.out.println(str);

		//2
		String str1 = "12Hello 3234 World 465%^%";
		String replacedNoNumber = str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumber);
		replacedNoNumber = str1.replaceAll("\\d", "");
		System.out.println(replacedNoNumber);
		
		String replacedNoCharacter = replacedNoNumber.replaceAll("[A-Za-z]","");
		System.out.println(replacedNoCharacter);
		
		String onlyCharacter = str1.replaceAll("[^A-Za-z' ']", "");
		System.out.println(onlyCharacter);
		
		String str2 ="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
	}
}
