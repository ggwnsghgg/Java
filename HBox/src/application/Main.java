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
//		HBox hbox = new HBox();						//Hbox �����̳� ����
//		hbox.setPadding(new Insets(10));				//���� ���� ����
//		hbox.setSpacing(10);								//��Ʈ�� ���� ���� ���� ����
//		
//		TextField textField = new TextField();			//TextField ��Ʈ�� ����
//		textField.setPrefWidth(200);						//TextField�� �� ����
//		
//		Button button = new Button();						//Button ��Ʈ�� ����
//		button.setText("Ȯ��");								//Button ���� ����
//		
//		ObservableList list = hbox.getChildren();		//HBox�� OBservableList ���
//		list.add(textField);										//TextField ��Ʈ�� ��ġ
//		list.add(button);										//Button�� ��Ʈ�� ��ġ
//		
//		Scene scene = new Scene(hbox);				//��� ����z
//	
//		primaryStage.setTitle("AppMain");					//������ â ���� ����
//		primaryStage.setScene(scene);					//������ â�� ��� ����
//		primaryStage.show();								//������ â �����ֱ�
//		
//	}
//	public static void main(String[] args) {
//		launch(args);
//	}
}
