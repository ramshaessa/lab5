package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    //TODO read successive input lines until EOF, then print out in reverse order (read input from command line. Once it has seen all the input, then it is suppose to echo back the lines in reverse order)
    

     //phase 1: read line by line and store on stack 
    final Scanner input = new Scanner(new File("ReverseLines.txt"));
    while (input.hasNextLine()) {
      final String line = input.nextLine();
      lines.push(line);
      
      
      //Input.close();
      
      //phase 2: pop line by line off stack and print 
      
      while(!lines.isEmpty())
        final String item = lines.pop();
        System.out.println(item);
    }



    }



  }
}
