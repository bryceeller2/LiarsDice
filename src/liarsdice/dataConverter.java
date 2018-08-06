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
        if (value != null){
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
