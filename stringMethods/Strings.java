package stringMethods;

public class Strings {
    public static void main(String[] args) {
        String name = "Rajdeep";
        String channel = "Data structures and algorithms";
        System.out.print(name.length()); //tells us the no of letters in the variable name.
        System.out.println(name.toLowerCase());// converts name to lowercase.
        System.out.println(name + " from " + channel); //CONCATENATED

        System.out.println(name.contains("Raj")); //checks if the item is present is variable.
        System.out.println(name.charAt(2)); //tells the character at 2
    }
}
