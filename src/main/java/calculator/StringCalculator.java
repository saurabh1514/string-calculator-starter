package calculator;

import java.util.Iterator;

class StringCalculator {

    public int add(String input) {
    	String [] num = input.split(",|\n");
    	if(input.isEmpty())
    	{
    		 return 0;
    	}
    	
    	if(input.length()==1)
    	{
    		return Integer.parseInt(input);
    	}
    	else
    	{
    		return getSum(num);
    	}
    	
    	
    }

	private int getSum(String[] num) {
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum+=Integer.parseInt(num[i]);
		}
		return sum;
	}

	

}