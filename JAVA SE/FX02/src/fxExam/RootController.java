package fxExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML private TableData info;
	@FXML private ListView<String> L_View;
	@FXML private TableView<TableData> T_View;
	@FXML private BarChart B_chart;
	@FXML private LineChart L_chart;
	@FXML private ToggleGroup chart;
	@FXML private RadioButton radStick;
	@FXML private RadioButton radLine;
	@FXML private Button btn_NW;
	
	List L = new ArrayList();
	List T = new ArrayList();
	String filePath = null;
	Scanner sc;
	int i = 0;
	String key;
			
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	Map<String, Object> M = new HashMap<String, Object>();
	Map<String, String> map_Path = new HashMap<String, String>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 표시되는 차트 바꾸기
		chart.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				if (radLine.isSelected()) {
					L_chart.setVisible(true);
					B_chart.setVisible(false);
				} else if (radStick.isSelected()) {
					L_chart.setVisible(false);
					B_chart.setVisible(true);
				}
			}
		});
		
		// ListView에 따른 TableView표현
		L_View.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// ListView에서 선택한 학생 점수 목록 가져오기
//				L_View.getSelectionModel().getSelectedItems() // 선택한 값 가져오기
				key = L_View.getSelectionModel().getSelectedItem();
				File file = new File("D:\\AI_Class\\J2SE_File\\FX02/" + key + ".txt");
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List S = new ArrayList();
				
				String a = null;
				int b = 0;
				while (sc.hasNext()) {
					a = sc.next();
					b = sc.nextInt();
					
					S.add(new TableData(a, b));
					M.put(a, b);
				}
				T = (List) M.get(key);
				ObservableList obList = FXCollections.observableArrayList(T);
				T_View.setItems(obList);
//				ModifyController md = new ModifyController();
//				md.setStu_ID(key);
				
				
				
			}
		});
		

	}

	private Stage pri;
	public void setPrimaryStage(Stage pri) {
		this.pri = pri;
	}
	
	public void handleOpen(ActionEvent e) throws IOException {

		FileChooser fileChooser = new FileChooser();		// 파일 읽기
		fileChooser.getExtensionFilters().add(new ExtensionFilter("Text Files", "*.txt"));
		File fileSelect = fileChooser.showOpenDialog(pri);
		String fName = fileSelect.getName();
		sc = new Scanner(fileSelect);
		filePath = fileSelect.getPath();
		
		int splitN = fName.indexOf(".");
		String re = fName.substring(0, splitN); // 원하는 위치 찾아서 뒷부분 제거

		List B_c = new ArrayList();
		List L_c = new ArrayList();
		List T_L = new ArrayList();
		
		String a = null;
		int b = 0;
		if (!L.contains(re)) {
			while (sc.hasNext()) {		// 리스트에 추가
				a = sc.next();
				b = sc.nextInt();
//				M.put(re, new TableData(re, a, b));
//				T.add(M.get(re));
//				T.add(new TableData(re, a, b));
				T_L.add(new TableData(a, b));
				B_c.add(new XYChart.Data(a, b));
				L_c.add(new XYChart.Data(a, b));
			}
			L.add(re);
			map_Path.put(re, filePath);

//			System.out.println(T);
			
			L_View.setItems(FXCollections.observableArrayList(L));

			ObservableList obList = FXCollections.observableArrayList(T_L);	// TableView
			M.put(re, T_L);		// 맵에 파일명과 리스트 연결

			TableColumn suj = T_View.getColumns().get(0);
			suj.setCellValueFactory(new PropertyValueFactory("sub"));
			suj.setStyle("-fx-alignment: CENTER;");
			TableColumn sco = T_View.getColumns().get(1);
			sco.setCellValueFactory(new PropertyValueFactory("score"));
			sco.setStyle("-fx-alignment: CENTER;");
			T_View.setItems(obList);
			
			XYChart.Series B1 = new XYChart.Series();						// BarChart
			B1.setName(re);
			B1.setData(FXCollections.observableArrayList(B_c));
			B_chart.getData().add(B1);
			
			XYChart.Series L1 = new XYChart.Series();
			L1.setName(re);
			L1.setData(FXCollections.observableArrayList(L_c));
			L_chart.getData().add(L1);
		}
	}
	
	public void handleNW(ActionEvent e) throws IOException {
		try (
				
				FileWriter fw = new FileWriter("sv.txt", true);	// true - 기존 파일에 이어서 작성(default는 false)
				BufferedWriter bw = new BufferedWriter(fw);
			)// try 종료후 자동으로 close처리됨.
			{
				bw.write(key);
				bw.flush();					
				
			} catch (Exception a) {
				a.getStackTrace();
			}
		
		Stage modW = new Stage(StageStyle.DECORATED);
		modW.initModality(Modality.WINDOW_MODAL);
		modW.initOwner(pri);
		modW.setTitle("정보 수정");
		
		Parent mod = FXMLLoader.load(getClass().getResource("modify.fxml"));
		Scene scene = new Scene(mod);
		
		modW.setScene(scene);
		modW.setResizable(false);
		modW.show();
	}
	
	public void handleExit() {
		Platform.exit();
	}

}