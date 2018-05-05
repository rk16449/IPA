package application;
	
import java.util.Locale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static void main(String[] args) {
    	Locale.setDefault(Locale.UK);
        Application.launch(Main.class, args);
    }
    
    @Override
    public void start(Stage appStage) throws Exception {
    	Parent root = FXMLLoader.load(getClass().getResource("/fxmlPackage/loginPage.fxml"));
        appStage.setTitle("IPA Quiz Login");
        appStage.setScene(new Scene(root, 944, 600));
        appStage.setResizable(false);
		appStage.show();
    }
}
