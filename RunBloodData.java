import java.util.*;
public class RunBloodData{
	public static void main(String[]args){
		String input1, input2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter blood type of patient: ");
		input1 = sc.nextLine();
		System.out.print("Enter the rhesus factor (+ or -): ");
		input2 = sc.nextLine();
		
		if(input1.isEmpty() && input2.isEmpty()){
			BloodData bd = new BloodData();
			bd.display();
			
		}
		else if(input1 != "A"){
			System.out.print("Invalid Input");
			
		}
		else if(input1 != "B"){
			System.out.print("Invalid Input");
			
		}
		else if(input1 != "O"){
			System.out.print("Invalid Input");
			
		}
		else if(input1 != "AB"){
			System.out.print("Invalid Input");
			
		}
		else if(input2 != "+"){
			System.out.print("Invalid Input");
		
		}
		else if(input1 != "-"){
			System.out.print("Invalid Input");
			
		}
		else{
			BloodData bd = new BloodData(input1, input2);
			bd.display();
		}
		sc.close();
	}
}