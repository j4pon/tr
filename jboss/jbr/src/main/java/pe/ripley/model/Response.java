
package pe.ripley.model;

public class Response {
    private String msgcode;
    private String msgtext;
    private Object msgdata;
    private boolean status = false;

    public Response(String msgcode, String msgtext, Object msgdata) {
        this.msgcode = msgcode;
        this.msgtext = msgtext;
        this.msgdata = msgdata;
        this.status = true;
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
