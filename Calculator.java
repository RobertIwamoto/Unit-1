import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Give me a number: ");
      int num1 = in.nextInt();
      System.out.println("Is even: " + isEven(num1));

      System.out.print("Give me a number: ");
      int num2 = in.nextInt();
      System.out.println("Is odd: " + isOdd(num2));

      System.out.print("Give me a number: ");
      int num3 = in.nextInt();
      System.out.println("Number plus ten equals: " + addTen(num3));

      System.out.print("Give me a number: ");
      double num4 = in.nextDouble();
      System.out.println("Your double rounded: " + rounded(num4));

      System.out.print("Give me a number: ");
      int num5a = in.nextInt();
      System.out.print("Give me another number: ");
      int num5b = in.nextInt();
      System.out.println("Your numbers multiplied: " + multiply(num5a,num5b));

      System.out.print("Give me a number: ");
      int num6a = in.nextInt();
      System.out.print("Give me another number: ");
      int num6b = in.nextInt();
      System.out.println("Your numbers subtracted: " + subtract(num6a,num6b));

      System.out.print("Give me a number: ");
      int num7a = in.nextInt();
      System.out.print("Give me another number: ");
      int num7b = in.nextInt();
      System.out.println("Your numbers added: " + add(num7a,num7b));

      System.out.print("Give me a number: ");
      int num8 = in.nextInt();
      System.out.println("Your numbers added: " + add(num7a,num7b));

      System.out.print("Give me a number: ");
      int num9 = in.nextInt();
      System.out.println("Your number quadrupled: " + quadruple(num9));

      System.out.print("Give me a number: ");
      int num10 = in.nextInt();
      System.out.println("Your number cubed: " + cubed(num10));

      System.out.println("Give me a number: ");
      int num11 = in.nextInt();
      System.out.println("Your number times ten: "+timesTen(num11));
      System.out.println("\n----------END----------");
      }
      /*
      Check if a number is prime
      */
      public static boolean isEven(int n) {
        /* checks if n is modulo by 2 = 0, which is true for all even number,
        then returns true or false depending on the input */
        if(n % 2 == 0){
          return true;
        }else{
          return false;
        }
      }
      //Checks if a number is odd using the opposite of isEven
      public static boolean isOdd(int o){
        if(o % 2 == 0){
          return false;
        }else{
          return true;
        }
      }
      //Adds ten to a int
        public static int addTen(int t){
          return t+10;
        }
        //Rounds a double up and returns it as an int
        public static int rounded(double r){
          double rounder = r + 0.5;
          return (int)rounder;
        }
        //Multiplies two numbers and returns the result
        public static int multiply (int a, int b){
          return a * b;
        }
        //Subtracts two numbers and returns the result
        public static int subtract (int e, int f){
          return e - f;
        }
        //Adds two numbers and returns the sum
        public static int add (int v, int s){
          return v +s;
        }
        //Quadruples two numbers and returns the result
        public static int quadruple(int db){
          return db * 4;
        }
        //Cubes a number by multiplying it by itself three times and returns the product
        public static int cubed(int cb){
          return cb * cb * cb;
        }
        //Multiplies a int by 10 and returns the product
        public static int timesTen(int tt){
          return tt * 10;
        }
}
