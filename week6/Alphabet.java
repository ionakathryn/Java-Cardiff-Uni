public class Alphabet {

 public static void main(String[] args) {
 checkAlphabetic("fdsfsfd432423423!");
 }

 public static boolean checkAlphabetic(String input) {
 char[] chars = input.toCharArray();
 int count = 0;

 for (int i = 0; i < input.length(); i++) {
 if (Character.isLetter(chars[i])) {
 count = 1;
} else {

System.out.println("String is not alphabetic....");
System.exit(1);
return false;
}
}
System.out.println("alphabetic word");

return true;
  }
}
