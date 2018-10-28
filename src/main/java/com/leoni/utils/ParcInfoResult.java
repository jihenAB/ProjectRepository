package com.leoni.utils;

public class ParcInfoResult {
	 private int resultCode;
	    private Object data;
	    private Exception exception;

	    public ParcInfoResult(Object data) {
	        this.data = data;
	        this.resultCode = 0;
	    }
	    
	    public ParcInfoResult(Exception exception) {
	        this.resultCode = -1;
	        this.exception = exception;
	    }

	    public int getResultCode() {
	        return resultCode;
	    }

	    public void setResultCode(int resultCode) {
	        this.resultCode = resultCode;
	    }

	    public Object getData() {
	        return data;
	    }

	    public void setData(Object data) {
	        this.data = data;
	    }

	    public Exception getException() {
	        return exception;
	    }

	    public void setException(Exception exception) {
	        this.exception = exception;
	    }
}
