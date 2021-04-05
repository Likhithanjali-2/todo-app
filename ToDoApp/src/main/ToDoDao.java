package main;

import java.util.List;
import java.util.ArrayList;

public class ToDoDao {
	List<ToDo> todoList=new ArrayList<ToDo>(); 
	public void addToDoItem(String item) {
		ToDo t = new ToDo(item);
		todoList.add(t);
	}
	
	public void showToDos() {
		for(ToDo t : todoList) {
			System.out.println(t.getId()+" - "+t.getTodoItem());
		}
	}
	
	public List<ToDo> removeToDoItem(int id){
		boolean status = false;
		for(int i=0;i<todoList.size();i++) {
			if(todoList.get(i).getId() == id){
				status = true;
				todoList.remove(i);
			}			
		}
		if(status == false) {
			System.out.println("The given ID not found in your ToDo list. Please select from the following items");
			this.showToDos();
		}
		return todoList;
	}
}
 