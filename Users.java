package com.cdac;

public class Users {
		private String username;
		private String password;
		private String[][] accounts = {{"ravi", "12345"},{"chandan", "abcde"}};

		public Users(String user, String pass){
		    username = user;
		    password = pass;
		}

		public boolean auth(){
		    if((username == accounts[0][0]) && (password == accounts[0][1]))
		        return true;
		    else
		        return false;
		}


}
