package main;

public class ToDo {
	private int id;
	private String todoItem;
	private static int counter = 0;
	
	public ToDo(String todoItem) {
		this.id = ++this.counter;
		this.todoItem = todoItem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTodoItem() {
		return todoItem;
	}
	public void setTodoItem(String todoItem) {
		this.todoItem = todoItem;
	}
	
	
}
