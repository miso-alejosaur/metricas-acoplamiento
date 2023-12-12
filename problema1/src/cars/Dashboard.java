package cars;

public class Dashboard {	
	public static void printDashboard(IPrintable printable) {
		System.out.println(printable.getStats());
	}
}
