
package imc.questão2;

import javax.swing.JOptionPane;

public class IMCQuestão2 {

    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Digite o seu peso em kg:");
        String altura = JOptionPane.showInputDialog("Digite a sua altura em m:");
        
        double pesoNum = Double.parseDouble(peso);
        double alturaNum = Double.parseDouble(altura);
        double imc = pesoNum / (alturaNum * alturaNum);
        
        JOptionPane.showMessageDialog(null, "O seu IMC é: " + String.format("%.2f", imc));
        if (imc < 18.5) 
        {
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso.");
        } 
        else if (imc < 25) 
        {
            JOptionPane.showMessageDialog(null, "Você está com o peso normal.");
        } 
        else if (imc < 30) 
        {
            JOptionPane.showMessageDialog(null, "Você está com sobrepeso.");
        } 
        else if (imc < 35) 
        {
            JOptionPane.showMessageDialog(null, "Você está com obesidade leve.");
        } 
        else if (imc < 40) 
        {
            JOptionPane.showMessageDialog(null, "Você está com obesidade moderada.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Você está com obesidade mórbida.");
        }
    }
}