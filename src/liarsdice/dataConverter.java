/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarsdice;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
/**
 *
 * @author Computer
 */
public class dataConverter {
    public static int getCountFromButton(ButtonGroup group){
        
        
        String value = getSelectedButtonText(group);
        Integer n=0;
        switch(value){
            case "Two's":
                n = 2;
                break;
            case "Three's":
                n = 3;
                break;
            case "Four's":
                n = 4;
                break;
            case "Five's":
                n = 5;
                break;
            case "Six's":
                n = 6;
                break;
        }
        if (n==0){
            System.out.println("Button text not recognized: " +value);
            throw new NullPointerException("Button text not recognized: " +value);
        }
            
        return n;
    }
    
    public static String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
}
