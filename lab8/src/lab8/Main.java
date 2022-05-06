package lab8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Button b1 = new Button("click");
		Button b2 = new Button("click");
		Button b3 = new Button("click");
//		Button b4 = new Button("click");
//		Button b5 = new Button("click");
//		Button b6 = new Button("click");
		//HBox h = new HBox();
		//VBox h = new VBox();
		//StackPane h = new StackPane();
		//FlowPane h = new FlowPane();
		GridPane h = new GridPane();
		//h.setSpacing(20); for HBox and VBox only
		//h.getChildren().addAll(b1,b2,b3);
		h.add(b1, 0, 0);
		h.add(b1, 0, 0);
		
//		h.getChildren().add(b1);
//		h.getChildren().add(b2);
//		h.getChildren().add(b3);
//		h.getChildren().add(b4);
//		h.getChildren().add(b5);
//		h.getChildren().add(b6);
		Scene sc = new Scene(h);
		stage.setScene(sc);
		stage.setHeight(500);
		stage.setWidth(500);
		stage.setTitle("JAVAFX APP");
		stage.show();
		
	}

}
