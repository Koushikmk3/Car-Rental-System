package Project;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
//Car class to represent available cars
class Car{ 
		String cid; 
		String cname; 
        int cmodel; 
        String fuel; 
        String colour; 
        float price;
boolean available = true;
void displayCars(String cid, String cname,String fuel, int cmodel, String colour, double d) {
System.out.println(cid+" "+cname+" "+fuel+" "+cmodel+" "+colour+" "+d+" Available: "+available);
}

public boolean getAvailable() {
return available;
}

public void setAvailable(boolean available) { 
this.available = available;
}
}
//Customer class to represent customer details
class Customer{ 
String name; 
long phno; 
String emailid;

Customer(String name,long phno,String emailid){ 
this.name=name;
this.phno=phno; 
this.emailid=emailid;
}

public String getName() {
return name;
}

public long getPhno() {
return phno;
}

public String getEmailId() {
return emailid;
}

@Override
public String toString() {
return "Customer [Name=" + name + ", Phone No=" + phno + ", EmailId=" + emailid + "]";
}

}
class RentalTransaction{ 
String selectcar;
int duration; 
Date rentalDate;

RentalTransaction(String selectcar, int duration){ 
this.selectcar=selectcar;
this.duration=duration; 
this.rentalDate = new Date();
}

public String getSelectedCar() {
return selectcar;
}

public int getDuration() {
return duration;
}

@Override
public String toString() {
return "RentalTransaction \n [Your Selected Car = " + selectcar + ",\n Time in Hours =" + duration + ", \n Date : "+ rentalDate + "]";
}
}

public class Project_1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Car c=new Car();
	System.out.println(" Welcome To"+ "\n" +" DURGESH RENTALS"); 
	System.out.println(" Rent - Explore - Experience");
	System.out.println(" ");
	System.out.println(" Rent Any Car and Enjoy Unlimited Kilometers");
	System.out.println(" Select Location \n 1.Hyderabad \n 2.Vijayawada \n 3.Amalapuram"); 
	System.out.println(" Enter Location Id: ");
	int a=s.nextInt();
	if(a==1)
	System.out.println(" You Selected Hyderabad");
	else if(a==2)
	System.out.println(" You Selected Vijayawada");
	else if(a==3)
	System.out.println(" You Selected Amalapuram");
	else
	System.out.println(" Invalid Location ID"); 
	System.out.println("For Further Details Please Enter '0' "); 
	int b=s.nextInt();
	if(b==0&&a==1||b==0&&a==2||b==0&&a==3) {
	System.out.println("Available Cars in Hyderabad");
	System.out.println("Car Id Car Name Fuel Varient Model Colour Price(Per 24Hr)"); 
	System.out.println(" 5 Seaters ");
	c.displayCars("5S001", "Maruthi Suzuki Alto 800", " Petrol ",2020," White ",1499.00 ); 
	c.displayCars("5S002", "Maruthi Suzuki Swift ZXI", " Petrol/Deisel", 2022, "Cherry Red",1899.00 ); 
	c.displayCars("5S003", "Maruthi Suzuki Swift Dezire", "Petrol/Deisel", 2023, " White ",1999.00 );
	c.displayCars("5S004", "Hyundai I20 Sportz ", "Petrol ", 2023, " White ",1999.00 );
	c.displayCars("5S005", "Hyundai Creta SX ", "Petrol ", 2023, " Black ",2499.00 );
	c.displayCars("5S006", "Tata Punch ", "Petrol ", 2022, " Grey ",2299.00 );
	c.displayCars("5S007", "Tata Altroz ", "Petrol ", 2022, " Red ",2399.00 );
	c.displayCars("5S008", "Volkswagen Polo TDI ", "Petrol ", 2020, " Red ",2299.00 );
	c.displayCars("5S009", "Mahindra Thar ", "Petrol ", 2023, " Black ",3699.00 );
	System.out.println(" 7 Seaters ");
	c.displayCars("7S010", "Maruthi Suzuki Ertiga LXI ", "Petrol ", 2022, " Grey ",2899.00 );
	c.displayCars("7S011", "Toyota Innova ", "Deisel ", 2021, " White ",3199.00 );
	c.displayCars("7S012", "Renault Triber ", "Petrol ", 2020, " Orange ",2899.00 );
	LinkedHashMap<String, String> checkcar=new LinkedHashMap<String, String>(); 
	checkcar.put("5S001", "Maruthi Suzuki Alto 800(2020 Petrol) - 1499/- "); 
	checkcar.put("5S002", "Maruthi Suzuki Swift ZXI(2022 Petrol/Deisel) - 1899/- "); 
	checkcar.put("5S003", "Maruthi Suzuki Swift Dezire(2023 Petrol/Deisel) - 1999/- "); 
	checkcar.put("5S004", "Hyundai I20 Sportz(2023 Petrol) - 1999/- "); 
	checkcar.put("5S005", "Hyundai Creta SX(2023 Petrol) - 2499/- "); 
	checkcar.put("5S006", "Tata Punch (2022 Petrol) - 2299/- "); 
	checkcar.put("5S007", "Tata Altroz (2022 Petrol) - 2399/- "); 
	checkcar.put("5S008", "Volkswagen Polo TDI (2020 Petrol) - 2299/- "); 
	checkcar.put("5S009", "Mahindra Thar(2023 Petrol) - 3699/- "); 
	checkcar.put("7S010", "Maruthi Suzuki Ertiga LXI(2022 Petrol) - 2899/- "); 
	checkcar.put("7S011", "Toyota Innova(2021 Deisel) - 3199/- "); 
	checkcar.put("7S012", "Renault Triber(2020 Petrol) - 2899/- ");
	System.out.println(); 
	System.out.println("Enter CarID "); 
	String cr=s.next();
	String cardetails=checkcar.get(cr);
	if (cardetails != null) {
	System.out.println("Details for CAR ID " + cr + ":"); 
	System.out.println(cardetails+" Available: "+ c.getAvailable());
	System.out.println("Enter the Time (In Hours): "); 
	int t=s.nextInt();
	System.out.println();
	RentalTransaction rt= new RentalTransaction(cardetails, t); 
	System.out.println(rt.toString());
	System.out.println();
	System.out.println("Enter Customer Name: "); 
	String cname=s.next();
	System.out.println("Enter Customer Phone Number: "); 
	long phno=s.nextLong();
	System.out.println("Enter Customer Email Id: "); 
	String emailid=s.next();
	System.out.println();
	Customer c1= new Customer(cname, phno, emailid); 
	System.out.println(c1.toString());
	}
	else {
	}
	System.out.println("No details found for ID " + cr);
	if(cardetails!= null && c.getAvailable()) {
	//c.setAvailable(false);
	System.out.println("Car ( "+cardetails+" ) Rented Successfully.............");
	}
	else {
	}
	System.out.println("Car not available for rental.");
	System.out.println();
	System.out.println("Available Cars in your Loaction: ");
	//checkcar.remove(cr);
	//Available Cars
	Set<Entry<String, String>> s1=checkcar.entrySet(); 
	Iterator<Entry<String, String>> it=s1.iterator(); 
	while(it.hasNext()) {
	Map.Entry<String, String> entry =(it.next());
	//c.setAvailable(false);
	if(entry.getKey().equals(cr)) {
	c.setAvailable(false);
	System.out.println(entry.getKey()+" "+entry.getValue()+" Available: "+ c.getAvailable());
	continue;
	}
	else { 
	c.setAvailable(true);
	System.out.println(entry.getKey()+" "+entry.getValue()+" Available: "+ c.getAvailable());
	}
	}
	//ReturnCar System.out.println();
	System.out.println(" For Return Car Enter '1' Otherwise '0' "); int 
	n=s.nextInt();
	if(n==1){
	System.out.println("Enter your Return CARID: "); String 
	ret=s.next();
	if(ret.equals(cr)) {
	//c.setAvailable(true);
	System.out.println(ret+" Car Returned Successfully....................");
	}
	else {
	System.out.println(" No Details with your CarId or Enter Valid CarId ");
	}
	}
	else {
	System.out.println(" THANK YOU FOR RENTING OUR CAR \n VISIT AGAIN!");
	}
	}

	}

}
