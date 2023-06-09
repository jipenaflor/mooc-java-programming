/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */

import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> values;
    
    public Stack() {
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.values.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.values.add(value);
    }
    
    public ArrayList<String> values() {
        return this.values;
    }
    
    public String take() {
        int lastIndex = this.values.size() - 1;
        String lastElement = this.values.get(lastIndex);
        this.values.remove(lastIndex);
        
        return lastElement;
    }
}
