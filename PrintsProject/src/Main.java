//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello from develop team");
        System.out.println("add new feauter-2(print array of strings)");
        System.out.println("add new feauter-2(print array of doubles)");
    }
    public static void printDoubles(double[]doubles){
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
    }
    public static void printStrings(String[]Strings){
        for (int i = 0; i < Strings.length; i++) {
            System.out.println(Strings[i]);
        }
    }
}