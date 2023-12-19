
package consumo.questão.pkg5;

import javax.swing.JOptionPane;

public class ConsumoQuestão5 {

    public static void main(String[] args) {
       
        String distancia = JOptionPane.showInputDialog("Digite a distância percorrida em Km:");
        String combustivel = JOptionPane.showInputDialog("Digite a quantidade de combustível gasto em Litros:");
     
        double distanciaNum = Double.parseDouble(distancia);
        double combustivelNum = Double.parseDouble(combustivel);

        double kmPorLitro = distanciaNum / combustivelNum;

        JOptionPane.showMessageDialog(null, "O consumo de combustível é: " + String.format("%.2f", kmPorLitro) + " Km/L");

        if (kmPorLitro >= 15) 
        {  
            JOptionPane.showMessageDialog(null, "O veículo em questão é econômico.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O veículo em questão não é econômico.");
        }
    }
}