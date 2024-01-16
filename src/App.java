public class App {
    public static void main(String[] args) throws Exception {
        Qone one = new Qone();
        System.out.println(one.removeDuplicateChar("ASDWSASD11$$"));
        System.out.println(one.isPanagram("The quick brown fox jumps over the lazy dog"));
        one.randomTester();

        Integer[] send = new Integer[]{16, 1, 2, 3, 7, 15};
        //{16, 1, 2, 3, 7, 15}
        //{1, 2, 9, 16, 3, 7, 15}
        //{9, 3, 7, 15}
        //one.missingNumber(send);
        one.missingNumberWithoutSet(send);
    }
}
