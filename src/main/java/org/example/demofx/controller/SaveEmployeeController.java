package org.example.demofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.demofx.dto.EmployeeDto;
import org.example.demofx.service.EmployeeService;
import org.example.demofx.service.impl.EmployeeServiceImpl;

public class SaveEmployeeController {
    @FXML
    private TextField txtaddress;

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtposition;

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String address = txtaddress.getText();
        String position = txtposition.getText();

        EmployeeService service =  new EmployeeServiceImpl();
        service.saveEmployee(new EmployeeDto(id, name, address, position));

    }
}
