package Moneda;

import javax.swing.JOptionPane;

public class Euro {

    public void ConvertirEuroABolivar(double valor) {
        double monedaBolivar = valor *26.18;
        monedaBolivar = (double) Math.round(monedaBolivar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " EUR equivalen a " + monedaBolivar + " VEN");
    }

    public void ConvertirEuroADolar(double valor) {
        double monedaDolar = valor *1.09;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " EUR equivalen a " + monedaDolar + " USD");
    }

    public void ConvertirEuroALibraEsterlina(double valor) {
        double monedaLibra = valor *0.89;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " EUR equivalen a " + monedaLibra + " GBP");
    }

    public void ConvertirEuroAYenJapones(double valor) {
        double monedaYen = valor *142.68;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " EUR equivalen a " + monedaYen + " YPY");
    }

    public void ConvertirEuroAWonsurcoreano(double valor) {
        double monedaWon = valor *1408.48;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " EUR equivalen a " + monedaWon + " KWR");
    }

}
