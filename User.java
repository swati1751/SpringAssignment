package SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

    private String name;
    private String phone;
    @Autowired
    private Address address;
    @Autowired
    private Team team;
}
