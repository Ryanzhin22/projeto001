import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args){


        String teste1 = (JOptionPane.showInputDialog(" + - Soma \n - - Subtração \n * - Multiplicação \n / - Divisão \n"));

        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if (teste1 == "+"){
            float total1 = valor1 + valor2;
            JOptionPane.showMessageDialog(null, "A soma é: " + total1, "teste", JOptionPane.INFORMATION_MESSAGE);
        }
        if (teste1 == "-"){
            float total2 = valor1 - valor2;
            JOptionPane.showMessageDialog(null, "A subtração é: " +total2, "teste", JOptionPane.INFORMATION_MESSAGE);
        }
        if (teste1 == "*"){
            float total3 = valor1 * valor2;
            JOptionPane.showMessageDialog(null, "A multiplicação é: " + total3, "teste", JOptionPane.INFORMATION_MESSAGE);
        }
        if (teste1 == "/"){
            float total4 = valor1 / valor2;
            JOptionPane.showMessageDialog(null, "A divisão é: " + total4, "teste", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
