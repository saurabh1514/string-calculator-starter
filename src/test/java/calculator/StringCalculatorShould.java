package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws Exception {                             // Empty String Returns Zero
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {     //  Single String Ineger Returns Integer Itself
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_number_should_return_number_as_sum_of_two() throws Exception {     //   Returns Integer Sum of Two
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void two_numbers_newline_delimetted_sum() throws Exception {     //  Newline delimiter Returns Integer Sum of Two
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1\n2"));
    }
    
    @Test
    void three_numbers_delimetted_sum() throws Exception {     // Three numbers delimiter Returns Integer Sum of Three
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1,2,3"));
    }
    
    @Test
    void negativeInputThrowException( ) {                        //Negative Number test
    	 StringCalculator stringCalculator = new StringCalculator();
    	 Exception exception = Assertions.assertThrows(Exception.class, () -> {
    		 stringCalculator.add("-2");
    	 });
    	
    }
   
    
    
}
