package com.smart.mvc.model;

import lombok.Setter;

/**
 * 返回结果
 * 
 * @author Joe
 */
@Setter
public class Result {

	/**
	 * 结果体
	 */
	protected Object data;

	/**
	 * 状态码
	 */
	protected Integer code;

	/**
	 * 信息
	 */
	protected String message;

	private Result() {
		super();
	}

	private Result(Integer code) {
		this.code = code;
	}

	public static Result create(Integer code) {
		return new Result(code);
	}

	public static Result createSuccessResult() {
		return create(ResultCode.SUCCESS);
	}

	public static Result createSuccessResult(Object data, String message) {
		return createSuccessResult().setData(data).setMessage(message);
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}

	public Result setCode(Integer code) {
		this.code = code;
		return this;
	}

	public Result setMessage(String message) {
		this.message = message;
		return this;
	}
}
