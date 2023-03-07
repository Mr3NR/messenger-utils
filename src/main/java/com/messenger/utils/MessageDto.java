package com.messenger.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class MessageDto<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = -6760549396167215651L;

    @Nullable
    private String auth;

    private boolean success;

    @Nullable
    private String comment;

    @NonNull
    private Command command;

    @Nullable
    private T data;

    public MessageDto(boolean success, String comment) {
        this.success = success;
        this.comment = comment;
    }
}
