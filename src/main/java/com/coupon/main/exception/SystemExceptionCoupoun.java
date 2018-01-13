package com.coupon.main.exception;

/**
 * 
 * @author omayer
 *@category SystemExceptionCoupoun 
 * Excpetion thrown when application communication with System.Coupoun fails.
 *
 */
public class SystemExceptionCoupoun extends Exception{

	
	/**
	 * Constructs a new SystemExceptionCoupoun with the specified detail message.
	 * 
	 * @param message
	 *            the detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method).
	 */
	public SystemExceptionCoupoun(String string) {
		super(string);
	}
	
	/**
	 * Constructs a new SystemExceptionCoupoun with the specified detail message and
	 * cause.
	 * 
	 * @param message
	 *            the detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method).
	 * @param cause
	 *            the cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A <tt>null</tt> value is
	 *            permitted, and indicates that the cause is nonexistent or
	 *            unknown.)
	 */
	public SystemExceptionCoupoun(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
