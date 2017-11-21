package com.pso1;

public class CalcException extends Exception {
	private String reason;
	private int errCode;

	public CalcException(String reason, int errCode) {
		this.reason = reason;
		this.errCode = errCode;
	}
	public String getReason() {
		return reason;
	}
	public int getErrCode() {
		return errCode;
	}
}
