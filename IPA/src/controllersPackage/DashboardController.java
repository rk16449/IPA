package controllersPackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
		
		// Start a new test, pass application layer as the category
		
		Parent parent = FXMLLoader.load(getClass().getResource("/fxmlPackage/stateQuestion.fxml"));
		Scene scene = new Scene(parent);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(scene);
		appStage.setTitle("IPA Program");
		appStage.setWidth(944);
		appStage.setHeight(600);
		appStage.show();
	}
}
