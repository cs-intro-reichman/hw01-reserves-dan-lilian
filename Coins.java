public class Coins {
    public static void main(String[] args) {
		int Totalcoins = Integer.parseInt(args[0]);
		int Quarters = (Totalcoins/25);
    int Cents = (Totalcoins%25);
		System.out.println(" use " + Quarters + " quarters and " + Cents + " cents");	
    }

}
