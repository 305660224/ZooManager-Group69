/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;
import Lists.List;
/**
 *
 * @author UTN
 */
public class VisitorList implements List<Visitor>{
    private Visitor visitors[];

    public VisitorList(Visitor[] visitors) {
        this.visitors = new Visitor[100];
    }

    @Override   
  public boolean add(Visitor t) {
 
    if (t == null || find(t.getId()) != null) {  
        return false; 
    }
    for (int i = 0; i < visitors.length; i++) {
        if (visitors[i] == null) {
            visitors[i] = t; 
            return true;     
        }
    }
    return false;
}

    @Override
    public boolean remove(Visitor t) {       
        for (int i = 0; i < 100; i++){
        if (visitors[i]==t){    
        visitors[i]=null;
        return true;
      }
     }
    return false;
    }
    
    
    @Override
   public Visitor find(Object id) {
    if (id == null) { 
        return null;
    }
    
    for (Visitor visitor : visitors) {  
        if (visitor != null && id.equals(visitor.getId())) { 
            return visitor;
        }
    }
    return null;  
}
    

    @Override
    public void showAll() {
         for (int i = 0; i <100; i++){
                System.out.println(visitors[i]);
            }
    }
}
    

