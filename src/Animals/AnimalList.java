/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;
import Lists.List;

/**
 *
 * @author ASUS
 */
public class AnimalList implements List<Animal>{
    private Animal animals[];

    
    public AnimalList() {
        this.animals = new Animal[100];
    }

    @Override
    public boolean add(Animal t) {
    for (int i = 0; i < 100; i++){
        if (animals[i]!=t && animals[i] != null){    
        animals[i]=t;
        return true;
      }
     }
    return false;
    }

    @Override
    public boolean remove(Animal t) {
    for (int i = 0; i < 100; i++){
        if (animals[i]==t){    
        animals[i]=null;
        return true;
      }
     }
    return false;
    }

    @Override
    public Animal find(Object id) {
    for (int i = 0; i < 100; i++){
        if (animals[i]==id){    
        return animals[i];
      }
     }
    return null;   
    }

    @Override
    public void showAll() {
    for (int i = 0; i < 100; i++){   
        System.out.println(animals[i]);
      }
     }   
    
}
    
