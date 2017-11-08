import java.util.Scanner;

class wordPlay {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Tell me your name: ");
    String name = in.nextLine();
    String insultedName = insult(name);
    System.out.println(insultedName);

    System.out.print("Give me a first word: ");
    String first = in.nextLine();
    System.out.print("Give me a second word: ");
    String second = in.nextLine();
    System.out.println(makeAbba(first, second));

    System.out.print("Give me a word: ");
    String str1 = in.nextLine();
    System.out.println(loopText(str1));

    System.out.print("Give me a word: ");
    String str2 = in.nextLine();
    System.out.print("Give me another word: ");
    String str2b = in.nextLine();
    System.out.println(nonStart(str2,str2b));

    System.out.print("Give me a word: ");
    String str3 = in.nextLine();
    System.out.println(left2(str3));

    System.out.print("Give me a word: ");
    String str4 = in.nextLine();
    System.out.println(right2(str4));

    System.out.print("Give me a word: ");
    String str5 = in.nextLine();
    System.out.print("Give me a boolean: ");
    boolean bln = in.nextBoolean();
    System.out.println(theEnd(str5, bln));

    System.out.print("Give me a word: ");
    String str6 = in.nextLine();
    System.out.println(withoutEnd2(str6));

    System.out.print("Give me a word: ");
    String str7 = in.nextLine();
    System.out.println(middleTwo(str7));

    System.out.print("Give me a word: ");
    String str8 = in.nextLine();
    System.out.println(lenLoop(str8));
  }

  // Insults someone
  public static String insult(String n) {
    return n + ", you slimy weasel.";
  }
  //Makes the word into ABBA format
  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }
  //Adds a word together five times.
  public static String loopText(String c) {
    String text = c;
    for(int i = 0; i < 5; i++){
      text+=c;
    }
    return text;
  }
  //Concates two strings
  public static String nonStart(String d, String e) {
          return d.substring(1) + e.substring(1);
  }
  //Moves the leters two letters left
  public static String left2(String f) {
          return f.substring(2) + f.substring(0, 2);
  }
  //moves the letter two letters right
  public static String right2(String g) {
          int len = g.length();
          return g.substring(len - 2) + g.substring(0, len - 2);
  }
  //returns the end or the begging of a string with true or false
  public static String theEnd(String h, boolean i) {
          if (i) return h.substring(0, 1);
          return h.substring(h.length() - 1);
  }
  //returns first and last chars of a string
  public static String withoutEnd2(String j) {
          if (j.length() <= 2) return "";
          return j.substring(1, j.length() - 1);
  }
  //Takes the middle two Chars of a string
  public static String middleTwo(String k) {
        int len = k.length();
        return k.substring(len / 2 - 1, len / 2 + 1);
}
  //loops a string equal to its length
  public static String lenLoop(String l) {
      int len = l.length();
      for(int i = 0; i < len; i++){
        l+=l;
      }
      return l;
}

}
