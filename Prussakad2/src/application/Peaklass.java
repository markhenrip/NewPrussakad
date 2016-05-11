package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javafx.animation.TranslateTransition;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Peaklass extends Application {
	static Text rahaTekst;
	static int raha;
	private Scene startStseen;
	private Scene continueStseen;
	private Scene crStseen;
	private Scene endStseen;
	static boolean m�ng_k�ib;
	private static String[] edetabel;
	private static Prussakas[] juss;
	private static String prevV�itja;
	@Override
	public void start(Stage p�hi) throws Exception {
		Group grupeering = new Group();
		Group grupeering2 = new Group();
		Group grupeering3 = new Group();
		Group grupeering4 = new Group();
		ToggleGroup nupudxd = new ToggleGroup();
		Image image = new Image("File:cr.png");
		ImageView nimi0 = new ImageView(image);
		ImageView nimi1 = new ImageView(image);
		ImageView nimi2 = new ImageView(image);
		ImageView nimi3 = new ImageView(image);
		ImageView nimi4 = new ImageView(image);
		ImageView nimi5 = new ImageView(image);
		ImageView nimi6 = new ImageView(image);
		ImageView nimi7 = new ImageView(image);
		ImageView nimi8 = new ImageView(image);
		ImageView nimi9 = new ImageView(image);
		Text prussakaNimi0 = new Text("");
		Text prussakaNimi1 = new Text("");
		Text prussakaNimi2 = new Text("");
		Text prussakaNimi3 = new Text("");
		Text prussakaNimi4 = new Text("");
		Text prussakaNimi5 = new Text("");
		Text prussakaNimi6 = new Text("");
		Text prussakaNimi7 = new Text("");
		Text prussakaNimi8 = new Text("");
		Text prussakaNimi9 = new Text("");
		Text endText = new Text("");
		Text prevText = new Text("");
		
		
		Button startNupp = new Button("Alusta uut");
		Button loadNupp = new Button("J�tka eelmist");
		Button panusta = new Button("Panusta");
		Button alusta = new Button("J�lgi");
		Button l�peta = new Button("J�tka");
		Button salvesta = new Button("Salvesta");
		Text continueText = new Text("");
		Text rahaTekst = new Text("Raha: 0");
		Text introTekst = new Text("Antud m�ngu eesm�rk on prussakate peale \n"
				+ " panustades saavutada  5000 eurot.");
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
		grupeering2.getChildren().addAll(prevText, salvesta, label1, textField, panusta, rahaTekst, nupp1, nupp2, nupp3, nupp4, nupp5, nupp6, nupp7, nupp8, nupp9, nupp0);
		grupeering3.getChildren().addAll(continueText, l�peta, alusta, nimi0, nimi1, nimi2, nimi3, nimi4, nimi5, nimi6, nimi7, nimi8, nimi9, prussakaNimi0, prussakaNimi1, prussakaNimi2, prussakaNimi3, prussakaNimi4, prussakaNimi5, prussakaNimi6, prussakaNimi7, prussakaNimi8, prussakaNimi9);
		grupeering4.getChildren().addAll(endText);
		startStseen = new Scene(grupeering, 400, 400, Color.AQUAMARINE);
		continueStseen = new Scene(grupeering2, 400, 400, Color.AQUAMARINE);
		crStseen = new Scene(grupeering3, 1200, 400, Color.AQUAMARINE);
		endStseen = new Scene(grupeering4, 400, 400, Color.AQUAMARINE);
		
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
		alusta.setLayoutX(600);
		alusta.setLayoutY(350);
		l�peta.setLayoutX(650);
		l�peta.setLayoutY(350);
		salvesta.setLayoutY(0);
		rahaTekst.setLayoutX(290);
		rahaTekst.setLayoutY(20);
		rahaTekst.setFill(Color.INDIANRED);
		rahaTekst.setScaleX(2);
		rahaTekst.setScaleY(2);
		endText.setLayoutX(150);
		endText.setLayoutY(200);
		endText.setScaleX(2);
		endText.setScaleY(2);
		endText.setFill(Color.INDIANRED);
		continueText.setLayoutX(100);
		continueText.setLayoutY(350);
		continueText.setScaleX(2);
		continueText.setScaleY(2);
		continueText.setFill(Color.INDIANRED);
		prevText.setLayoutX(100);
		prevText.setLayoutY(30);
		prevText.setFill(Color.INDIANRED);
		label1.setLayoutX(80);
		label1.setLayoutY(270);
		label1.setScaleX(1.5);
		label1.setScaleY(1.5);
		label1.setTextFill(Color.INDIANRED);
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
		
		ArrayList<RadioButton> temp_nupud = new ArrayList<RadioButton>();
		temp_nupud.add(nupp0);
		temp_nupud.add(nupp1);
		temp_nupud.add(nupp2);
		temp_nupud.add(nupp3);
		temp_nupud.add(nupp4);
		temp_nupud.add(nupp5);
		temp_nupud.add(nupp6);
		temp_nupud.add(nupp7);
		temp_nupud.add(nupp8);
		temp_nupud.add(nupp9);
		ArrayList<ImageView> temp_image = new ArrayList<ImageView>();
		temp_image.add(nimi0);
		temp_image.add(nimi1);
		temp_image.add(nimi2);
		temp_image.add(nimi3);
		temp_image.add(nimi4);
		temp_image.add(nimi5);
		temp_image.add(nimi6);
		temp_image.add(nimi7);
		temp_image.add(nimi8);
		temp_image.add(nimi9);
		ArrayList<Text> temp_text = new ArrayList<Text>();
		temp_text.add(prussakaNimi0);
		temp_text.add(prussakaNimi1);
		temp_text.add(prussakaNimi2);
		temp_text.add(prussakaNimi3);
		temp_text.add(prussakaNimi4);
		temp_text.add(prussakaNimi5);
		temp_text.add(prussakaNimi6);
		temp_text.add(prussakaNimi7);
		temp_text.add(prussakaNimi8);
		temp_text.add(prussakaNimi9);
		
		raha = 2000; //m�ngus kasutatav raha
		rahaTekst.setText("Raha: "+ raha);
		
		startNupp.setOnMouseClicked(event -> {
			Start.startGo(p�hi, continueStseen);
			juss = prussakateGen(temp_nupud, p�hi); // Saan prussakad ning nad pannakse RadioButtonite kohale
			V�istlus comp = new V�istlus(1); //loome v�istluse, kust prussakad osa v�tavad
			edetabel = comp.korralda_v�idus�it(juss); //siin toimub v�itja arvutamine
			System.out.println("V�itja on "+ edetabel[0]);
			
		});
		
		loadNupp.setOnMouseClicked(event -> {
			Start.startGo(p�hi, continueStseen);
			juss = prussakateGen(temp_nupud, p�hi); // Saan prussakad ning nad pannakse RadioButtonite kohale
			V�istlus comp = new V�istlus(1); //loome v�istluse, kust prussakad osa v�tavad
			edetabel = comp.korralda_v�idus�it(juss); //siin toimub v�itja arvutamine
			System.out.println("V�itja on "+ edetabel[0]);
			//TODO - addida k�ik load featured, raha seis, �raarvamise t�en�osus maybe?
		});
		
		salvesta.setOnMouseClicked(event -> {
			//TODO - lisada siia, mis property-da omistatakse
		});
		
		m�ng_k�ib = false;
		
		Text errorid = new Text("");
		errorid.setLayoutX(200);
		errorid.setLayoutY(350);
		grupeering2.getChildren().add(errorid);
		
		panusta.setOnMouseClicked(event -> {
			int panus;
			
			try{
				panus = Integer.parseInt(textField.getText());
				if(panus<=0 || panus > raha)
					throw new InvalidInputException();
				Start.startGo(p�hi, crStseen);
				String vastus = ((RadioButton)nupudxd.getSelectedToggle()).getText();
				if(V�it(vastus, edetabel[0])){
					raha = raha + (panus*5);
				}
				else{
					raha = raha - panus;
				}
				rahaTekst.setText("Raha: "+ raha);
				prevV�itja = edetabel[0];
				int j = 0;
				for (Prussakas elem: juss){
					temp_text.get(j).setText(elem.getNimi());
					temp_text.get(j).setLayoutY((j+1)*30);
					temp_image.get(j).setLayoutY(j*30);
					temp_image.get(j).setLayoutX(50);
					j++;
				}
				continueText.setText("Sa panustasid: "+vastus+" peale");
			}
			catch(NumberFormatException e){
				errorid.setText("Sisesta t�isarv");
			}
			catch(InvalidInputException e)
			{
				errorid.setText("Panusta oma raha piires");
			}
			catch(Exception e){
				errorid.setText("Miski on m�da");
			}
		});
		
		ArrayList<TranslateTransition> abiarray = new ArrayList<TranslateTransition>();
		alusta.setOnMouseClicked(event -> {
			int k = 0;
			for (Prussakas elem_k : juss){
				TranslateTransition animatsioon = liikumine(elem_k.getKiirus(), temp_image.get(k));
				abiarray.add(animatsioon);
				animatsioon.play();
				k++;
			}
		});
		
		l�peta.setOnMouseClicked(event -> {
			if (raha >= 5000){
				Start.startGo(p�hi, endStseen);
				endText.setText("M�ng l�bi, sa v�itsid.");
			}
			else if (raha <= 0){
				Start.startGo(p�hi, endStseen);
				endText.setText("M�ng l�bi, sa kaotasid.");
			}
			else{
				abiarray.forEach(x -> x.stop());
				abiarray.forEach(x -> x.jumpTo(Duration.millis(0)));
				
				
				Start.startGo(p�hi, continueStseen);
				errorid.setText("");
				juss = prussakateGen(temp_nupud, p�hi); // Saan prussakad ning nad pannakse RadioButtonite kohale
				V�istlus comp = new V�istlus(1); //loome v�istluse, kust prussakad osa v�tavad
				edetabel = comp.korralda_v�idus�it(juss); //siin toimub v�itja arvutamine
				System.out.println("V�itja on "+ edetabel[0]);
				prevText.setText("Eelmise ralli v�itis: "+prevV�itja);
			}
		});
	}
	
	private static Prussakas[] prussakateGen(ArrayList<RadioButton> arg0, Stage arg1){
		Prussakas [] juss = new Prussakas[10];
		for (int i = 0; i<10;i++){
			juss[i] = Prussakas.loo_prussakas(1); //loome 10 prussakat, kes osalevad v�istlusel(suvalised)
			arg0.get(i).setText(juss[i].getNimi());
			arg1.show();
			
		}
		return juss;
	}
	
	private static boolean V�it(String v�itja, String valik){
		if (valik.equals(v�itja)){
			return true;
		}
		else{
		return false;
		} 
	}
	
	private static TranslateTransition liikumine(double kiirus, ImageView prussakas){
		TranslateTransition translateTransition =
			    new TranslateTransition(Duration.millis(120000/kiirus), prussakas);
			  translateTransition.setFromX(50);
			  translateTransition.setToX(1050);
			  translateTransition.setCycleCount(1);
			  translateTransition.setAutoReverse(true);
		return translateTransition;
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}
