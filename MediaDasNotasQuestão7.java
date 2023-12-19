package mediadasnotas.questão7;

import javax.swing.JOptionPane;


public class MediaDasNotasQuestão7 {

    
    public static void main(String[] args) {
     
        double nota1, nota2, nota3, nota4, media;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
         
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
        if (media >= 6) 
        {        
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado!");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado!");
        }
    }
}
