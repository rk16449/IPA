package controllersPackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/* Import javafx, java, mainPackage */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	@FXML
	private Text actiontarget;
	@FXML
	private PasswordField passwordField;
	@FXML
	private TextField userField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) throws IOException {

		// Go to dashboard screen where the questions etc are
		
		Parent parent = FXMLLoader.load(getClass().getResource("/fxmlPackage/dashboardPage.fxml"));
		Scene scene = new Scene(parent);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(scene);
		appStage.setTitle("IPA Program");
		appStage.setWidth(944);
		appStage.setHeight(600);
		appStage.show();
		
	}

}
