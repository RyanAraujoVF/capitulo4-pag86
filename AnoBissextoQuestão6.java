
package anobissexto.questão6;

import javax.swing.JOptionPane;

public class AnoBissextoQuestão6 {

    public static void main(String[] args) {
    
        String ano = JOptionPane.showInputDialog("Digite um ano:");
        int anoNum = Integer.parseInt(ano);

        if (anoNum % 4 == 0) 
        {         
            if (anoNum % 100 == 0) 
            {         
                if (anoNum % 400 == 0) 
                {                   
                    JOptionPane.showMessageDialog(null, "O ano " + anoNum + " é bissexto.");
                } 
                else 
                {                   
                    JOptionPane.showMessageDialog(null, "O ano " + anoNum + " não é bissexto.");
                }
            } 
            else 
            {  
                JOptionPane.showMessageDialog(null, "O ano " + anoNum + " é bissexto.");
            }
        } else {          
            JOptionPane.showMessageDialog(null, "O ano " + anoNum + " não é bissexto.");
        }
    }
}