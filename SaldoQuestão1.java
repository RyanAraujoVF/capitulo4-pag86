
package saldo.questão1;

import javax.swing.JOptionPane;

public class SaldoQuestão1 {

    public static void main(String[] args) {
       
        String saldoInicial = JOptionPane.showInputDialog("Digite o saldo inicial:");
        String totalDebitos = JOptionPane.showInputDialog("Digite o total de débitos:");
        String totalCreditos = JOptionPane.showInputDialog("Digite o total de créditos:");

        double saldoInicialNum = Double.parseDouble(saldoInicial);
        double totalDebitosNum = Double.parseDouble(totalDebitos);
        double totalCreditosNum = Double.parseDouble(totalCreditos);

        double saldoFinal = saldoInicialNum - totalDebitosNum + totalCreditosNum;
        
        if (saldoFinal > 0) 
        {
            JOptionPane.showMessageDialog(null, "Saldo positivo em R$" + String.format("%.2f", saldoFinal));
        } else if (saldoFinal < 0) 
        {
            JOptionPane.showMessageDialog(null, "Saldo negativo em R$" + String.format("%.2f", Math.abs(saldoFinal)));
        } else 
        {
            JOptionPane.showMessageDialog(null, "Saldo zero");
        }
    }
}