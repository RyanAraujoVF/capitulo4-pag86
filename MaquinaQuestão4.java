
package maquina.questão4;

import javax.swing.JOptionPane;

public class MaquinaQuestão4 {

    public static void main(String[] args) {
     String valor = JOptionPane.showInputDialog("Digite um valor:");
        int valorNum = Integer.parseInt(valor);
        if (valorNum % 2 == 0) {
            int quadrado = valorNum * valorNum;
            JOptionPane.showMessageDialog(null, "O quadrado de " + valorNum + " é: " + quadrado);
        } else {
            int cubo = valorNum * valorNum * valorNum;
            JOptionPane.showMessageDialog(null, "O cubo de " + valorNum + " é: " + cubo);
        }
    }
}