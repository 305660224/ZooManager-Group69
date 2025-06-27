/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import Lists.List;
import java.util.Arrays; 

/**
 *
 * @author UTN
 */
public class VisitsList implements List<Visit> {
    private Visit[] visits;

    public VisitsList() {
        this.visits = new Visit[100];
    }

    public boolean add(Visit t) {
        for (int i = 0; i < visits.length; i++) {
            if (visits[i] == null) {
                visits[i] = t;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean remove(Visit t) {
        boolean removed = false;
        for (int i = 0; i < visits.length; i++) {
            if (visits[i] != null && visits[i].equals(t)) {
                visits[i] = null;
                removed = true;
                break;  
            }
        }
        return removed;
    }
    
    public Visit find(Object id) {
    for (int i = 0; i < visits.length; i++) {
        if (visits[i] != null && visits[i].equals(id)) { 
            return visits[i]; 
        }
    }
    return null; 
}

    public void showAll() {
        System.out.println(Arrays.toString(visits));
    }
}
