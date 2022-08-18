package com.bridgelabz.addressbook.util;

import lombok.Data;

@Data
public class Response {
    private String message;
    private int errorcode;

    public Response() {
    }
}
