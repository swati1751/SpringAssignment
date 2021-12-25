package SpringAssignment;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;

public class Project {
    @Qualifier
    private ArrayList<Project> subProjects;
}