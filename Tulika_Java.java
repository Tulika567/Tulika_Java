import java.io.Serializable;
public class Employee implements Serializable{ 
   private static final long serialVersionUID = 1L;    
  int employeeId;
    String employeeName;
    String department;
    
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

package org.arpitjavapostsforlearning;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 public class SerializeMain {
 public static void main(String[] args) {
  Employee emp = new Employee();
  emp.setEmployeeId(12345);
  emp.setEmployeeName("abcd");
  emp.setDepartment("CS");
  try
  {
   FileOutputStream fileOut = new FileOutputStream("employee.ser");
   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
   outStream.writeObject(emp);
   outStream.close();
   fileOut.close();
  }catch(IOException i)
  {
   i.printStackTrace();
  }
 }
}

package org.arpit.javapostsforlearning;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DeserializeMain {
 public static void main(String[] args) {
  
  Employee emp = null;
       try
       {
          FileInputStream fileIn =new FileInputStream("employee.ser");
          ObjectInputStream in = new ObjectInputStream(fileIn);
          emp = (Employee) in.readObject();
          in.close();
          fileIn.close();
       }catch(IOException i)
       {
          i.printStackTrace();
          return;
       }catch(ClassNotFoundException c)
       {
          System.out.println("Employee class not found");
          c.printStackTrace();
          return;
       }
       System.out.println("Deserialized Employee...");
       System.out.println("Emp id: " + emp.getEmployeeId());
       System.out.println("Name: " + emp.getEmployeeName());
       System.out.println("Department: " + emp.getDepartment());
 }
}



#include <iostream>
using namespace std;
 
int squareSum(int n)
{
    int sum = 0;
    for (int i = 1; i <=  n; i++)
        sum += (2*i - 1) * (2*i - 1);
    return sum;
}
 
int main()
{
    cout << squareSum(8);
    return 0;
}