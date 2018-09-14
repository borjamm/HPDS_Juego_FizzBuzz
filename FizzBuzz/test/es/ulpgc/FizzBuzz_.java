package es.ulpgc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    @Test
    public void give_not_multiple_of_nothing_show_me_number(){
        assertEquals("2",new FizzBuzz().fizzBuzz(2));
        assertEquals("4",new FizzBuzz().fizzBuzz(4));
    }


    @Test
    public void give_multiple_of_3_show_me_fizz(){
        assertEquals("Fizz",new FizzBuzz().fizzBuzz(3));
        assertEquals("Fizz",new FizzBuzz().fizzBuzz(6));
    }

    @Test
    public void give_multiple_of_5_show_me_buzz(){
        assertEquals("Buzz",new FizzBuzz().fizzBuzz(5));
        assertEquals("Buzz",new FizzBuzz().fizzBuzz(10));
    }

    @Test
    public void give_multiple_me_fizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().fizzBuzz(15));
        assertEquals("FizzBuzz",new FizzBuzz().fizzBuzz(30));
    }
}
