/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetablestore;

import java.util.List;


public class corn implements Update{
 
    private List<String> obs;
    String newItem ;
    
    @Override
    public void update(String Item) {
    
        this.newItem = Item;
        DisplayUpdated();
        
    }
    
    public void DisplayUpdated(){
    
        System.out.println("Updated Item: "+newItem);
        
    }
    
    
    
}
