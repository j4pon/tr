
package pe.ripley.model;

import java.util.ArrayList;

public class Response {
    private String msgcode = "1";
    private String msgtext;
    private Object msgdata = new Object();
    private boolean status = false;

    public Response(Exception e){
    	System.out.println(e.getMessage());
    	this.msgdata = e.getMessage();
    }
    
    public Response(String msgcode, String msgtext, Object msgdata) {
        this.msgcode = msgcode;
        this.msgtext = msgtext;
        this.msgdata = msgdata;
        this.status = true;
    }

    
    public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMsgcode() {
        return msgcode;
    }

    public void setMsgcode(String msgcode) {
        this.msgcode = msgcode;
    }

    public String getMsgtext() {
        return msgtext;
    }

    public void setMsgtext(String msgtext) {
        this.msgtext = msgtext;
    }

    public Object getMsgdata() {
        return msgdata;
    }

    public void setMsgdata(Object msgdata) {
        this.msgdata = msgdata;
    }
    
    
    
}
