import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
        String firstName = console.readLine("What is your first name?"  );
        String lastName = console.readLine("What is your last name?"  );
      //This is an example of camelCasing
        console.printf("Hello, my name is %s\n", firstName);
        console.printf("My last name is %s/n", lastName);
        console.printf("%s and I am learning how to write Java\n", firstName);
  }
}
