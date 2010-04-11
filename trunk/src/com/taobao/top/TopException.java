package com.taobao.top;

/**
 * TOP客户端异常。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TopException extends RuntimeException {

	private static final long serialVersionUID = -238091758285157331L;

	private int errCode;
	private String errMsg;
	private String subErrCode;
	private String subErrMsg;

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

	public TopException(int errCode, String errMsg) {
		super(errCode + ":" + errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public TopException(int errCode, String errMsg, String subErrCode, String subErrMsg) {
		super(errCode + ":" + errMsg + ", " + subErrCode + ":" + subErrMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
		this.subErrCode = subErrCode;
		this.subErrMsg = subErrMsg;
	}

	public int getErrCode() {
		return this.errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public String getSubErrCode() {
		return this.subErrCode;
	}

	public String getSubErrMsg() {
		return this.subErrMsg;
	}

}
