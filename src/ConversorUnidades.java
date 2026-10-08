import javax.swing.JOptionPane;

public class ConversorUnidades {
    public static void main(String[] args) {
        System.out.println("1. km/h ----> m/s  \n2. m/s ----> km/h ");
        byte condicion = Byte.parseByte(JOptionPane.showInputDialog("1. km/h ----> m/s\n 2. m/s ----> km/h "));

        // Convertir de km/h a m/s
        if (condicion == 1) {
            double velocidadKmh = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresa la velocidad en km/h que deseas convertir:"));

            double resultado = velocidadKmh / 3.6;
            JOptionPane.showMessageDialog(null, "Los " + velocidadKmh + " km/h = " + resultado + " m/s");

        } else if (condicion == 2) {
            double velocidadMs = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Ingresa la velocidad en m/s que deseas convertir:"));

            double resultado = velocidadMs * 3.6;
            JOptionPane.showMessageDialog(null, "Los " + velocidadMs + " m/s = " + resultado + " km/h");

        } else {
            System.out.println("Valor no válido");
        }
    }
}
