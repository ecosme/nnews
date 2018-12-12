package myportal.com.business;

import lombok.Data;

@Data
public class UserRequest {

    String id;
    String identity;
    String name;
    Role role;
}


