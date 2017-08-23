//Jessie Romero
package cisproject;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class TaskData 
{
    private BufferedReader employeeFileReader;
    private BufferedReader projectFileReader;
    private BufferedReader workOnReader;
    private HashSet employeeNamesArray = new HashSet();
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
    
    public void addProject()
    {
        
    }
    
    public void addEmployee(String name)
    {
        int counter = 0;
        
        for(Employee e: empObjList)//counts how many times the same name appears in employee list to avoid duplicates
        {
            if(e.getName().equals(name))
            {
                counter ++;
            }
        }
        
        if(counter == 0) //if employe does not already exists, do...
        {
            Employee employee = new Employee(name);
            empObjList.add(employee);
            
            
            try
            {
                File file = new File("employee.txt");

                PrintWriter output = new PrintWriter(
                                     new BufferedWriter(
                                     new FileWriter(file)));


                for(Employee e: empObjList)
                {
                    output.println(e.getName());
                }

                output.close();
                System.out.println(name + "has been added to the save file.");

            }

            catch(IOException ioe)
            {
                System.out.println(ioe);
            }
        }   
        
            
    }
    
    
    public void removeEmployee(String name) //won't be used
    {
        for(Employee e: empObjList)
        {
            if(e.getName().equals(name))
            {
                
                empObjList.remove(e);
                System.out.println(name + " has been removed from employee list!");
                
            } 
        }
        

    }
}
