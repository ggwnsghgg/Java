package application;


import java.net.URL;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

	private Parent FXMLLoader(URL resource) {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		launch(args);
	}
	
	
	
//	@Override
//	public void start(Stage primaryStage) {
//		HBox hbox = new HBox();						//Hbox 컨테이너 새성
//		hbox.setPadding(new Insets(10));				//안쪽 여백 설정
//		hbox.setSpacing(10);								//컨트롤 간의 수평 간격 설정
//		
//		TextField textField = new TextField();			//TextField 컨트롤 생성
//		textField.setPrefWidth(200);						//TextField의 폭 설정
//		
//		Button button = new Button();						//Button 컨트롤 생성
//		button.setText("확인");								//Button 글자 생성
//		
//		ObservableList list = hbox.getChildren();		//HBox의 OBservableList 얻기
//		list.add(textField);										//TextField 컨트롤 배치
//		list.add(button);										//Button의 컨트롤 배치
//		
//		Scene scene = new Scene(hbox);				//장면 생성z
//	
//		primaryStage.setTitle("AppMain");					//윈도우 창 제목 설정
//		primaryStage.setScene(scene);					//윈도우 창에 장면 설정
//		primaryStage.show();								//윈도우 창 보여주기
//		
//	}
//	public static void main(String[] args) {
//		launch(args);
//	}
}
