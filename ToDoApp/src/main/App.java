package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contin = null;
		ToDoDao dao = new ToDoDao();
		do {
			System.out.println("ToDo Application\n1.View ToDos\n2.Add ToDo\n3.Remove ToDo");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
				case 1:System.out.println("Your ToDo list");
					dao.showToDos();
					sc.nextLine();
					
					System.out.println("Do you want to continue (Y/N)");
					contin = sc.nextLine();
					break;
				case 2:System.out.println("Write your new ToDo item...");
					sc.nextLine();
					String item = sc.nextLine();
					dao.addToDoItem(item);
					System.out.println(item +" added to your ToDo list");
					
					System.out.println("Do you want to continue (Y/N)");
					contin = sc.nextLine();
					break;
				case 3:System.out.println("select ToDo Id from this list");
					dao.showToDos();
					int id = sc.nextInt();
					dao.removeToDoItem(id);
					sc.nextLine();
					
					System.out.println("Do you want to continue (Y/N)");
					contin = sc.nextLine();
					break;
				default:System.out.println("Invlaid input");
			}
		}while(contin.equalsIgnoreCase("y"));
	}

}
