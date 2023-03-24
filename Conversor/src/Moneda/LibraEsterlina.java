package Moneda;

import javax.swing.JOptionPane;

public class LibraEsterlina {


    public void ConvertirLibraEsterlinaABolivar(double valor) {
        double monedaBolivar = valor *29.56;
        monedaBolivar = (double) Math.round(monedaBolivar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " GBP equivalen a " + monedaBolivar + " VEN");
    }

    public void ConvertirLibraEsterlinaADolar(double valor) {
        double monedaDolar = valor *1.23;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " GBP equivalen a " + monedaDolar + " USD");
    }

    public void ConvertirLibraEsterlinaAEuro(double valor) {
        double monedaEuro= valor *1.13;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " GBP equivalen a " + monedaEuro + " EUR");
    }

    public void ConvertirLibraEsterlinaAYenJapones(double valor) {
        double monedaYen = valor *161.18;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " GBP equivalen a " + monedaYen + " YPY");
    }

    public void ConvertirLibraEsterlinaAWonsurcoreano(double valor) {
        double monedaWon = valor *1590.89;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " GBP equivalen a " + monedaWon + " KRW");
    }

}
