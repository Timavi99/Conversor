package Moneda;

import javax.swing.JOptionPane;

public class FuncionMoneda {

    ConvertirMoneda monedas = new ConvertirMoneda();

    public void Convertir(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "¿Qué moneda desea convertir?", "MONEDAS", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Bolívar Venzolano", "Dólar EstadoUnidense", "Euro", "Libra Esterlina", "Yen Japonés", "Won Surcoreano"}, "Seleccion")).toString();

        switch(opcion) {
            case "Bolívar Venzolano":
                monedas.ConvertirBolivarVenezolano(Minput);
                break;
            case "Dólar EstadoUnidense":
                monedas.ConvertirDolarEsadoUnidense(Minput);
                break;
            case "Euro":
                monedas.ConvertirEuro(Minput);
                break;
            case "Libra Esterlina":
                monedas.ConvertirLibraEsterlina(Minput);
                break;
            case "Yen Japonés":
                monedas.ConvertirYenJapones(Minput);
                break;
            case "Won Surcoreano":
                monedas.ConvertirWonSurcoreano(Minput);
                break;

        }
    }
}
