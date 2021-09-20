/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetablestore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FAro0Q aHm3D
 */
public class Vegetables implements Inventry{
    
    private List<Update> obs;
    private String item;

    public Vegetables() {
        
        this.obs = new ArrayList<>();
    
    }
    
    
    
    @Override
    public void Enter(Update ob) {
   
        obs.add(ob);
    }

    @Override
    public void Delete(Update ob) {
   
        obs.remove(ob);
    
    }

    @Override
    public void noticeItems() {
  
        
         for(Update ob : obs){
            ob.update(item);
        }
    
    
    }

  public void changeItem(String Item)
    {
        this.item = Item;
        noticeItems();
    }

}
