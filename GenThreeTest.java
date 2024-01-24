
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

