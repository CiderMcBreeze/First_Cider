
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;


public class BullBase {
	
	LocalDate today = LocalDate.now();
	static public String Name="";
	static public String Surname="";
	static public String IdNo="";
	static public String EmployeeNo="";
	static public String Position="";
	static public String Code="";
	static public String Address="";
	static public String Street="";
	static public String Town="";
	static int HouseNo;
	static public int CellNo=0;
	static int Age =0;
	static public InputStream inputStream;
	static public OutputStream OutputStream;
	static Scanner RegM = new Scanner(System.in);

	static public void main(String[] McBreeze_DC_System) {
		
		Registration();

	}

	static public void Registration(){
		//String cider="";
		//DateTimeFormatter LeRoy = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalTime breeze =LocalTime.of(Age, HouseNo);
        LocalTime LeRoy =LocalTime.MAX;
        LocalDateTime cider = LocalDateTime.now();
        
        System.out.println(LeRoy);
        System.out.println(" Started time " + cider);
		System.out.println("Please enter name : ");
		Name=RegM.next();
		
		System.out.println("Please enter surname : ");
		Surname=RegM.next();
		
		System.out.println("Please enter identity number : ");
		IdNo=RegM.next();
		
		if (IdNo.length()<13 || IdNo.length()>13 ){
	        System.out.println("Not South African Identity number ");  
	    }else {
	    	System.out.println("South African Identity number Valid");
	    }
		
		System.out.println("Please enter position : ");
		Position=RegM.next();
		
		System.out.println("Please enter House number : ");
		HouseNo=RegM.nextInt();
		
		System.out.println("Please enter street");
		Street=RegM.next();
		
		System.out.println("Please enter town : ");
		Town=RegM.next();
		
		System.out.println("Please enter code : ");
		Code=RegM.next();
		
		System.out.println("Please enter age : ");
		Age=RegM.nextInt();
		
		if (Age>=18 && Age<=35){
			System.out.println("Age granted");
		}else{
			System.out.println("Sorry the person is too young or too Old to be HERE");
		}
		
		System.out.println("Please enter contact number : ");
		CellNo=RegM.nextInt();
		
		if (CellNo>0 || CellNo<10){
			System.out.print(true);
		}else{
			System.out.println(false);
		}
		System.out.println(" Session terminated " + cider);
	}
	static void Gadget(){
		
	}

}
