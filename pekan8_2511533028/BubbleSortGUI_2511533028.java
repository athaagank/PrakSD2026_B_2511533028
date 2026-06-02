package pekan8_2511533028;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511533028 extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField inputField;
    private JButton inputButton;
    private JButton stepButton;
    private JButton resetButton;
    private JPanel panelArray;
    private JTextArea stepArea;

    private int[] array;
    private JLabel[] labelArray;

    private int i = 0;
    private int j = 0;
    private int stepCount = 1;
    private boolean sorting = false;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BubbleSortGUI_2511533028 frame = new BubbleSortGUI_2511533028();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public BubbleSortGUI_2511533028() {

        setTitle("Visualisasi Bubble Sort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout(10, 10));
        setContentPane(contentPane);

        JPanel topPanel = new JPanel(new FlowLayout());

        JLabel lblInput = new JLabel("Masukkan angka (pisahkan koma):");

        inputField = new JTextField(25);

        inputButton = new JButton("Tampilkan");

        topPanel.add(lblInput);
        topPanel.add(inputField);
        topPanel.add(inputButton);

        contentPane.add(topPanel, BorderLayout.NORTH);

        panelArray = new JPanel();
        panelArray.setLayout(new FlowLayout());

        contentPane.add(panelArray, BorderLayout.CENTER);

        stepArea = new JTextArea();
        stepArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(stepArea);

        scrollPane.setPreferredSize(new Dimension(300, 0));

        contentPane.add(scrollPane, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel();

        stepButton = new JButton("Sorting Selanjutnya");

        resetButton = new JButton("Reset");

        stepButton.setEnabled(false);

        bottomPanel.add(stepButton);
        bottomPanel.add(resetButton);

        contentPane.add(bottomPanel, BorderLayout.SOUTH);

        inputButton.addActionListener(e -> setArrayFromInput());

        stepButton.addActionListener(e -> nextStep());

        resetButton.addActionListener(e -> reset());
    }

    private void setArrayFromInput() {

        String text = inputField.getText().trim();

        if (text.isEmpty())
            return;

        String[] parts = text.split(",");

        array = new int[parts.length];

        try {

            for (int k = 0; k < parts.length; k++) {
                array[k] = Integer.parseInt(parts[k].trim());
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        i = 0;
        j = 0;
        stepCount = 1;
        sorting = true;

        stepButton.setEnabled(true);
        stepArea.setText("");

        panelArray.removeAll();

        labelArray = new JLabel[array.length];

        for (int k = 0; k < array.length; k++) {

            labelArray[k] = new JLabel(String.valueOf(array[k]));

            labelArray[k].setFont(new Font("Arial", Font.BOLD, 24));

            labelArray[k].setOpaque(true);

            labelArray[k].setBackground(Color.WHITE);

            labelArray[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));

            labelArray[k].setPreferredSize(new Dimension(60, 50));

            labelArray[k].setHorizontalAlignment(SwingConstants.CENTER);

            panelArray.add(labelArray[k]);
        }

        panelArray.revalidate();
        panelArray.repaint();
    }

    private void nextStep() {

        if (!sorting)
            return;

        resetColors();

        if (j < array.length - i - 1) {

            labelArray[j].setBackground(Color.YELLOW);
            labelArray[j + 1].setBackground(Color.YELLOW);

            int nilaiKiri = array[j];
            int nilaiKanan = array[j + 1];

            if (array[j] > array[j + 1]) {

                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;

                updateLabels();

                labelArray[j].setBackground(Color.RED);
                labelArray[j + 1].setBackground(Color.RED);

                stepArea.append(
                        "Langkah " + stepCount +
                        " : Tukar " +
                        nilaiKiri + " dengan " +
                        nilaiKanan + "\n");

            } else {

                stepArea.append(
                        "Langkah " + stepCount +
                        " : Tidak ada pertukaran (" +
                        nilaiKiri + " dan " +
                        nilaiKanan + ")\n");
            }

            j++;

        } else {

            labelArray[array.length - i - 1].setBackground(Color.GREEN);

            j = 0;
            i++;
        }

        stepCount++;

        if (i >= array.length - 1) {

            sorting = false;

            for (JLabel lbl : labelArray) {
                lbl.setBackground(Color.GREEN);
            }

            stepButton.setEnabled(false);

            stepArea.append("\n=== SORTING SELESAI ===\n");

            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels() {

        for (int k = 0; k < array.length; k++) {

            labelArray[k].setText(String.valueOf(array[k]));
        }
    }

    private void resetColors() {

        if (labelArray == null)
            return;

        for (JLabel lbl : labelArray) {

            if (!Color.GREEN.equals(lbl.getBackground())) {

                lbl.setBackground(Color.WHITE);
            }
        }
    }

    private void reset() {

        inputField.setText("");

        panelArray.removeAll();
        panelArray.revalidate();
        panelArray.repaint();

        stepArea.setText("");

        stepButton.setEnabled(false);

        array = null;
        labelArray = null;

        sorting = false;
        i = 0;
        j = 0;
        stepCount = 1;
    }
}