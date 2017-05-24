package pl.jwrabel.trainings.javandwro3.movierental;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by RENT on 2017-05-24.
 */
public class AddCustomerWindow extends JFrame {
    public AddCustomerWindow() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLayout(null);

        JLabel name = new JLabel("Imię");
        name.setSize(300, 30);
        name.setLocation(10, 10);
        add(name);

        JTextField txtName = new JTextField();
        txtName.setSize(200, 30);
        txtName.setLocation(80, 10);
        add(txtName);

        JLabel surname = new JLabel("Nazwisko");
        surname.setSize(300, 30);
        surname.setLocation(10, 50);
        add(surname);

        JTextField txtSurname = new JTextField();
        txtSurname.setSize(200, 30);
        txtSurname.setLocation(80, 50);
        add(txtSurname);

        JLabel pesel = new JLabel("Pesel");
        pesel.setSize(300, 30);
        pesel.setLocation(10, 90);
        add(pesel);

        JTextField txtPesel = new JTextField();
        txtPesel.setSize(200, 30);
        txtPesel.setLocation(80, 90);
        add(txtPesel);

        JLabel city = new JLabel("Miasto");
        city.setSize(300, 30);
        city.setLocation(10, 130);
        add(city);

        JTextField txtCity = new JTextField();
        txtCity.setSize(200, 30);
        txtCity.setLocation(80, 130);
        add(txtCity);

        JButton addCustomerButton = new JButton("Dodaj klienta");
        addCustomerButton.setSize(150, 40);
        addCustomerButton.setLocation(80, 180);
        add(addCustomerButton);

        JTextField message = new JTextField();
        message.setSize(350, 300);
        message.setLocation(10, 250);
        add(message);

        addCustomerButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = txtName.getText();

            }

    });}

    public static void main(String[] args) {
    new AddCustomerWindow();
    }
}
