package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word);
        System.out.println("word.startsWith(j) " + word.startsWith("j"));
        System.out.println("word.startsWith(ja) " + word.startsWith("ja"));
        System.out.println("word.startsWith(jae) " + word.startsWith("jae"));

        System.out.println("------------------------");
        System.out.println(word);

        System.out.println("word.endsWith(a) " + word.endsWith("a"));
        System.out.println("word.endsWith(A) " + word.endsWith("A"));
        System.out.println("word.endsWith(java) " + word.endsWith("java"));
        System.out.println("word.endsWith(va) " + word.endsWith("va"));
        System.out.println("word.endsWith(va ) with space " + word.endsWith("va "));

        boolean b = word.startsWith("hello"); // method returns boolean so you can also declare a boolean variable

        String s = "hello world today";
        System.out.println("word.startsWith(hello wor) " + s.startsWith("hello wor"));

    }
}
