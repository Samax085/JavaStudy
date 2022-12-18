public class Main {
    public static void main(String[] args) {
        Person first = new Person("Nick", 33, 176, 94, 1643);
        Person second = new Person();
        Person third = new Person("Mikel", 14, 138, 56, 18765);

        first.PersonInfo();
        first.GoWork();

        System.out.println("================================================");
        second.PersonInfo();
        second.GoWork();
        System.out.println("================================================");
        third.PersonInfo();
        third.GoWork();
    }
}