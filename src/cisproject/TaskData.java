//Jessie Romero
package cisproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TaskData 
{
    private BufferedReader employeeFileReader;
    private BufferedReader projectFileReader;
    private BufferedReader workOnReader;
    private ArrayList employeeNamesArray = new ArrayList();
    private ArrayList workOnArray = new ArrayList();
    
    public ArrayList projectNamesArray = new ArrayList();
    public ArrayList<Employee> empObjList = new ArrayList();
    
    
    
    TaskData()
    {
        loadTxtFiles();
        loadEmployeeValues();
    }
    
    
    private void loadTxtFiles()
    {
        try{
            
            employeeFileReader = new BufferedReader(new FileReader("employee.txt"));
            projectFileReader = new BufferedReader(new FileReader("project.txt"));
            workOnReader = new BufferedReader(new FileReader("workon.txt"));

            String employeeFileLine = employeeFileReader.readLine();
            String projectFileLine = projectFileReader.readLine();
            String workOnLine = workOnReader.readLine();


            while(employeeFileLine != null)
            {
                employeeNamesArray.add(employeeFileLine);
                employeeFileLine = employeeFileReader.readLine();
            }

            while(projectFileLine != null)
            {
                projectNamesArray.add(projectFileLine);
                projectFileLine = projectFileReader.readLine();
            }
            
            while(workOnLine != null)
            {
                workOnArray.add(workOnLine);
                workOnLine = workOnReader.readLine();
            }

            employeeFileReader.close();
            projectFileReader.close();
            workOnReader.close();                  
        }
        
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
    
    
    private void loadEmployeeValues()
    {
        
        for(Object name: employeeNamesArray)
        {
            Employee employee = new Employee(name); //creates new Employee obj for each unique name in employee.txt

            
            //Looks through the workOnArray, formats the string then assigns each employee their respected project
            for(Object assignedProject: workOnArray)
            {
                String s = assignedProject.toString();
                String employeeName = s.substring(0, s.indexOf('<'));
                String projectAssigned = s.substring((s.indexOf('>') + 1), s.length());
                
                if(employee.getName().equals(employeeName))
                {
                    employee.assignProject(projectAssigned);
                }
            
            }    
            empObjList.add(employee);
        }
    }
}
