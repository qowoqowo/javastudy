package myproject;

import java.util.ArrayList;

import ch09_class.homepage.Member;

public class User {
	private String name;
	private int no;
	private int hp;
	

	public static ArrayList<User> userList = new ArrayList<>();
	
	public User() {
		for(int i = 1; i <= 4; i++) {
		userList.add(new User("사용자 "+i , 100));
		}
	}
	
	public User(String name) {
		this.name = name;
		hp = 100;
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public static ArrayList<User> getUserList() {
		return userList;
	}

	public static void setUserList(ArrayList<User> userList) {
		User.userList = userList;
	}

	public User(String name, int hp) {
		this.name = name;
		
		this.hp = hp;
	}
	
	public User(String name, int no ,int hp) {
		this.name = name;
		this.no = no;
		this.hp = hp;
	}
	

	@Override
	public String toString() {
		return "User [name=" + name + ", hp=" + hp + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
	
}
