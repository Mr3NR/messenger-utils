package com.messenger.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class MessageDto<T> implements Serializable {
    private static final long serialVersionUID = -6760549396167215651L;

    private String auth;

    private boolean success;

    private String message;

    private Command command;

    private T data;
}
