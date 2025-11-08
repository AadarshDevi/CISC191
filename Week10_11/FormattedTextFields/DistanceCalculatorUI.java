package week_10_11.lab2;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class DistanceCalculatorUI extends CustomFrame {
    public DistanceCalculatorUI(String title, int defaultCloseOperation) {
        super(title, defaultCloseOperation);

        JPanel layoutPanel = new JPanel();
        layoutPanel.setSize(CustomFrame.WINDOW_SIZE);
        layoutPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel distanceInMilesLabel = new JLabel("Distance (Miles):");
        gbc.gridx = 0;
        gbc.gridy = 0;
        layoutPanel.add(distanceInMilesLabel, gbc);

        JFormattedTextField distanceInMilesTextField = getFormatTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        layoutPanel.add(distanceInMilesTextField, gbc);

        JButton convertButton = new JButton("Convert");
        gbc.gridx = 0;
        gbc.gridy = 1;
        layoutPanel.add(convertButton, gbc);

        JLabel distanceInKilometersTitleLabel = new JLabel("km:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        layoutPanel.add(distanceInKilometersTitleLabel, gbc);

        JLabel distanceInKilometersLabel = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 2;
        layoutPanel.add(distanceInKilometersLabel, gbc);

        JLabel distanceInMetersTitleLabel = new JLabel("m:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        layoutPanel.add(distanceInMetersTitleLabel, gbc);

        JLabel distanceInMetersLabel = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 3;
        layoutPanel.add(distanceInMetersLabel, gbc);


        JLabel distanceInFeetTitleLabel = new JLabel("ft:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        layoutPanel.add(distanceInFeetTitleLabel, gbc);

        JLabel distanceInFeetLabel = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 4;
        layoutPanel.add(distanceInFeetLabel, gbc);


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double miles = Double.parseDouble(distanceInMilesTextField.getText());
                double kilometers = miles * 1.60934;
                double metres = kilometers * 1000;
                double feet = miles * 5280;

                distanceInKilometersLabel.setText(getFormattedValue(kilometers));
                distanceInMetersLabel.setText(getFormattedValue(metres));
                distanceInFeetLabel.setText(getFormattedValue(feet));

            }
        });
        add(layoutPanel);
    }

    private String getFormattedValue(double distance) {
        return String.format("%,.3f", distance);
    }

    /**
     * Creates a TextField that takes in only numbers as input. It will display decimal
     * numbers because it is configured for it.
     *
     * @return a JFormattedTextField with a decimal input format.
     * @see JFormattedTextField
     */
    public JFormattedTextField getFormatTextField() {

        // Creates a formatter that formats the input into decimals.
        NumberFormatter nf = new NumberFormatter(new DecimalFormat("#.0##"));

        // the format will not be able to be invalid
        nf.setAllowsInvalid(false);

        // set the format to the JFormattedTextField to be able to use only this format
        JFormattedTextField jft = new JFormattedTextField(nf);

        // set the dimension of the JFormattedTextField
        Dimension dimension = new Dimension(300, 25);
        jft.setSize(dimension);
        jft.setPreferredSize(dimension);

        // setting the TextField to be editable and will have a max number of columns
        jft.setEditable(true);
        jft.setColumns(20);

        // return object
        return jft;
    }
}
