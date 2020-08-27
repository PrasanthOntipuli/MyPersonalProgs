package com.prasanth.basicProgs;

import java.util.HashMap;
import java.util.Map;

public class HighestOfGivenProducts {

	
	
	public static void main(String[] args) {
	
		getUniqueChars("123453@31");
	}

	public static void getUniqueChars(String inputData)
	{
		if(inputData==null || inputData.length()==0)
		{
			System.out.println("Invalid Data");
			return;
		}
		HashMap<Character,Integer> process=new HashMap<>();
		for(int i=0;i<inputData.length();i++)
		{
			Character temp=inputData.charAt(i); 
			if(process.containsKey(temp))
			{
				process.put(temp, process.get(temp)+1);
			}else
			{
				process.put(temp, 1);
			}			
		}
		
		for(Map.Entry<Character, Integer> data:process.entrySet())
		{
			
				System.out.println(data.getKey()+"acc "+data.getValue());
			
		}
	}
}
