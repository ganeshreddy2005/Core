public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Test class");
        System.out.println("Today");
        try {
            Card card=Card.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Main Class End");
    }
}
