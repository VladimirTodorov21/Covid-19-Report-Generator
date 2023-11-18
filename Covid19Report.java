package assignment1; 

import java.util.*; //Class needs to be imported

public class assignment1code1 
{
	public static void main(String[] args)
	{
		//This scanner is created to show the client the answers of his input in the report
		Scanner report = new Scanner(System.in);
		
		/* Header that welcomes and invites the client to fill in the Vaccination Report*/
		System.out.println("Welcome to the COVID-19 Report Generator:\n");
		System.out.println("Please enter the client info:\n"); 
		
		System.out.println("First name ? ");
		/*Set input of the first name beginning with Upper Case letter and the rest are lower case characters */
		String fname = report.nextLine();
		String string1 = fname.substring(0,1);
		String string2 = string1.toUpperCase();
		String string3 = fname.substring(1).toLowerCase();
		String fname1 = string2 + string3;
		
	
		System.out.println("Last name ? ");
		/*Set input of the last name beginning with Upper Case letter and the rest are lower case characters */
		String lname = report.nextLine();
		String string4 = lname.substring(0,1);
		String string5 = string4.toUpperCase();
		String string6 = lname.substring(1).toLowerCase();
		String lname1 = string5 + string6;
		
		System.out.println("Day of Birth (between 1 and 31) ? ");
		/*Set day of birth to be inputed from integers 1 to 31*/
		final int firstdayofmonth = 0;
		final int lastdayofmonth = 32;
		int dayofbirth = report.nextInt();
		int dob = 0;
		if (dayofbirth < lastdayofmonth && dayofbirth > firstdayofmonth );
			dob = dayofbirth;
		
		System.out.println("Month Of Birth (between 1 and 12) ? ");
		/*Set month of birth to be inputed from integers 1 to 12*/ 
		final int firstmonthofyear = 0;
		final int lastmonthofyear = 13;
		int monthofbirth = report.nextInt();
		int mob = 0;
		if (monthofbirth < lastmonthofyear && monthofbirth > firstmonthofyear)
			mob = monthofbirth;
		
		System.out.println("Year Of Birth (between 1920 and 2006) ? ");
		/*Set year of birth to be inputed from integers 1920 to 2006*/
		final int year1 = 1919;
		final int year2 = 2007;
		int yearofbirth = report.nextInt();
		int yob = 0;
		if (yearofbirth < year2 && yearofbirth >year1)
			yob = yearofbirth;
		
		System.out.println("Day Of Vaccination (between 1 and 31) ? ");
		/*Set day of vaccination to be inputed from integers 1 to 31*/
		final int firstdayofvaccination = 0;
		final int lastdayofvaccination = 32;
		int dayofvaccination = report.nextInt();
		int dov = 0;
		if (dayofvaccination < lastdayofvaccination && dayofvaccination > firstdayofvaccination)
			dov = dayofvaccination;
		
		System.out.println("Month Of Vaccination (between 1 and 12) ? ");
		/*Set month of vaccination to be inputed from integers 1 to 12*/
		final int firstmonthofvaccination = 0;
		final int lastmonthofvaccination = 13;
		int monthofvaccination = report.nextInt();
		int mov = 0;
		if (monthofvaccination < lastmonthofvaccination && monthofvaccination > firstmonthofvaccination)
			mov = monthofvaccination;
		
		System.out.println("Year Of Vaccination (between 2019 and 2021) ? ");
		/*Set year of vaccination to be inputed from integers 2019 to 2021*/
		final int year3 = 2018;
		final int year4 = 2022;
		int yearofvaccination = report.nextInt();
		int yov = 0;
		if (yearofvaccination < year4 && yearofvaccination > year3)
			yov = yearofvaccination;
		
		report.nextLine(); //this line is a separation between nextInt and nextLine, otherwise the next line below will be skipped to the 2nd one
		
		System.out.println("Name Of Vaccination (Pfizer, Moderna, AstroZeneca, etc.) ? ");
		String nameofvaccination= report.nextLine(); //input of the name of vaccination
		
		System.out.println("Location of the center of the vaccination ? ");
		/*Set the location of the center of vaccination beginning with Upper Case letter and the rest are lower case characters*/
		String location = report.nextLine();
		String string7 = location.substring(0,1);
		String string8 = string7.toUpperCase();
		String string9 = location.substring(1).toLowerCase();
		String location1 = string8 + string9;
		
		System.out.println("Lot of vaccination ? ");
		/*Set lot of vaccination to have all letters with upper case*/
		String lot = report.nextLine();
		String lot1 = lot.toUpperCase();
		

		
		System.out.println("Health and Social Services\tProof of Vaccination against COVID-19\n"); //displays a message from the services and a proof
		
		System.out.println("User Information\n"); //displays user information
			
		System.out.println("Name\t\t\t\t" + lname1 + "," + fname1); //displays client's full name in the report
		System.out.println("DOB \t\t\t\t" + dob + "/" + mob + "/" + yob +"\n\n"); //displays the full date of birth of the client
	
		
		System.out.println("Vaccine Administered\n"); //displays a response 
		
		System.out.println("Name\t\t\t\tPB COVID-19"); //displays name of the virus
		System.out.println("Date\t\t\t\t"+ dov + "/" + mov + "/" + yov); //displays date of vaccination
		System.out.println("Code\t\t\t\t"+ nameofvaccination); //displays name of the vaccination
		System.out.println("Location\t\t\t"+ location1); //displays location of the vaccination
		System.out.println("Lot\t\t\t\t"+ lot1 +"\n\n"); //displays lot of vaccination
		
		
		System.out.println("Thank You for choosing our services.\n"); //shows a disciplined and thankful message
		
		System.out.println("Report generated successfully."); //shows a message of successful generation of the report
	
		report.close(); //close scanner
	} //end of main
} //end of public class
