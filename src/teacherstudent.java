import java.util.Scanner;

public class teacherstudent extends account {
	Scanner input =new Scanner(System.in);
	public void registration(){
		System.out.print("enter name :- ");
		name=input.nextLine();
		System.out.print("enter username :- ");
		user_name=input.nextLine();
		System.out.print("enter mail :- ");
		mail=input.nextLine();
		System.out.print("enter password:- ");
		password=input.nextLine();
		System.out.print("enter gender :- ");
		gender=input.nextLine();
		System.out.print("enter age :- ");
		age=input.nextInt();
		
		
	}

}
