package Moneda;

import javax.swing.JOptionPane;

public class WonSurcoreano {

    public void ConvertirWonsurcoreanoABolivar(double valor) {
        double monedaBolivar = valor *0.019;
        monedaBolivar = (double) Math.round(monedaBolivar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " KRW equivalen a " + monedaBolivar + " VEN");
    }

    public void ConvertirWonsurcoreanoADolar(double valor) {
        double monedaDolar = valor *0.00077;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " KRW equivalen a " + monedaDolar + " USD");
    }

    public void ConvertirWonsurcoreanoAEuro(double valor) {
        double monedaEuro= valor *0.000071;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " KRW equivalen a " + monedaEuro + " EUR");
    }

    public void ConvertirWonsurcoreanoALibraEsterlina(double valor) {
        double monedaLibra = valor *0.00063;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " KRW equivalen a " + monedaLibra + " GBP");
    }

    public void ConvertirWonsurcoreanoAYenJapones(double valor) {
        double monedaYen = valor *0.10;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " KRW equivalen a " + monedaYen + " YPY");
    }


}
