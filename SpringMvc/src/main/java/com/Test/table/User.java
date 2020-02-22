package com.Test.table;
public class User {
   
  private int xuhao;
  
  private String username;
   
  private String password;

/**
 * @return the xuhao
 */
public int getXuhao() {
	return xuhao;
}

/**
 * @param xuhao the xuhao to set
 */
public void setXuhao(int xuhao) {
	this.xuhao = xuhao;
}

/**
 * @return the username
 */
public String getUsername() {
	return username;
}

/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}

/**
 * @return the password
 */
public String getPassword() {
	return password;
}

/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [xuhao=" + xuhao + ", username=" + username + ", password=" + password + "]";
}
  
  
  
}
