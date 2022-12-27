public class Practice_Set_3 {
    public static void main(String[] args) {

        // 1. Write a Java Program to convert a string to lowercase.
/*
        String name = "StyX";
        name = name.toLowerCase();
        System.out.println(name);
*/

        // 2. Write a Java Program to replace spaces with underscores

/*
        String text = "to lower case";
        text = text.replace(" ","_");
        System.out.println(text);
*/

        // Write a Program to fll in a letter template which looks like below;
        // letter ="Dear<|name|>, Trans a lot"
        // Replace name with a string name

        String letter = "Dear <|name|>, Thanks a lot!";
        letter= letter.replace("<|name|>", "Sushant");
        System.out.println(letter);

        // Write a program to detect double and triple spaces in a string

        String MyString ="This String contains double and  triple spaces";
        System.out.println(MyString.indexOf("  "));
        System.out.println(MyString.indexOf("   "));

        // Write a program to format the letter using escape sequence characters
        // letter = " Hello Friends, Chai Pi lo. Thanks"

        String MyLetter = "Hello Friends,\n\tChai Pi lo.\n\tThanks!";
        System.out.println(MyLetter);


    }
}
