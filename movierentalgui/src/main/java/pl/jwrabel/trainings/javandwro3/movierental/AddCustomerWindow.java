package pl.jwrabel.trainings.javandwro3.movierental;

import javax.swing.*;

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


    }

    public static void main(String[] args) {
    new AddCustomerWindow();
    }
}
