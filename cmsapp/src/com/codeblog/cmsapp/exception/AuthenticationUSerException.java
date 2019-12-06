package com.codeblog.cmsapp.exception;

public class AuthenticationUSerException extends Exception {
	
	AuthenticationUSerException()
	{
		super();
	}

	public AuthenticationUSerException(String errMsg)
	{
		super(errMsg);
	}
}
