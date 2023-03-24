package Principal;

import Moneda.FuncionMoneda;
import Temperatura.FuncionTemperatura;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        FuncionMoneda monedas = new FuncionMoneda();
        FuncionTemperatura temperaturas = new FuncionTemperatura();


        boolean flag = true;
        while (flag) {
            String opciones = (JOptionPane.showInputDialog(null, "seleccione una opcion de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        monedas.Convertir(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar una nueva conversion?");
                        if (JOptionPane.OK_OPTION == respuesta){
                            System.out.println("Seleciona opcion Afirmativa");
                        }else{
                            flag = false;
                            JOptionPane.showConfirmDialog(null, "¿Desea terminar el programa?");
                        }
                    }else{
                        JOptionPane.showConfirmDialog(null, "Valor invalido");
                    }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingrese la cantidad de temperatura que desea convertir: ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        temperaturas.Convertir(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar una nueva conversion?");
                        if (JOptionPane.OK_OPTION == respuesta){
                            System.out.println("Seleciona opcion Afirmativa");
                        }else{
                            flag = false;
                            JOptionPane.showConfirmDialog(null, "¿Desea terminar el programa?");
                        }
                    }else{
                        JOptionPane.showConfirmDialog(null, "Valor invalido");
                    }
                    break;
            }
        }
    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
