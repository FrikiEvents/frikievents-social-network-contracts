package com.frikiteam.socialnetworkcontracts.socialNetwork.contracts.commands.notification;

public class ApplicationError {
    private String message;
    private Exception cause;

    public ApplicationError(String message, Exception cause) {
        this.message = message;
        this.cause = cause;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Exception getCause() {
        return cause;
    }

    public void setCause(Exception cause) {
        this.cause = cause;
    }
}
