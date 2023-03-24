package Moneda;

import javax.swing.JOptionPane;

public class BolivarVenezolano {

        public void ConvertirBolivarADolar(double valor) {
            double monedaDolar = valor *0.042;
            monedaDolar = (double) Math.round(monedaDolar *100d)/100;
            JOptionPane.showMessageDialog(null, valor + " VEN equivalen a " + monedaDolar + " USD");
        }

        public void ConvertirBolivarAEuro(double valor) {
            double monedaEuro = valor *0.038;
           monedaEuro = (double) Math.round(monedaEuro *100d)/100;
            JOptionPane.showMessageDialog(null, valor + " VEN equivalen a " + monedaEuro + " EUR");
        }

        public void ConvertirBolivarALibraEsterlina(double valor) {
            double monedaLibra = valor *0.034;
            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
            JOptionPane.showMessageDialog(null, valor + " VEN equivalen a " + monedaLibra + " GBP");
        }

        public void ConvertirBolivarAYenJapones(double valor) {
            double monedaYen = valor *5.45;
            monedaYen = (double) Math.round(monedaYen *100d)/100;
            JOptionPane.showMessageDialog(null, valor + " VEN equivalen a " + monedaYen + " YPY");
        }

        public void ConvertirBolivarAWonsurcoreano(double valor) {
            double monedaWon = valor *53.81;
            monedaWon = (double) Math.round(monedaWon *100d)/100;
            JOptionPane.showMessageDialog(null, valor + " VEN equivalen a " + monedaWon + " KRW");
        }

}
