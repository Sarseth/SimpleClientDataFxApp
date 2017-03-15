package pl.marapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pl.marapp.Main;
import pl.marapp.model.person.Person;

public class PersonOverviewController {

	private TableView<Person> personTableView;

	private TableColumn<Person, String> firstNameColumn;

	private TableColumn<Person, String> surenameColumn;

	private Main mainApp;

	@FXML
	private void initialize() {
		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        surenameColumn.setCellValueFactory(cellData -> cellData.getValue().surnameProperty());
	}

}
