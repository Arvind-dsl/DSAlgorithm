public class App {
    public static void main(String[] args) throws Exception {
        Qone one = new Qone();
        System.out.println(one.removeDuplicateChar("ASDWSASD11$$"));
        System.out.println(one.isPanagram("The quick brown fox jumps over the lazy dog"));
        one.randomTester();
    }
}
