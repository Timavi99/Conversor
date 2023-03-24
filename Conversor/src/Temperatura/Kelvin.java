package Temperatura;

import javax.swing.JOptionPane;

public class Kelvin {

    public void ConvertirKelvinACelcius(double valor) {
        double gradosCelcius = valor - 273.15;
        gradosCelcius = (double) Math.round(gradosCelcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + "K Grados Kelvin equivalen a " + gradosCelcius + "°C Grados Celcius");
    }

    public void ConvertirKelvinAFahrenheit(double valor) {
        double gradosFahrenheit = valor - 273.15 * 9/5 + 32;
        gradosFahrenheit = (double) Math.round(gradosFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + "K Grados Kelvin equivalen a " + gradosFahrenheit + "°F Grados Fahrenheit");
    }

}
