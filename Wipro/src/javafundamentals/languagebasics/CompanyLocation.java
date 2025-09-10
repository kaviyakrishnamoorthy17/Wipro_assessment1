package javafundamentals.languagebasics;

public class CompanyLocation {
 public static void main(String[] args) {
     // Check if two arguments are passed
     if (args.length < 2) {
         System.out.println("Please provide two arguments: <Company> <Location>");
         return;
     }

     // Read arguments
     String company = args[0];
     String location = args[1];

     // Format output
     String result = company + " Technologies " + location;

     // Print output
     System.out.println(result);
 }
}
