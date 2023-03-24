package Moneda;

import javax.swing.JOptionPane;

public class DolarEstadoUnidense {

    public void ConvertirDolarABolivar(double valor) {
        double monedaBolivar = valor *24.10;
        monedaBolivar = (double) Math.round(monedaBolivar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " USD equivalen a " + monedaBolivar + " VEN");
    }

    public void ConvertirDolarAEuro(double valor) {
        double monedaEuro= valor *0.92;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " USD equivalen a " + monedaEuro + " EUR");
    }

    public void ConvertirDolarALibraEterlina(double valor) {
        double monedaLibra = valor *0.82;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " USD equivalen a " + monedaLibra + " GBP");
    }

    public void ConvertirDolarAYenJapones(double valor) {
        double monedaYen= valor *131.40;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " USD equivalen a " + monedaYen + " YPY");
    }

    public void ConvertirDolarAWonSurcoreano(double valor) {
        double monedaWon = valor *1296.47;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " USD equivalen a " + monedaWon + " KRW");
    }
}
