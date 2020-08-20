public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Test class");
        System.out.println("Today");
        System.out.println("August_17");
        System.out.println("Again changes on August_17");
        try {
            Card card=Card.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Main Class End");
        System.out.println("Aug_17");
        System.out.println("Aug_18");
        System.out.println("Aug_19");
    }
}
