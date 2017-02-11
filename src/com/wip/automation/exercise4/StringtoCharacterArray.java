package com.wip.automation.exercise4;

public class StringtoCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			if (i < ch.length - 1)
				System.out.print(',');
		}
	}
}
