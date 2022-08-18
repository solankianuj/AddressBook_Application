package com.bridgelabz.addressbook.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AddressNotFound extends  RuntimeException{

    private int errorcode;
    private String statusMessage;

    public AddressNotFound(int errorcode, String statusMessage) {
        super(statusMessage);
        this.errorcode = errorcode;
        this.statusMessage = statusMessage;
    }
}
