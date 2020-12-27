package javacodejunkie;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class MainWindow {

	
	private Stage stage;
	private Scene scene;
	private BorderPane borderPane;
	private HBox hbox;
	
	private Button btnPlay;
	private Button btnPause;
	
	private String MEDIA_URL = "";
	
	private Media media;
	private MediaPlayer mediaPlayer;
	private MediaView mediaView;
	
	public MainWindow() {
		initialize();
	}
	
	private void initialize() {
		stage = new Stage();
		stage.setTitle("Java Code Junkie - MediaPlayer Demo");
		borderPane = new BorderPane();
		
		media = new Media(MEDIA_URL);
		mediaPlayer =new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.setOnReady(() -> stage.sizeToScene());
		mediaView = new MediaView(mediaPlayer);
		
		borderPane.setCenter(mediaView);
		
		btnPlay = new Button(">");
		btnPause = new Button("||");
		
				
		hbox = new HBox(10);
		hbox.getChildren().addAll(btnPlay, btnPause);
		hbox.setPadding(new Insets(10));
		
		scene = new Scene(borderPane);
		stage.setScene(scene);
		stage.show();
	}
}
