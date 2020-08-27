package com.prasanth.basicProgs;

import java.util.Arrays;
import java.util.List;

public class BasicLogicProgs {

	static String strInput = "jim     j    cary is          Awsome actor";

	public static void main(String[] args) {
		 char[] input={'c','r','f','g','h','j','k','l','z','x','c','b','t','e'};
		 List<Integer> data = Arrays.asList(2, 6, 3, 2, -8, 4, -11, 5, 7, 9);
//		 System.out.println(getPossibleIndex(data, 0, 11));
		 for (int i = 2; i < 100; i++) {
		 System.out.println("is " + i + " prime ::" + isPrime(i));
		 }
		 System.out.println(ispalindrome("Amrutha"));
		 System.out.println(reverseString("TalkWise"));
		 System.out.println(reverseANumber(1234));
		 printFibbnociSeries(123);
		 System.out.println(reverseWordsinString(strInput));
		 System.out.println("IS anagram "+isAnagram("CAnT", "cAbt"));
		 evenOddPos(input, false);
		 smallestAndLargest(data);
		System.out.println(firstNonRepetedCharacter("alao.aplpoi"));
		// alaoaplpoi
	}

	
	private static Character firstNonRepetedCharacter(String data) {

		int leng = data.length();
		for (int j, i = 0; i < leng; i++) {
			for (j = 0; j < leng; j++) {
				if (data.charAt(i) == data.charAt(j) && i != j) {
					break;
				} else if (j == leng - 1) {
					return data.charAt(i);
				}

			}
		}
		return null;
	}

	private static void smallestAndLargest(List<Integer> data) {
		int largest = data.get(0), smallest = data.get(0);
		for (int i = 0; i < data.size(); i++) {
			int temp = data.get(i);
			if (largest < temp) {
				largest = data.get(i);
			} else if (smallest > temp) {
				smallest = temp;
			}
		}
		System.out.println(largest + "sm" + smallest);
	}

	private static boolean ispalindrome(String input) {
		int size = input.length() - 1;
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) != input.charAt(size - i)) {
				return false;
			}
		}
		return true;
	}

	private static void evenOddPos(char[] data, boolean flag) {
		for (int i = 0; i < data.length; i++) {
			if (i % 2 == 0 && flag) {
				System.out.println(data[i]);
			} else if (i % 2 == 1 && !flag) {
				System.out.println(data[i]);
			}
		}
	}

	private static int reverseANumber(int data) {
		if (data < 10) {
			return data;
		}
		int temp = 0;
		while (data > 0) {
			temp = temp * 10 + data % 10;
			data = data / 10;
		}
		return temp;
	}

	private static String reverseString(String str) {
		char[] arr = str.toCharArray();
		int size = str.length() - 1;
		char temp;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[size - i];
			arr[size - i] = temp;
		}
		return new String(arr);
	}

	private static boolean isPrime(int num) {
		if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i < num; i = i + 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void printFibbnociSeries(int n) {
		int a = 0;
		int b = 0;
		int c = 1;
		while (a < n) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + "");
		}

	}

	private static String reverseWordsinString(String strInput2) {
		String[] data = strInput2.split(" ");
		strInput2 = "";
		for (int i = 0; i < data.length; i++) {
			if (!data[i].contains(" ")) {
				strInput2 += reverseString(data[i]) + " ";
			}
		}
		return strInput2;
	}

	private static Integer getPossibleIndex(int[] data, int index, int element) {
		while (data[index] < element && index++ < data.length - 1)
			;
		return index;
	}

	private static boolean isAnagram(String a, String b) {

		int aLen = a.length(), bLen = b.length();
		char[] bData = b.toCharArray();
		if (bLen != aLen) {
			return false;
		}
		for (int i = 0; i < aLen; i++) {
			boolean hasData = false;
			int aInt = (int) a.charAt(i);
			for (int j = 0; j < bLen; j++) {
				int bInt = (int) bData[j];
				if (aInt == bInt || aInt == (bInt + 32) || (aInt + 32) == bInt) {
					bData[j] = '*';
					hasData = true;
					break;
				}
			}
			if (!hasData) {
				return false;
			}
			System.out.println(bData);

		}
		return true;
	}

}
