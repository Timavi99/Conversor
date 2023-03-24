package Temperatura;

import javax.swing.JOptionPane;

public class Fahrenheit {
    public void ConvertirFahrenheitACelcius(double valor) {
        double gradosCelcius = valor - 32 * 5/9;
        gradosCelcius = (double) Math.round(gradosCelcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + "°F Grados Fahrenheit equivalen a " + gradosCelcius + "°C Grados Celcius");
    }

    public void ConvertirFahrenheitAKelvin(double valor) {
        double gradosKelvin = valor - 32 * 5/9 + 273.15;
        gradosKelvin = (double) Math.round(gradosKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, valor + "°F Grados Fahrenheit equivalen a " + gradosKelvin + "K Grados Kelvin");
    }
}
