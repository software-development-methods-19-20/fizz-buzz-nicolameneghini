package dssc.fizzbuzz;

public class FizzBuzz {

   public static Object print(Integer value){

       Object result;

       if(value % 105 == 0)
           result = "FizzBuzzBang";
       else if(value % 35 == 0)
           result = "BuzzBang";
       else if(value %15 == 0)
           result = "FizzBuzz";
       else if(value %21 == 0)
           result = "FizzBang";
       else if(value % 3 == 0)
           result = "Fizz";
       else if(value % 5 == 0)
           result = "Buzz";
       else if(value %7 == 0)
           result = "Bang";
       else
           result = value;


       return result;
    }

}
