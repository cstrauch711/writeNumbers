//This program takes user-inputed integers (less than 6 digits) and prints out the word format of that number

import java.util.Scanner;

class intToWord{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Please input an integer:  ");
    int number = s.nextInt();
    String num = String.valueOf(number);
    int num_digits = num.length();

    if( num_digits > 7 ){
      throw new ArithmeticException( "Number must be 6 digits or smaller" );
    }
    else{
      String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
      String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
      String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

      switch( num_digits ){
        case 6:
          System.out.print( ones[digit(num.charAt(num_digits-6))] + " hundred ");
        case 5:
          System.out.print( tens[digit(num.charAt(num_digits-5))] + " ");
        case 4:
          System.out.print( ones[digit(num.charAt(num_digits-4))] + " thousand");
        case 3:
          if( digit(num.charAt(num_digits-3)) == 0 ){
            System.out.print(" ");
          }
          else{
            System.out.print( ones[digit(num.charAt(num_digits-3))] + " hundred ");
          }
          if( digit(num.charAt(num_digits-2)) == 0 ){
            System.out.print("and ");
          }
        case 2:
          System.out.print( tens[digit(num.charAt(num_digits-2))] + " ");
        case 1:
          if( digit(num.charAt(num_digits-1)) == 0 ){
            System.out.println( "zero" );
          }
          else{
            System.out.print( ones[ digit(num.charAt(num_digits-1)) ] ); break;
          }
      }
    }
  }

    public static int digit( char x ){
      if( x == '1' ){ return(1); }
      else if( x == '2' ){ return(2); }
      else if( x == '3' ){ return(3); }
      else if( x == '4' ){ return(4); }
      else if( x == '5' ){ return(5); }
      else if( x == '6' ){ return(6); }
      else if( x == '7' ){ return(7); }
      else if( x == '8' ){ return(8); }
      else if( x == '9' ){ return(9); }
      else if( x == '0' ){ return(0); }
      else{return(0);}
    }

}
