package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entry {	
	
	
	public static void main(String[] args) {
		
	List<Contact> contactList = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	int entry = 0;
	
	do{
	
	System.out.println("1.) Add new entry");
	System.out.println("2.) Delete entry");
	System.out.println("3.) Search by first name");
	System.out.println("4.) Search by last name");
	System.out.println("5.) Search by full name");
	System.out.println("6.) Search by telephone number");
	System.out.println("7.) Search by City or State");
	System.out.println("8.) Delete Record for a given telephone number");
	System.out.println("9.) Update Record for a given telephone number");
	System.out.println("10.) Exit");

	entry = input.nextInt();
	Scanner newPerson = new Scanner(System.in);
	switch (entry) {
	
	case 1: //add entry
	
		
		
		System.out.println("Enter user details: ");
		String contact = newPerson.nextLine();
		
		String[] person = contact.split(",");
		String[] name = person[0].split(" ");
		
		
		Contact setContact = new Contact();
		setContact.setTelephone(person[5]);
		setContact.getAddress().setStreet(person[1]);
		setContact.getAddress().setCity(person[2]);
		setContact.getAddress().setState(person[3]);
		setContact.getAddress().setZip(person[4]);
		setContact.setfName(name[0]);
		setContact.setlName(name[name.length-1]);
		String mName = "";
		for(int i = 1; i < name.length-1; i++)
		{
			mName += " "+name[i];
		}
		setContact.setmName(mName);
		
		contactList.add(setContact);
		System.out.println("Contact Added! ");
		break;
		
	case 2: //delete entry
		
		System.out.println("Enter user details for deletion");
		String deleteFirstName = newPerson.nextLine();
		String deleteLastName = newPerson.nextLine();
		
		for(Contact myContact : contactList) {
			if(deleteFirstName.equals(myContact.getfName()))
			{
				System.out.println("Contact " + myContact + " deleted.");
				contactList.remove(myContact);
				
			}
			if(deleteLastName.equals(myContact.getlName())) 
			{
				contactList.remove(myContact.getlName());
				System.out.println("Contact " + myContact + " deleted.");
				
			}
		}
		
		break;
		
	case 3: //search by first name
		
		System.out.println("Please enter FIRST NAME to search: ");
		String fName = newPerson.nextLine();
		
		for (Contact myContact : contactList) {
			if(fName.equals(myContact.getfName()))
			{
				System.out.println("Contact found "+ myContact);
			} 
		}
		
		break;
		
	case 4: //search by last name
		
		System.out.println("Please enter LAST NAME to search: ");
		String lName = newPerson.nextLine();
		
		for (Contact myContact : contactList) {
			if(lName.equals(myContact.getlName()))
			{
				System.out.println("Contact found! "+ myContact);
			}
		}
		
		break;
		
	case 5: //search by full name
		
		System.out.println("Please enter FULL NAME to search: ");
		String fullName = newPerson.nextLine();
		
		for(Contact myContact : contactList) {
			String newFullName = myContact.getfName()+ " "+myContact.getmName()+ " "+myContact.getlName();
			if(fullName.equals(newFullName)) 
			{
				System.out.println("Contact " + fullName + " found.");
			}
			
		}
		
		break;
		
	case 6: //search by telephone number
		
		System.out.println("Please enter TELEPHONE NUMBER to search: ");
		String telephoneNumber = newPerson.nextLine();
		
		for(Contact myContact : contactList) {
			if(telephoneNumber.equals(myContact.getTelephone())) 
			{
				System.out.println("Contact " + telephoneNumber + " found.");
			}
			
		}
		
		break;
		
	case 7: //search by city or state
		
		System.out.println("Please enter the CITY or the STATE to search: ");
		String city = newPerson.nextLine();
		String state = newPerson.nextLine();
		
		for(Contact myContact : contactList) {
			if(city.equals(myContact.getAddress().getCity()))
			{
				System.out.println("Contact " + myContact + " is found.");
			}
			
			if(state.equals(myContact.getAddress().getState())) 
			{
				System.out.println("Contact " + myContact + " is found.");
			}
		}
		
		break;
		
	case 8: //delete record for given telephone number
		
		System.out.println("Please enter TELEPHONE NUMBER to delete: ");
		String deleteTelephoneNumber = newPerson.nextLine();
		
		for(Contact myContact : contactList) {
			if(deleteTelephoneNumber.equals(myContact.getTelephone())) 
			{
				System.out.println(myContact + " is deleted.");
				contactList.remove(myContact);
				
			}
		}
		
		break;
		
	case 9: //update record for given telephone number
		
			System.out.println("Please enter TELEPHONE NUMBER to update");
			String numberUpdate = newPerson.nextLine();
			
			for(Contact myContact : contactList) {
				String updateTelephoneNumber = myContact.getTelephone();
				if(updateTelephoneNumber.trim().equals(numberUpdate.trim()))
				{
					System.out.println("Contact " + myContact + " updated.");
					numberUpdate = updateTelephoneNumber;
				}
			}
		
		break;
		
	
		default:
		
		
		break;

	}
		
		
	}while(entry != 10);


	System.out.println("Have a nice day!");
		
		
	}



}
