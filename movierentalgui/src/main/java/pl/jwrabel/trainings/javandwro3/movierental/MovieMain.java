package pl.jwrabel.trainings.javandwro3.movierental;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * Created by RENT on 2017-05-24.
 */
public class MovieMain extends JFrame {
    private JList<Customer> customersJList;
    private JList<Movie> movieJList;
    private JList<Rent> rentJList;
    public   MovieRental movieRental;

    public MovieMain() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1240, 600);
        setLayout(null);

        setVariables();

        customersJList.setSize(400, 500);
        customersJList.setLocation(0, 0);
        add(customersJList);

        movieJList.setSize(400, 500);
        movieJList.setLocation(410, 0);
        add(movieJList);

        rentJList.setSize(400, 500);
        rentJList.setLocation(820, 0);
        add(rentJList);

        JTextField serchWindow = new JTextField();
        serchWindow.setSize(200, 30);
        serchWindow.setLocation(10, 510);
        add(serchWindow);

        JButton btnShow = new JButton("Szukaj");
        btnShow.setSize(100, 30);
        btnShow.setLocation(220, 510);
        add(btnShow);

        //
//        updateCarsListData();
//
//        JButton btnShow = new JButton("Pokaż");
//        btnShow.setSize(200, 50);
//        btnShow.setLocation(0, 350);
//        add(btnShow);
//
//        JLabel lblBrand = new JLabel("Brand");
//        lblBrand.setSize(200, 50);
//        lblBrand.setLocation(300, 0);
//        add(lblBrand);
//
//        JTextField txtBrand = new JTextField();
//        txtBrand.setSize(200, 50);
//        txtBrand.setLocation(300, 50);
//        add(txtBrand);
//
//        JLabel lblModel = new JLabel("Model");
//        lblModel.setSize(200, 50);
//        lblModel.setLocation(300, 100);
//        add(lblModel);
//
//        JTextField txtModel = new JTextField();
//        txtModel.setSize(200, 50);
//        txtModel.setLocation(300, 150);
//        add(txtModel);
//
//        JLabel lblYear = new JLabel("Manufacture year");
//        lblYear.setSize(200, 50);
//        lblYear.setLocation(300, 200);
//        add(lblYear);
//
//        JTextField txtYear = new JTextField();
//        txtYear.setSize(200, 50);
//        txtYear.setLocation(300, 250);
//        add(txtYear);
//
//        JLabel lblPower = new JLabel("Power");
//        lblPower.setSize(200, 50);
//        lblPower.setLocation(300, 300);
//        add(lblPower);
//
//        JTextField txtPower = new JTextField();
//        txtPower.setSize(200, 50);
//        txtPower.setLocation(300, 350);
//        add(txtPower);
//
//        JButton btnCreateCar = new JButton("Stwórz nowy");
//        btnCreateCar.setSize(200, 50);
//        btnCreateCar.setLocation(400, 400);
//        add(btnCreateCar);
//
//        JButton btnSaveChanges = new JButton("Zapisz zmiany");
//        btnSaveChanges.setSize(200, 50);
//        btnSaveChanges.setLocation(400, 500);
//        add(btnSaveChanges);
//
//        JButton btnSaveToFile = new JButton("Zapisz do pliku");
//        btnSaveToFile.setSize(200, 50);
//        btnSaveToFile.setLocation(0, 400);
//        add(btnSaveToFile);
//
//        JButton btnReadFromFile = new JButton("Wczytaj z pliku");
//        btnReadFromFile.setSize(200, 50);
//        btnReadFromFile.setLocation(0, 450);
//        add(btnReadFromFile);
//
//        JButton btnDeleteCar = new JButton("Usuń samochód");
//        btnDeleteCar.setSize(200, 50);
//        btnDeleteCar.setLocation(0, 500);
//        add(btnDeleteCar);
//
//        btnDeleteCar.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Car selectedCar = carsJList.getSelectedValue();
//                carRepository.getCars().remove(selectedCar);
//                updateCarsListData();
//            }
        }

    public static void main(String[] args) {

    new MovieMain();

    }

    public void setVariables (){
        movieRental = new MovieRental();
        List <Customer> customerList = movieRental.getCustomers();
        Customer [] customersArray = customerList.toArray(new Customer[customerList.size()]); //!!!! trzeba jej podać listę

        List<Movie> movieList = movieRental.getMovies();
        Movie [] movieArray = movieList.toArray(new Movie[movieList.size()]);

        List<Rent> rentList = movieRental.getRents();
        Rent [] rentArray = rentList.toArray(new Rent[rentList.size()]);

        customersJList  = new JList<>();
        customersJList.setListData(customersArray);

        movieJList = new JList<>();
        movieJList.setListData(movieArray);

        rentJList = new JList<>();
        rentJList.setListData(rentArray);
    }

}
