public class Main {
    public static void main(String[] args) {
        Clock original = new Clock(24, 60);
        original.setTime(12, 30);
        Clock clone = original.clone();

        Clock original2 = new Clock(24, 60);
        original2.setTime(12, 30);
        Clock clone2 = original.shallowClone();

        original.setTime(13, 0);
        original2.setTime(13, 0);

        System.out.println("OG : " + original);
        System.out.println("Clone: " + clone);

        System.out.println("OG with shallow copy : " + original2);
        System.out.println("Clone with shallow copy: " + clone2);
    }
}