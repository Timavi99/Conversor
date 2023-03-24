package Temperatura;


import javax.swing.JOptionPane;

public class FuncionTemperatura {

    CovertirTemperatura temperatura = new CovertirTemperatura();

    public void Convertir(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "¿Qué temperatura desea convertir?", "TEMPERATURAS", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Celcius", "Fahrenheit", "Kelvin"}, "Seleccion")).toString();

        switch (opcion) {
            case "Celcius":
                temperatura.ConvertirCelcius(Minput);
                break;
            case "Fahrenheit":
                temperatura.ConvertirFahrenheit(Minput);
                break;
            case "Kelvin":
                temperatura.ConvertirKelvin(Minput);
                break;
        }
    }
}
