package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Peaklass extends Application {
	static Text rahaTekst;
	static int raha;
	private Scene startStseen;
	private Scene continueStseen;
	@Override
	public void start(Stage p�hi) throws Exception {
		Group grupeering = new Group();
		Group grupeering2 = new Group();
		
		Button startNupp = new Button("Start New");
		Button loadNupp = new Button("Load");
		Button temp = new Button("Temp");
		Text rahaTekst = new Text("Raha: 0");
		
		grupeering.getChildren().addAll(startNupp, loadNupp);
		grupeering2.getChildren().addAll(temp, rahaTekst);
		startStseen = new Scene(grupeering, 400, 400, Color.BLUE);
		continueStseen = new Scene(grupeering2, 400, 400, Color.BLUE);
		
		startNupp.setLayoutX(170);
		startNupp.setLayoutY(180);
		loadNupp.setLayoutX(170);
		loadNupp.setLayoutY(210);
		rahaTekst.setLayoutX(290);
		rahaTekst.setLayoutY(20);
		rahaTekst.setFill(Color.RED);
		rahaTekst.setScaleX(2);
		rahaTekst.setScaleY(2);
		
		p�hi.setResizable(false);
		p�hi.setScene(startStseen);
		p�hi.show();
		
		startNupp.setOnMouseClicked(event -> {
			Start.startGo(p�hi, continueStseen);
		});
//		raha = 100;
//		rahaTekst.setText("Raha: "+ raha);
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}
