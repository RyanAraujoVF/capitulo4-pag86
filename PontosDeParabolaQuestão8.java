package pontosdeparabola.questão8;

import javax.swing.JOptionPane;

public class PontosDeParabolaQuestão8 {

    
    public static void main(String[] args) {     
        double x, y;
               
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y:"));
             
        if (y == Math.pow(x, 2) + 1) 
        {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") pertence à parábola y = x^2 + 1");
        } 
        else if (y > Math.pow(x, 2) + 1) 
        {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") está acima da parábola y = x^2 + 1");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") está abaixo da parábola y = x^2 + 1");
        }
    }
}
