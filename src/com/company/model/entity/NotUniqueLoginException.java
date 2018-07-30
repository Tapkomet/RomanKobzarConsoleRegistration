package com.company.model.entity;

/**
 * Created by Roman Kobzar on 20.07.2018.
 *
 * A custom exception that return the login data, so
 * the user doesn't have to type it in again
 */
public class NotUniqueLoginException extends Exception {
    /**
	 *
	 */
	private static final long serialVersionUID = -8693775726082853313L;
	private String loginData;

    public String getLoginData() {
        return loginData;
    }

    public NotUniqueLoginException(String message, String loginData) {
        super(message);
        this.loginData = loginData;
    }
}
