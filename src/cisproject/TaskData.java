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
    public HashSet projectNamesArray = new HashSet();
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
                if(!employeeFileLine.isEmpty())
                {
                    employeeNamesArray.add(employeeFileLine);
                }

                employeeFileLine = employeeFileReader.readLine();
            }

            while(projectFileLine != null)
            {
                if(!projectFileLine.isEmpty())
                {
                    projectNamesArray.add(projectFileLine);
                }
                
                projectFileLine = projectFileReader.readLine();
            }
            
            while(workOnLine != null)
            {
                if(!workOnLine.isEmpty())
                {
                    workOnArray.add(workOnLine);
                }
                
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
    
    public void addProject(String projectName)
    {
        if(!projectNamesArray.contains(projectName))//if project does not already exists, do... NOTE: this is not needed, projectNamesArray is a HashSet
        {
            try
            {
                projectNamesArray.add(projectName);
                
                File file = new File("project.txt");

                PrintWriter output = new PrintWriter(
                                     new BufferedWriter(
                                     new FileWriter(file)));
                
                
                for(Object s : projectNamesArray)
                {
                    output.println(s);
                }
                  
                output.close();
            }
            
            catch(IOException ioe)
            {
                System.out.println(ioe);
            }
        }
    }
    
    public void addEmployee(String name)
    {
        int counter = 0;
        
        for(Employee e: empObjList)//counts how many times the same name appears in employee list to avoid duplicates
        {
            String s = e.getName().toString().toLowerCase();
            if(s.equals(name.toLowerCase()))
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
