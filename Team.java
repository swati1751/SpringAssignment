package SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Team {

    @Value("${Team.Name}")
    private String teamName;

    @Value("{NumberOf.Members}")
    private int numberOfMembers;

    @Autowired
    private Project project;
}
