class Employee{
    private int id;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpid(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpid(int newValue){
        id = newValue;
    }
}
public class EncapsulationDemo{
    public static void main(String args[]){
         Employee obj = new Employee();
         obj.setEmpName("Rupa");
         obj.setEmpAge(21);
         obj.setEmpid(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee id: " + obj.getEmpid());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
