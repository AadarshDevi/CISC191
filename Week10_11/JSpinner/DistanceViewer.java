package week_10_11.lab3;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DistanceViewer extends CustomFrame implements ChangeListener{

    private final JSpinner distanceInMilesSpinner;
    private final JLabel distanceInKilometersLabel;

    public DistanceViewer(String title, int jFrameDefaultCloseOperation) {
        super(title, jFrameDefaultCloseOperation);

        JPanel layoutPanel = new JPanel();
        layoutPanel.setSize(week_10_11.lab2.CustomFrame.WINDOW_SIZE);
        layoutPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);

        JLabel distanceInMilesLabel = new JLabel("Distance (Miles):");
        gbc.gridx = 0;
        gbc.gridy = 0;
        layoutPanel.add(distanceInMilesLabel, gbc);

        distanceInMilesSpinner = getFormattedSpinner();
        gbc.gridx = 1;
        gbc.gridy = 0;
        layoutPanel.add(distanceInMilesSpinner, gbc);

        JButton convertButton = new JButton("Convert");
        gbc.gridx = 0;
        gbc.gridy = 1;
        layoutPanel.add(convertButton, gbc);

        JLabel distanceInKilometersTextLabel = new JLabel("Distance (km):");
        gbc.gridx = 0;
        gbc.gridy = 2;
        layoutPanel.add(distanceInKilometersTextLabel, gbc);

        distanceInKilometersLabel = new JLabel();
        gbc.gridx = 1;
        gbc.gridy = 2;
        layoutPanel.add(distanceInKilometersLabel, gbc);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertValue();
            }
        });
        add(layoutPanel);
    }

    private void convertValue() {
        System.out.println(distanceInMilesSpinner.getValue().toString());
        double miles = Double.parseDouble(distanceInMilesSpinner.getValue().toString());
        System.out.println(miles);

        double kilometers = miles * 1.60934;
        distanceInKilometersLabel.setText(String.format("%,.2f",kilometers));
    }

    private JSpinner getFormattedSpinner() {

        double minVal = 0;
        // max val = Double.MAX_VALUE
        double value = 0.0f;
        double stepSize = 1;

        Dimension dimension = new Dimension(300, 25);
        SpinnerModel sm = new SpinnerNumberModel(value, minVal, Double.MAX_VALUE, stepSize);

        JSpinner spinner = new JSpinner(sm);

        JSpinner.NumberEditor jsne = (JSpinner.NumberEditor) spinner.getEditor();
        DecimalFormat df = jsne.getFormat();
        df.setMinimumFractionDigits(3);

        spinner.setSize(dimension);
        spinner.setPreferredSize(dimension);

        spinner.addChangeListener(this);

        return spinner;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        convertValue();
    }
}
