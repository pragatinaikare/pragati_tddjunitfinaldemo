package com.epam.tddjunitdemo;

public class RemoveA {
	public String removeCharA(String  temp) {
		String result = temp;
		char firstChar =temp.charAt(0);
		char secondChar = temp.charAt(1);
		if(firstChar=='A')
		{
			if(secondChar=='A')
			{
				 result= temp.substring(2);
				 
			}else
				result= temp.substring(1);
		}
		else if (secondChar=='A')
		{
			result= firstChar + temp.substring(2);
		}
	return result;
	}
}
