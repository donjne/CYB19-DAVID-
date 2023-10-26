

import javax.swing.JOptionPane;

public class CYB19 {
    public static void main(String[] args) {
        float z, z1, c = 0.0f;
        System.out.println("S/N \tNumbers \tsquare \tcube \n");
        for (int k = 1; k <= 9; k++) {
            c = Float.parseFloat(JOptionPane.showInputDialog("Enter a number", "0"));
            z = square(c);
            z1 = cube(c);
            System.out.println(k + "\t" + c + "\t" + square(c) + "\t" + z1);
        }
    }

    static float square(float x) {
        return x * x;
    }

    static float cube(float x) {
        return x * x * x;
   }
}
