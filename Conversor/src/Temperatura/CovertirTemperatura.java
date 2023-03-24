package Temperatura;

import javax.swing.JOptionPane;

public class CovertirTemperatura {

    Celcius celcius = new Celcius();
    Fahrenheit fahrenheit = new Fahrenheit();
    Kelvin kelvin = new Kelvin();

    public void ConvertirCelcius(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la temperatura a la que desea convertir ", "CELCIUS", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celcius a Fahrenheit", "De Celcius a Kelvin"}, "Seleccion")).toString();

        switch (opcion) {
            case "De Celcius a Fahrenheit":
                celcius.ConvertirCelciusAFahrenheit(Minput);
                break;
            case "De Celcius a Kelvin":
                celcius.ConvertirCelciusAKelvin(Minput);
                break;
        }
    }

    public void ConvertirFahrenheit(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la temperatura a la que desea convertir ", "FAHRENHEIT", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Fahrenheit a Celcius", "De Fahrenheit a Kelvin"}, "Seleccion")).toString();

        switch(opcion) {
            case "De Fahrenheit a Celcius":
                fahrenheit.ConvertirFahrenheitACelcius(Minput);
                break;
            case "De Fahrenheit a Kelvin":
                fahrenheit.ConvertirFahrenheitAKelvin(Minput);
                break;
        }
    }

    public void ConvertirKelvin(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la temperatura a la que desea convertir", "KELVIN", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Kelvin a Celcius", "De Kelvin a Fahrenheit"},"Seleccion")).toString();

        switch (opcion) {
            case "De Kelvin a Celcius":
                kelvin.ConvertirKelvinACelcius(Minput);
                break;
            case "De Kelvin a Fahrenheit":
                kelvin.ConvertirKelvinAFahrenheit(Minput);
                break;
        }
    }
}
