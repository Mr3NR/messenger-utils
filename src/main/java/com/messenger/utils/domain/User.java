package com.messenger.utils.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class User implements Serializable {
    
    private String username;
    private String firstname;
    private String lastname;
    private Date birthday;
}
