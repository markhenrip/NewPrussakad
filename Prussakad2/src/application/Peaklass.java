package application;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
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
		ToggleGroup nupudxd = new ToggleGroup();
		
		Button startNupp = new Button("Start New");
		Button loadNupp = new Button("Load");
		Button panusta = new Button("Panusta");
		Text rahaTekst = new Text("Raha: 0");
		Text introTekst = new Text("Antud m�ngu eesm�rk on prussakate peale \n"
				+ " panustades saavutada 5000 eurot.");
		RadioButton  nupp1 = new RadioButton("");
		RadioButton  nupp2 = new RadioButton("");
		RadioButton  nupp3 = new RadioButton("");
		RadioButton  nupp4 = new RadioButton("");
		RadioButton  nupp5 = new RadioButton("");
		RadioButton  nupp6 = new RadioButton("");
		RadioButton  nupp7 = new RadioButton("");
		RadioButton  nupp8 = new RadioButton("");
		RadioButton  nupp9 = new RadioButton("");
		RadioButton  nupp0 = new RadioButton("");
		Label label1 = new Label("Panus:");
		TextField textField = new TextField ();
		
		
		grupeering.getChildren().addAll(startNupp, loadNupp, introTekst);
		grupeering2.getChildren().addAll(label1, textField, panusta, rahaTekst, nupp1, nupp2, nupp3, nupp4, nupp5, nupp6, nupp7, nupp8, nupp9, nupp0);
		startStseen = new Scene(grupeering, 400, 400, Color.BLUE);
		continueStseen = new Scene(grupeering2, 400, 400, Color.BLUE);
		
		introTekst.setLayoutX(100);
		introTekst.setLayoutY(80);
		introTekst.setScaleX(1.5);
		introTekst.setScaleY(1.5);
		startNupp.setLayoutX(170);
		startNupp.setLayoutY(180);
		loadNupp.setLayoutX(170);
		loadNupp.setLayoutY(210);
		panusta.setLayoutX(170);
		panusta.setLayoutY(300);
		rahaTekst.setLayoutX(290);
		rahaTekst.setLayoutY(20);
		rahaTekst.setFill(Color.RED);
		rahaTekst.setScaleX(2);
		rahaTekst.setScaleY(2);
		label1.setLayoutX(80);
		label1.setLayoutY(270);
		label1.setScaleX(1.5);
		label1.setScaleY(1.5);
		label1.setTextFill(Color.RED);
		textField.setLayoutX(130);
		textField.setLayoutY(265);
		nupp0.setLayoutX(60);
		nupp0.setLayoutY(70);
		nupp0.setToggleGroup(nupudxd);
		nupp1.setLayoutX(60);
		nupp1.setLayoutY(100);
		nupp1.setToggleGroup(nupudxd);
		nupp2.setLayoutX(60);
		nupp2.setLayoutY(130);
		nupp2.setToggleGroup(nupudxd);
		nupp3.setLayoutX(60);
		nupp3.setLayoutY(160);
		nupp3.setToggleGroup(nupudxd);
		nupp4.setLayoutX(60);
		nupp4.setLayoutY(190);
		nupp4.setToggleGroup(nupudxd);
		nupp5.setLayoutX(210);
		nupp5.setLayoutY(70);
		nupp5.setToggleGroup(nupudxd);
		nupp6.setLayoutX(210);
		nupp6.setLayoutY(100);
		nupp6.setToggleGroup(nupudxd);
		nupp7.setLayoutX(210);
		nupp7.setLayoutY(130);
		nupp7.setToggleGroup(nupudxd);
		nupp8.setLayoutX(210);
		nupp8.setLayoutY(160);
		nupp8.setToggleGroup(nupudxd);
		nupp9.setLayoutX(210);
		nupp9.setLayoutY(190);
		nupp9.setToggleGroup(nupudxd);
		
		p�hi.setResizable(false);
		p�hi.setScene(startStseen);
		p�hi.show();
		
		startNupp.setOnMouseClicked(event -> {
			Start.startGo(p�hi, continueStseen);
		});
		
		panusta.setOnMouseClicked(event -> {
			System.out.println(textField.getText());
		});
//		raha = 100;
//		rahaTekst.setText("Raha: "+ raha);
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}
