package com.tns.dayfourteen.syncronization;

@SuppressWarnings("serial")
public class DepositLimitExceedsException extends Exception {
	public DepositLimitExceedsException()
	{
		super("Can't Deposit..Limit is exceeded");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}