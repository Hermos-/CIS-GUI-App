//Jessie Romero
package cisproject;
import java.util.*;
public class Employee {
    
    final private Object name;
    private HashSet projectsWorkedOn;
    
    
    Employee(Object name)
    {
        this.projectsWorkedOn = new HashSet();
        this.name = name;
    }
    
    Employee(String name)
    {
        this.projectsWorkedOn = new HashSet();
        this.name = name;
    }
    
    public Object getName()
    {
        return name;
    }
    
    public void assignProject(Object projectAssigned)
    {
        projectsWorkedOn.add(projectAssigned);
    }
    
    public void removeFromProject(String project)
    {
        if(projectsWorkedOn.contains(project))
        {
            projectsWorkedOn.remove(project);
        }
    }
    
    public HashSet getAssignedProjects()
    {
        return projectsWorkedOn;
    
    }
    
    public String getProjectReport()
    {
        if(!this.getAssignedProjects().isEmpty())
        {
        return name + " is currently working on project(s) " + this.getAssignedProjects() + "\n";
        }
        
        else
        {
            return name + " is not currently assigned to a project.\n";
        }
    
    }
}
