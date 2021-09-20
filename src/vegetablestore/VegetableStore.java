/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetablestore;


public class VegetableStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vegetables obj1 = new Vegetables();
        
        Update obj2 = new carrot();
        Update obj3 = new corn();
        Update obj4 = new corn();
        
        obj1.Enter(obj2);
        obj1.Enter(obj3);
        obj1.Enter(obj4);
        
        String Item = "Lemon";
        
        obj1.changeItem(Item);
        
        obj1.Delete(obj4);
        
        String Item2 = "Cucumber";
        obj1.changeItem(Item2);
       
        
        
    }
    
}
