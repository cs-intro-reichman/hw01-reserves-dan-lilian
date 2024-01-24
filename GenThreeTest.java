<<<<<<< HEAD:GenThreeTest.java
public class GenThreeTest {
    public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int r1 = (int) (a + Math.random() * (b-a));
    int r2 = (int) (a + Math.random() * (b-a));
    int r3 = (int) (a + Math.random() * (b-a));
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println("the minimal generated number was " + Math.min(r1, Math.min(r2, r3)));
    }

}
=======
public class GenThree {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int r1 = (int) (a + Math.random() * (b-a));
    int r2 = (int) (a + Math.random() * (b-a));
    int r3 = (int) (a + Math.random() * (b-a));
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println("the minimal generated number was " + Math.min(r1, Math.min(r2, r3)));
    }

}
>>>>>>> dd963e25165333ede9e97b26389d7a15da93b43f:GenThree.java
