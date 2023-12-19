
package ingresso.questão3;

import javax.swing.JOptionPane;


public class IngressoQuestão3 {

    
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Digite o dia da semana (1 a 7):");
        String idade = JOptionPane.showInputDialog("Digite a sua idade:");
        String preco = JOptionPane.showInputDialog("Digite o preço-base do ingresso:");
        
        int diaNum = Integer.parseInt(dia);
        int idadeNum = Integer.parseInt(idade);
        int precoNum = Integer.parseInt(preco);
        
        int valor = precoNum;
        
        if (diaNum == 3 || idadeNum < 14) 
        {
            valor = valor / 2;
        }
        JOptionPane.showMessageDialog(null, "O valor a pagar é: R$" + valor);
    }
}