package idadedapessoa.questão9;

import javax.swing.JOptionPane;


public class IdadeDaPessoaQuestão9 {

    
    public static void main(String[] args) {
    
        int idade;
              
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
                
        if (idade >= 18) 
        {
            JOptionPane.showMessageDialog(null, "VOCÊ É MAIOR DE IDADE");
        } 
        else 
        {          
            int anosFaltam = 18 - idade;
            JOptionPane.showMessageDialog(null, "VOCÊ É MENOR DE IDADE AINDA FALTAM " + anosFaltam + " ANOS PARA SER MAIOR");
        }
    }
}
