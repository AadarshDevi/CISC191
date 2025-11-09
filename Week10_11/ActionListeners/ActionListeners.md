# ActionListener
## Basic Info
- Author: Aadarsh Devi
- Submission Date: Nov 9, 2025
- Assignment: Week 10/11 Lab 1

## Code
#### HourlyWagesMain.java
```java
import javax.swing.*;

public class HourlyWagesMain {
    public static void main(String[] args) {
        HourlyWageUI hwUI = new HourlyWageUI("Hourly Wage", JFrame.EXIT_ON_CLOSE);
        hwUI.showGUI();
    }
}
```

#### CustomFrame.java
```java
import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    public static Dimension windowSize = new Dimension(518, 260);

    public CustomFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(windowSize);
        setPreferredSize(windowSize);
        setLocationRelativeTo(null);
    }


    public CustomFrame(String title, int jFrameDefaultCloseOperation) {
        setTitle(title);
        setDefaultCloseOperation(jFrameDefaultCloseOperation);
        setSize(windowSize);
        setPreferredSize(windowSize);
        setLocationRelativeTo(null);
    }

    public void showGUI() {
        setVisible(true);
    }

    public void hideGUI() {
        setVisible(false);
    }
}
```

#### HourlyWageUI.java
```java
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
```



## What to Submit
1. The flowchart of my thought process: [Draw.io file](action_listeners_flowchart.drawio)
2. Flowchart as an image: [Draw.io Image](action_listeners_flowchart_image.png)
3. What were your challenges in performing the lab: I did not have any challenges.
5. Code for the assignment:
   - [HourlyWagesMain.java](HourlyWagesMain.java)
   - [CustomFrame.java](CustomFrame.java)
   - [HourlyWageUI.java](HourlyWageUI.java)
7. Video explaining code: TODO: [Video Explanation](https://youtu.be/AwsYpd_07lM)
