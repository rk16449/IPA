package controllersPackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class DashboardController implements Initializable {

	@FXML
	private Button btn_applicationLayer;
	@FXML
	private Button btn_transportLayer;
	@FXML
	private Button btn_networkLayer;
	@FXML
	private Button btn_physicalLayer;
	@FXML
	private Button btn_startExam;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	protected void handleApplicationLayer(ActionEvent event) throws IOException {
		System.out.println("Handle application layer button");
		
		// Start a new test
		
		
	}
}
