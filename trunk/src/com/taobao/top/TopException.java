package com.taobao.top;

/**
 * TOP客户端异常。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TopException extends RuntimeException {

	private static final long serialVersionUID = -238091758285157331L;

	private String errCode;
	private String errMsg;

	public TopException() {
		super();
	}

	public TopException(String message, Throwable cause) {
		super(message, cause);
	}

	public TopException(String message) {
		super(message);
	}

	public TopException(Throwable cause) {
		super(cause);
	}

	public TopException(String errCode, String errMsg) {
		super(errCode + ":" + errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

}
