import java.util.*;
public class pg1 {
    public static void main(String[] args) {

        String str = "   I love JAVA java JaVa more than pizza, java makes me happy java!   ";

        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.equals("I love JAVA"));
        System.out.println(str.equalsIgnoreCase("   i LOVE java JAVA more than pizza, jAvA makes me happy java!   "));
        System.out.println(str.compareTo("abc"));
        System.out.println(str.substring(3, 15));
        System.out.println(str.indexOf("java"));
        System.out.println(str.lastIndexOf("java"));
        System.out.println(str.contains("pizza"));
        System.out.println(str.replace("pizza", "momos"));
        System.out.println(str.replaceAll("java", "coffee"));
        System.out.println(str.split(" "));   
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
       
    }
}
// output
// PS C:\Users\soura\OneDrive\Desktop\study\java\ass\lab6> cd "c:\Users\soura\OneDrive\Desktop\study\java\ass\lab6\" ; if ($?) { javac stringMethods.java } ; if ($?) { java stringMethods }
// 70
// l
// false
// false
// -65
// I love JAVA
// 15
// 62
// true
//    I love JAVA java JaVa more than momos, java makes me happy java!       
//    I love JAVA coffee JaVa more than pizza, coffee makes me happy coffee! 
// [, , , I, love, JAVA, java, JaVa, more, than, pizza,, java, makes, me, happy, java!]
//    i love java java java more than pizza, java makes me happy java!       
//    I LOVE JAVA JAVA JAVA MORE THAN PIZZA, JAVA MAKES ME HAPPY JAVA!       
// I love JAVA java JaVa more than pizza, java makes me happy java!

// PS C:\Users\soura\OneDrive\Desktop\study\java\ass\lab6>
