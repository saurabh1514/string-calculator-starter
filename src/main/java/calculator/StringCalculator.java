package calculator;

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
    		return getSum(num[0] , num[1]);
    	}
    	
    	
    }

	private int getSum(String numone,String numtwo) {
		return Integer.parseInt(numone) + Integer.parseInt(numtwo);
	}

	

}