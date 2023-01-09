public class Exercise {

    // Zadania Zmienne

    public int getLength(String sentence) {

        int result = 0;
        result = sentence.length();

        System.out.println(result);
        return result;

    }


    public void getConcat() {
        String str1 = "To";
        String str2 = "Jest";
        String str3 = "Mój";
        String str4 = "Pierwszy";
        String str5 = "Program";

        String words1 = str1 + str2 + str3 + str4 + str5;
        String words2 = str1.concat(str2).concat(str3).concat(str4).concat(str5);

        System.out.println("words1 = " + words1);
        System.out.println("words2 = " + words2);

    }




public static void getReplace() {
    String sentence = "Nowe zdanie";

    String s = Float.toString(25.0f);
    String regex = "[aeiouAEIOU]";

    String o = "y";
     o = "e";
     o = "f";
     o = "12";
     o = "dom";

    char e = 'e';
    char a = 'a';
    char i = 'i';

    sentence.replaceAll(regex,s);
    sentence.replace('e',(char)1.2F);
    sentence.replace('a',(char)1.2F);
    sentence.replace('i',(char)1.2F);

    System.out.println(sentence);
}




private static void getContains() {

    String title = "Java is the best";

    System.out.println(title.contains("Java"));
}




private static void getEquals() {
String string1 = "Java";
String string2 = "jaVa";

    System.out.println(string1.equalsIgnoreCase(string2));
}



private static void getSubstring () {
String sentence = "MyNameIsVeryLongTitle";
    System.out.println(sentence.substring(3,8));
}

// Operatory

private static void getResult2() {
double a = 1.23;
double b = 3.21;

double addition = a + b;
double subtraction = a - b;
double multiplication = a * b;
double division = a / b;

    System.out.println("addition = " + addition);
    System.out.println("subtraction = " + subtraction);
    System.out.println("multiplication = " + multiplication);
    System.out.println("division = " + division);
}



public static void getOperation() {
int x = 0;

    System.out.println(x == 3);
    System.out.println(!(x == 3));
    System.out.println(  x++ );
    System.out.println( x -= 3);
    System.out.println(x *= 3);
}



public static void exercise() {
byte x = 0;
int a = x + 1;
long b = x + 2L;
float c = x + 1.23f;
double d = x + 3.21;
}



private static void getResult() {
int colorsPen = 6;
int lines = 100;

    System.out.println(100 % 6);
}



private  static void getDivision(int number) {
boolean division3 = number % 3 == 0;
boolean division7 = number % 7 == 0;
boolean division3and7 = division3 && division7;

    System.out.println(division3);
    System.out.println(division7);
    System.out.println(division3and7);
}
}

