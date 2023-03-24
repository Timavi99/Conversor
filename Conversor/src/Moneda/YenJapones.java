package Moneda;

import javax.swing.JOptionPane;

public class YenJapones {


    public void ConvertirYenJaponesABolivar(double valor) {
        double monedaBolivar = valor *0.18;
        monedaBolivar = (double) Math.round(monedaBolivar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " YPY equivalen a " + monedaBolivar + " VEN");
    }

    public void ConvertirYenJaponesADolar(double valor) {
        double monedaDolar = valor *0.0075;
        monedaDolar = (double) Math.round(monedaDolar *10000d)/10000;
        JOptionPane.showMessageDialog(null, valor + " YPY equivalen a " + monedaDolar + " USD");
    }

    public void ConvertirYenJaponesAEuro(double valor) {
        double monedaEuro= valor *0.0070;
        monedaEuro = (double) Math.round(monedaEuro *10000d)/10000;
        JOptionPane.showMessageDialog(null, valor + " YPY equivalen a " + monedaEuro + " EUR");
    }

    public void ConvertirYenJaponesALibraEsterlina(double valor) {
        double monedaLibra = valor *0.0062;
        monedaLibra = (double) Math.round(monedaLibra *10000d)/10000;
        JOptionPane.showMessageDialog(null, valor + " YPY equivalen a " + monedaLibra + " GBP");
    }

    public void ConvertirYeneJaponesAWonsurcoreano(double valor) {
        double monedaWon = valor *9.86;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " YPY equivalen a " + monedaWon + " KRW");
    }
}
