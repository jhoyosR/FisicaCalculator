package calculador;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculador calculador = new Calculador();

        JOptionPane.showMessageDialog(null,"En este Software vamos a calcular la aceleración de dos objetos que se encuentran unidos\npor medio de un cable conectado a una polea y la tensión de este. Uno de los objetos\nse encuentra sobre una mesa horizontal y el otro objeto está colgando de la polea.\nPresiona OK para empezar");
        calculador.setM1(Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor inserte el valor de la masa del objeto (en kg) que se encuentra colgando de la polea: (m1)")));
        calculador.setM2(Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor inserte el valor de la masa del objeto (en kg) que se encuentra sobre la mesa horizontal: (m2)")));
        calculador.setU(Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor inserte el valor del coeficiente de fricción")));

        JOptionPane.showMessageDialog(null,calculador.showResults());
    }
}
