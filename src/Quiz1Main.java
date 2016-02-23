import java.util.Scanner;

public class Quiz1Main {
public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter touchdowns: ");
	double Td = scanner.nextInt();
	System.out.print("Enter passing yards: ");
	double Yds=scanner.nextInt();
	System.out.print("Enter interceptions: ");
	double Itc=scanner.nextInt();
	System.out.print("Enter number of completed passes: ");
	double Comp = scanner.nextInt();
	System.out.print("Enter number of attempted passes: ");
	double Att = scanner.nextInt();
	
	double passer_rating = equation(Td, Yds, Itc, Comp, Att);
	System.out.println("This QB's passer rating is: " + passer_rating);
}

private static double equation(double Td, double Yds, double Itc, double Comp, double Att){
	
	double a = (((Comp/Att)-.3)*5);
	if (a > 2.375){
		a = 2.375;
	}
	double b = (((Yds/Att)-3)*.25);
	if (b > 2.375){
		b = 2.375;
		}
	double c = ((Td/Att)*20);
	if (c > 2.375){
		c = 2.375;
	}
	double d = 2.375-((Itc/Att)*25);
	if (d > 2.375){
		d = 2.375;
	}
	double passer_rating = (((a+b+c+d)/6)*100);
	if (passer_rating < 0){
		passer_rating = 0;
	}
	return passer_rating;
	}
}
