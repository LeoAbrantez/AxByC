/*
VAR
    x, y, a, b, c: Real

INICIO
    Ler x
    Ler y
    Ler a
    Ler b
    Ler c

    SE a * x + b * y = c ENTAO
        Escreva "O ponto (", x, ",", y, ") pertence à reta."
    SENAO
        Escreva "O ponto (", x, ",", y, ") não pertence à reta."
    FIM SE
FIM

TESTE DE MESA

x	y	a	b	c	ax + by	Pertence à reta?
1	1	2	1	3	3	    Sim
2	-1	2	1	3	3	    Sim
0	3	2	1	3	3	    Sim
1	2	2	1	3	4	    Não
 */

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double x, y, a, b, c;

        // Entrada de dados
        String sX = JOptionPane.showInputDialog(null, "Digite o valor de x:");
        x = Double.parseDouble(sX);

        String sY = JOptionPane.showInputDialog(null, "Digite o valor de y:");
        y = Double.parseDouble(sY);

        String sA = JOptionPane.showInputDialog(null, "Digite o coeficiente a:");
        a = Double.parseDouble(sA);

        String sB = JOptionPane.showInputDialog(null, "Digite o coeficiente b:");
        b = Double.parseDouble(sB);

        String sC = JOptionPane.showInputDialog(null, "Digite o coeficiente c:");
        c = Double.parseDouble(sC);

        // Verificação
        if (a * x + b * y == c) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + "," + y + ") pertence à reta.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + "," + y + ") não pertence à reta.");
        }
    }
}