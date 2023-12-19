package eleição.questão10;

import javax.swing.JOptionPane;


public class EleiçãoQuestão10 {

    
    public static void main(String[] args) {
   
        String nome1, nome2, nome3;
        int votos1, votos2, votos3;
        
        nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro candidato:");
        votos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do primeiro candidato:"));
        nome2 = JOptionPane.showInputDialog("Digite o nome do segundo candidato:");
        votos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do segundo candidato:"));
        nome3 = JOptionPane.showInputDialog("Digite o nome do terceiro candidato:");
        votos3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do terceiro candidato:"));
        
        if (votos1 > votos2 && votos1 > votos3) 
        {
            JOptionPane.showMessageDialog(null, "O vencedor da eleição foi " + nome1 + " com " + votos1 + " votos.");
        } 
        else if (votos2 > votos1 && votos2 > votos3) 
        {
            JOptionPane.showMessageDialog(null, "O vencedor da eleição foi " + nome2 + " com " + votos2 + " votos.");
        } 
        else if (votos3 > votos1 && votos3 > votos2) 
        {
            JOptionPane.showMessageDialog(null, "O vencedor da eleição foi " + nome3 + " com " + votos3 + " votos.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Houve um empate na eleição.");
        }
    }
}
