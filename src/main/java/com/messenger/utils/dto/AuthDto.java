package com.messenger.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class AuthDto implements Serializable {
    private static final long serialVersionUID = 1243804141985856814L;

    private String uuid;
}
