package ProdegyInfoTechInternship;


	import java.util.ArrayList;
	import java.util.Scanner;

	class Contact {
	    private String name;
	    private String phoneNumber;
	    private String emailAddress;
	    private String gender;

	    public Contact(String name, String phoneNumber, String emailAddress, String gender) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.emailAddress = emailAddress;
	        this.gender = gender;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getEmailAddress() {
	        return emailAddress;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void displayContact() {
	        System.out.println("Name: " + name);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Email Address: " + emailAddress);
	        System.out.println("Gender: " + gender);
	        System.out.println("----------------------------");
	    }
	}

	public class Task_3 {
	    private static ArrayList<Contact> contacts = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int choice;

	        do {
	            System.out.println("Contact Management System");
	            System.out.println("1. Add New Contact");
	            System.out.println("2. View Contacts");
	            System.out.println("3. Edit Contact");
	            System.out.println("4. Delete Contact");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline

	            switch (choice) {
	                case 1:
	                    addContact();
	                    break;
	                case 2:
	                    viewContacts();
	                    break;
	                case 3:
	                    editContact();
	                    break;
	                case 4:
	                    deleteContact();
	                    break;
	                case 5:
	                    System.out.println("Exiting Contact Management System. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }

	        } while (choice != 5);

	        scanner.close();
	    }

	    private static void addContact() {
	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Phone Number: ");
	        String phoneNumber = scanner.nextLine();
	        System.out.print("Enter Email Address: ");
	        String emailAddress = scanner.nextLine();
	        System.out.print("Enter Gender: ");
	        String gender = scanner.nextLine();

	        Contact newContact = new Contact(name, phoneNumber, emailAddress, gender);
	        contacts.add(newContact);
	        System.out.println("Contact added successfully!");
	    }

	    private static void viewContacts() {
	        if (contacts.isEmpty()) {
	            System.out.println("No contacts found.");
	        } else {
	            System.out.println("Contact List:");
	            for (int i = 0; i < contacts.size(); i++) {
	                System.out.println("Index " + i + ":");
	                contacts.get(i).displayContact();
	            }
	        }
	    }

	    private static void editContact() {
	        if (contacts.isEmpty()) {
	            System.out.println("No contacts found.");
	        } else {
	            viewContacts();
	            System.out.print("Enter the index of the contact you want to edit: ");
	            int index = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline

	            if (index >= 0 && index < contacts.size()) {
	                System.out.println("Editing Contact:");
	                contacts.get(index).displayContact();

	                System.out.print("Enter new Name: ");
	                String newName = scanner.nextLine();
	                System.out.print("Enter new Phone Number: ");
	                String newPhoneNumber = scanner.nextLine();
	                System.out.print("Enter new Email Address: ");
	                String newEmailAddress = scanner.nextLine();
	                System.out.print("Enter new Gender: ");
	                String newGender = scanner.nextLine();

	                Contact updatedContact = new Contact(newName, newPhoneNumber, newEmailAddress, newGender);
	                contacts.set(index, updatedContact);
	                System.out.println("Contact updated successfully!");
	            } else {
	                System.out.println("Invalid index. Please enter a valid index.");
	            }
	        }
	    }

	    private static void deleteContact() {
	        if (contacts.isEmpty()) {
	            System.out.println("No contacts found.");
	        } else {
	            viewContacts();
	            System.out.print("Enter the index of the contact you want to delete: ");
	            int index = scanner.nextInt();

	            if (index >= 0 && index < contacts.size()) {
	                System.out.println("Deleting Contact:");
	                contacts.get(index).displayContact();
	                contacts.remove(index);
	                System.out.println("Contact deleted successfully!");
	            } else {
	                System.out.println("Invalid index. Please enter a valid index.");
	            }
	        }
	    }
	}


