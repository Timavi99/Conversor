package Temperatura;

import javax.swing.JOptionPane;

public class Celcius {

    public void ConvertirCelciusAFahrenheit(double valor) {
        double gradosFahrenheit = valor * 9 / 5 + 32;
        gradosFahrenheit = (double) Math.round(gradosFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + "°C Grados Celcius equivalen a " + gradosFahrenheit + "°F Grados Fahrenheit");
    }

    public void ConvertirCelciusAKelvin(double valor) {
        double gradosKelvin= valor + 273.15;
        gradosKelvin = (double) Math.round(gradosKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + "°C Grados Celcius equivalen a " + gradosKelvin + "K Grados Kelvin");
    }
}
