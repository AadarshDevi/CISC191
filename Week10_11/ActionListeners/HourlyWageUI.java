
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class HourlyWageUI extends CustomFrame {

    public HourlyWageUI(String title, int disposeOnClose) {
        super(title, disposeOnClose);

        JPanel panel = new JPanel();
        panel.setSize(CustomFrame.windowSize);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbl = new GridBagConstraints();
        gbl.insets = new Insets(10,10,10,10);

        JLabel hourlyWageLabel = new JLabel("Hourly Wage:");
        gbl.gridx = 0;
        gbl.gridy = 0;
        panel.add(hourlyWageLabel, gbl);

        JFormattedTextField hourlyWageTextField = getFormatTextField();
        gbl.gridx = 1;
        gbl.gridy = 0;
        panel.add(hourlyWageTextField, gbl);

        JLabel hoursPerWeekLabel = new JLabel("Hours Per Week:");
        gbl.gridx = 0;
        gbl.gridy = 1;
        panel.add(hoursPerWeekLabel, gbl);

        JFormattedTextField hoursPerWeekTextField = getFormatTextField();
        gbl.gridx = 1;
        gbl.gridy = 1;
        panel.add(hoursPerWeekTextField, gbl);

        JButton calculateYearlySalaryButton = new JButton("Calculate");
        gbl.gridx = 0;
        gbl.gridy = 2;
        panel.add(calculateYearlySalaryButton, gbl);

        JLabel yearlySalaryTitleLabel = new JLabel("Yearly Salary:");
        gbl.gridx = 0;
        gbl.gridy = 3;
        panel.add(yearlySalaryTitleLabel, gbl);

        JLabel yearlySalaryLabel = new JLabel();
        gbl.gridx = 1;
        gbl.gridy = 3;
        panel.add(yearlySalaryLabel, gbl);


        calculateYearlySalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double hourlyWage = Double.parseDouble(hourlyWageTextField.getText());
                System.out.println("hw: "+hourlyWage);

                double hoursPerWeek = Double.parseDouble(hoursPerWeekTextField.getText());
                System.out.println("hpw: "+hoursPerWeek);

                double weeklyWage = hourlyWage * hoursPerWeek;
                System.out.println("ww: "+weeklyWage);

                double monthlyWage = weeklyWage * 4;
                System.out.println("mw: "+monthlyWage);

                double yearlyWage = monthlyWage * 12;
                System.out.println("yw: "+yearlyWage);

                yearlySalaryLabel.setText(String.format("$%,.2f", yearlyWage));
            }
        });

        add(panel);
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
