package def;
import javax.swing.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        // Input data through a dialog box
        String Precision_num = JOptionPane.showInputDialog(null, "Enter the number of operands. This will affect the precision.", "Leibniz Series", JOptionPane.QUESTION_MESSAGE);

        // Data validation (null) before conversion
        while (Precision_num == null || Precision_num.trim().isEmpty()) {
            Precision_num = JOptionPane.showInputDialog(null, "Cannot be empty. Please enter an integer:");

            // Case where the window is closed
            if (Precision_num == null) {
                JOptionPane.showMessageDialog(null, "The operation was canceled.");
                System.exit(0); // End the program
            }

            // Case where only ENTER is pressed
            if (Precision_num.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter an integer.");
            }
        }

        try {
            double iPrecision_num = Double.parseDouble(Precision_num); // Convert from text string to double

            if (iPrecision_num > 1_000_000) {
                JOptionPane.showMessageDialog(null, "The number of operands is too large.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0); // End the program
            }

            double Pie = 0;

            for (int n = 0; n < iPrecision_num; n++) {
                Pie += Math.pow(-1, n) / ((2 * n) + 1);
            }
            System.out.println(Pie * 4);
            JOptionPane.showMessageDialog(null, Pie * 4, "The series approximation is", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
