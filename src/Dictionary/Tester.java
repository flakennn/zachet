package Dictionary;

public class Tester {
    public static void main(String[] args) {
        Dict dict = new Dict();
        dict.put(1337,"bebra");
        dict.put(228,"aboba");
        dict.put(777,"mishka fredy");
        System.out.println(dict.get(1337));
    }
}
