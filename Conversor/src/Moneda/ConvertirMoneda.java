package Moneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {

    BolivarVenezolano bolivarVenezolano= new BolivarVenezolano();
    DolarEstadoUnidense dolarEstadoUnidense = new DolarEstadoUnidense();
    Euro euro = new Euro();
    LibraEsterlina libraEsterlina = new LibraEsterlina();
    YenJapones yenJapones = new YenJapones();
    WonSurcoreano wonSurcoreano = new WonSurcoreano();

    public void ConvertirBolivarVenezolano(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir ", "Bolívar Venezolano", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Bolívar Venezolano a Dólar EsadoUnidense", "De Bolívar Venezolano a Euro", "De Bolívar Venezolano a libra Esterlina", "De Bolívar Venezolano a Yen Japonés", "De Bolívar Venezolano a Won Surcoreano"}, "Seleccion")).toString();

        switch(opcion) {
            case "De Bolívar Venezolano a Dólar EsadoUnidense":
                bolivarVenezolano.ConvertirBolivarADolar(Minput);
                break;
            case "De Bolívar Venezolano a Euro":
                bolivarVenezolano.ConvertirBolivarAEuro(Minput);
                break;
            case  "De Bolívar Venezolano a libra Esterlina":
                bolivarVenezolano.ConvertirBolivarALibraEsterlina(Minput);
                break;
            case "De Bolívar Venezolano a Yen Japonés" :
                bolivarVenezolano.ConvertirBolivarAYenJapones(Minput);
                break;
            case "De Bolívar Venezolano a Won Surcoreano":
                bolivarVenezolano.ConvertirBolivarAWonsurcoreano(Minput);
                break;
        }
    }

    public void ConvertirDolarEsadoUnidense(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir ", "Dólar EstadoUnidense", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Dólar EstadoUnidense a Bolívar Venezolano", "De Dólar EstadoUnidense a Euro", "De Dólar EstadoUnidense a libra Esterlina", "De Dólar EstadoUnidense a Yen Japonés", "De Dólar EstadoUnidense a Won Surcoreano"}, "Seleccion")).toString();

        switch (opcion) {
            case "De Dólar EstadoUnidense a Bolívar Venezolano":
                dolarEstadoUnidense.ConvertirDolarABolivar(Minput);
                break;
            case "De Dólar EstadoUnidense a Euro":
                dolarEstadoUnidense.ConvertirDolarAEuro(Minput);
                break;
            case "De Dólar EstadoUnidense a libra Esterlina":
                dolarEstadoUnidense.ConvertirDolarALibraEterlina(Minput);
                break;
            case "De Dólar EstadoUnidense a Yen Japonés":
                dolarEstadoUnidense.ConvertirDolarAYenJapones(Minput);
                break;
            case "De Dólar EstadoUnidense a Won Surcoreano":
                dolarEstadoUnidense.ConvertirDolarAWonSurcoreano(Minput);
                break;
        }
    }

    public void ConvertirEuro(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir ", "Euro", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Euro a Bolívar Venezolano", "De Euro a Dólar EstadoUnidense", "De Euro a libra Esterlina", "De Euro a Yen Japonés", "De Euro a Won Surcoreano"}, "Seleccion")).toString();

        switch (opcion) {
            case "De Euro a Bolívar Venezolano":
                euro.ConvertirEuroABolivar(Minput);
                break;
            case "De Euro a Dólar EstadoUnidense":
                euro.ConvertirEuroADolar(Minput);
                break;
            case  "De Euro a libra Esterlina":
                euro.ConvertirEuroALibraEsterlina(Minput);
                break;
            case "De Euro a Yen Japonés" :
                euro.ConvertirEuroAYenJapones(Minput);
                break;
            case "De Euro a Won Surcoreano":
                euro.ConvertirEuroAWonsurcoreano(Minput);
                break;
        }
    }

    public void ConvertirLibraEsterlina(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir ", "libra Esterlina ", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De libra Esterlina a Bolívar Venezolano", "De libra Esterlina a Dólar EstadoUnidense", "De libra Esterlina a Euro", "De libra Esterlina a Yen Japonés", "De libra Esterlina a Won Surcoreano"}, "Seleccion")).toString();

        switch (opcion) {
            case "De libra Esterlina a Bolívar Venezolano":
                libraEsterlina.ConvertirLibraEsterlinaABolivar(Minput);
                break;
            case "De libra Esterlina a Dólar EstadoUnidense":
                libraEsterlina.ConvertirLibraEsterlinaADolar(Minput);
                break;
            case "De libra Esterlina a Euro":
                libraEsterlina.ConvertirLibraEsterlinaAEuro(Minput);
                break;
            case "De libra Esterlina a Yen Japonés":
                libraEsterlina.ConvertirLibraEsterlinaAYenJapones(Minput);
                break;
            case "De libra Esterlina a Won Surcoreano":
                libraEsterlina.ConvertirLibraEsterlinaAWonsurcoreano(Minput);
                break;
        }
    }

    public void ConvertirYenJapones(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir ", "Yen Japonés", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Yen Japonés a Bolívar Venezolano", "De Yen Japonés a Dólar EstadoUnidense", "De Yen Japonés a Euro", "De Yen Japonés a libra Esterlina", "De Yen Japonés a Won Surcoreano"}, "Seleccion")).toString();

        switch (opcion) {
            case "De Yen Japonés a Bolívar Venezolano":
                yenJapones.ConvertirYenJaponesABolivar(Minput);
                break;
            case "De Yen Japonés a Dólar EstadoUnidense":
                yenJapones.ConvertirYenJaponesADolar(Minput);
                break;
            case "De Yen Japonés a Euro":
                yenJapones.ConvertirYenJaponesAEuro(Minput);
                break;
            case "De Yen Japonés a libra Esterlina":
                yenJapones.ConvertirYenJaponesALibraEsterlina(Minput);
                break;
            case "De Yen Japonés a Won Surcoreano":
                yenJapones.ConvertirYeneJaponesAWonsurcoreano(Minput);
                break;
        }
    }

    public void ConvertirWonSurcoreano(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir ", "Won Surcoreano", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Won Surcoreano a Bolívar Venezolano", "De Won Surcoreano a Dólar EstadoUnidense", "De Won Surcoreano a Euro", "De Won Surcoreano a libra Esterlina", "De Won Surcoreano a Yen Japonés"}, "Seleccion")).toString();

        switch (opcion) {
            case "De Won Surcoreano a Bolívar Venezolano":
                wonSurcoreano.ConvertirWonsurcoreanoABolivar(Minput);
                break;
            case "De Won Surcoreano a Dólar EstadoUnidense":
                wonSurcoreano.ConvertirWonsurcoreanoADolar(Minput);
                break;
            case "De Won Surcoreano a Euro":
                wonSurcoreano.ConvertirWonsurcoreanoAEuro(Minput);
                break;
            case "De Won Surcoreano a libra Esterlina":
                wonSurcoreano.ConvertirWonsurcoreanoALibraEsterlina(Minput);
                break;
            case "De Won Surcoreano a Yen Japonés":
                wonSurcoreano.ConvertirWonsurcoreanoAYenJapones(Minput);
                break;
        }
    }
}
