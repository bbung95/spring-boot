package com.spring.springbootmvc.user;

public class ErrorMessage {

    private String message;
    private String reason;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "message='" + message + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
