package cn.yh.springmvc.utils;

public class CommonsResult {
	private int status;
	private Object obj;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public CommonsResult(int status, Object obj) {
		super();
		this.status = status;
		this.obj = obj;
	}
	public CommonsResult() {
		super();
	}
	public CommonsResult(int status) {
		super();
		this.status = status;
	}
	public CommonsResult(Object obj) {
		super();
		this.obj = obj;
	}
	
}
