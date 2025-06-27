/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;
import Lists.List;

/**
 *
 * @author Usuario
 */
public class EmployeeList implements List<Employee> {
    private Employee employees[];
    
    public EmployeeList(){
        this.employees=new Employee[100];
    }
    
    @Override
    public boolean add(Employee t) {
        if(t==null){
            return false;
        }
        for(int i=0;i<employees.length;i++) {
            if (employees[i]!=null && employees[i].getId().equals(t.getId())) {
                return false;
            }
        }
        for(int i=0;i<employees.length;i++){
            if(employees[i]==null){
                employees[i]=t;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean remove(Employee t) {
        if (t==null){
            return false;
        }
        
        for(int i=0;i<employees.length;i++) {
            if(employees[i]!=null && employees[i].getId().equals(t.getId())) {
                employees[i]=null;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Employee find(Object id) {
        if(id==null){
            return null;
        }
        
        String searchId = id.toString();
        for(int i=0;i<employees.length;i++){
            if(employees[i]!=null && employees[i].getId().equals(searchId)) {
                return employees[i];
            }
        }
        return null;
    }
    
    @Override
    public void showAll() {
        boolean hasEmployees=false;
        System.out.println("=== Employees List ===");
        for(int i=0;i<employees.length;i++){
            if(employees[i]!=null){
                System.out.println(employees[i].toString());
                hasEmployees=true;
            }
        }
        if(!hasEmployees){
            System.out.println("No hay empleados registrados.");
        }
    }
    
}

