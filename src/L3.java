public class L3 {

    //add the main method header below.

   /*
   Literal Value is a value written directly into the code.
   An Expression is a value written using variables or operators.
    */


   public static void main(String[] args) {

    int literalValue = 5;
    int expression1 = 5 + 6;
    int expression2 = literalValue + 6;
    int expression3 = literalValue + literalValue;


    //Examples of Literal Value
       double literalExample1 = 1.4;
       boolean literalExample2 = true;
       String literalExample3 = "apple";


       //Examples of Expressions
       double expressionExample1 = 5 + 6;
       boolean expressionExample2 = 5 > 6;


       //bad example
       //int badExample = 5.4 - 0.4;


       /* A String Expression is called a String Concatenation.
       You can combine String using the +.
        */

       String expressionExample3 = "A fruit people eat is an " + literalExample3;


       //Example Program
       String message1 = "The store has ";
       String message2 = " apples in stock.";
       int numApples = 2000000;

       System.out.println("The store has a lot of apples in stock.");
       System.out.println("The store has " + numApples + " apples in stock");
       System.out.println(message1 + numApples + message2);



   }


}
