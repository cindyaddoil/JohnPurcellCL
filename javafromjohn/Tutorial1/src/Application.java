import java.util.Scanner;
public class Application {
	public static void main(String[] args){
		String sourceString =  "1 fish 2 fish red fish blue fish";
		Scanner sc = new Scanner(sourceString).useDelimiter("\\s*fish\\s*");
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		System.out.println(sc.next());
		sc.close();
	}
}
