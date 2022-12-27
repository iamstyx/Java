public class String_Method {
    public static void main(String[] args) {

        String name = "StyX";

        int value = name.length();
        System.out.println(value);

       String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimString= "      Styx       ";
        System.out.println(nonTrimString);

        String trimmedString = nonTrimString.trim();
        System.out.println(trimmedString);


        System.out.println(name.substring(3));
        System.out.println(name.substring(1,3));

        System.out.println(name.replace('t','x'));
        System.out.println(name.replace("t","se"));


        System.out.println(name.startsWith("St"));
        System.out.println(name.endsWith("yx"));

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("X"));       // StyX

        String modifiedName = "Sushshant";
        System.out.println(modifiedName.indexOf("sh"));
        System.out.println(modifiedName.indexOf("sh",3));
        System.out.println(modifiedName.lastIndexOf("sh", 3));

        System.out.println(name.equals("StyX"));
        System.out.println(name.equalsIgnoreCase("stYx"));

        System.out.println("I am escape sequence \t double quote");






    }
}
