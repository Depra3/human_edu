package fxExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ModifyController implements Initializable {
	
	@FXML private Label stu_ID;
	@FXML private TextField sub_Field;
	@FXML private TextField sc_Field;
	@FXML private TableView<TableData> T_ModView;
	@FXML private Button btn_Add;
	@FXML private Button btn_Mod;
	@FXML private Button btn_Del;
	
	FileReader fr;
	FileWriter fw;
	BufferedReader br = null;
	BufferedReader tr = null;
	BufferedWriter bw;
	File file;
	
	String key;
	List S = null;
	TableData TD;
	String subF;
	int scF;
	
	
	Map<String, Integer> mdM = new HashMap<String, Integer>();
	Map<String, Object> M = new HashMap<String, Object>();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		stu_ID.setText();
		try{
			fr = new FileReader("sv.txt");
			br = new BufferedReader(fr);
			key = br.readLine();
			
			file = new File("D:\\AI_Class\\J2SE_File\\FX02/" + key + ".txt");
			Scanner sc = new Scanner(file);
			S = new ArrayList();
			
			String a = null;
			int b = 0;
			while (sc.hasNext()) {
				a = sc.next();
				b = sc.nextInt();
				
				S.add(new TableData(a, b));
				mdM.put(a, b);
				M.put(a, b);
			}
//			System.out.println(S);
			stu_ID.setText(key);
			PrintWriter pw = new PrintWriter("sv.txt");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		List T_L = new ArrayList();
//		T_L = (List) 
		ObservableList obList = FXCollections.observableArrayList(S);
		TableColumn suj = T_ModView.getColumns().get(0);
		suj.setCellValueFactory(new PropertyValueFactory("sub"));
		suj.setStyle("-fx-alignment: CENTER;");
		TableColumn sco = T_ModView.getColumns().get(1);
		sco.setCellValueFactory(new PropertyValueFactory("score"));
		sco.setStyle("-fx-alignment: CENTER;");
		
		T_ModView.setItems(obList);
		
		T_ModView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		@Override
		public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)  {
//			System.out.println(T_ModView.getSelectionModel().getSelectedItem().getSub());
//			System.out.println(T_ModView.getSelectionModel().getSelectedItem().getScore());
			String sub = T_ModView.getSelectionModel().getSelectedItem().getSub();
			Integer sc = T_ModView.getSelectionModel().getSelectedItem().getScore();
			String s_Sc = String.valueOf(sc); 
			sub_Field.setText(sub);
			sc_Field.setText(s_Sc);
		}
	});
	}
	
	public void handleAdd() throws IOException {
		subF = sub_Field.getText();
		scF = Integer.parseInt(sc_Field.getText());
		if (!mdM.containsKey(subF)) {
			S.add(new TableData(subF, scF));
			fw = new FileWriter(key + ".txt", true);	// true - 기존 파일에 이어서 작성(default는 false)
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(subF + "	" +scF);
			
			bw.flush();
			bw.close();
			mdM.put(subF, scF);
		}
		Scanner sc = new Scanner(file);
		S = new ArrayList();
		
		String a = null;
		int b = 0;
		while (sc.hasNext()) {
			a = sc.next();
			b = sc.nextInt();
			S.add(new TableData(a, b));
			
		}
		ObservableList obList = FXCollections.observableArrayList(S);
		T_ModView.setItems(obList);
	}
	public void handleMod() throws IOException {
//		TableData d =  (TableData) S.get(i);
//		S.add(new TableData(d.getSub(),d.getScore()));
		subF = sub_Field.getText();
		scF = Integer.parseInt(sc_Field.getText());
		
		PrintWriter pw = new PrintWriter(key + ".txt");
		pw.close();
		
		mdM.put(subF, scF);
		M.put(subF, scF);
		System.out.println(mdM);
		System.out.println(1);
		List S = null;
		System.out.println(2);
		Set set = mdM.entrySet();
		System.out.println(3);
		String mK = null;
		int mV = 0 ;
		Iterator Iter = set.iterator();
		System.out.println(4);
		while (Iter.hasNext()) {
			Entry<String, Integer> entry = (Entry) Iter.next();
			mK = (String) entry.getKey();
			mV = (Integer) entry.getValue();
			fw = new FileWriter(key + ".txt", true);	// true - 기존 파일에 이어서 작성(default는 false)
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(mK + "	" + mV);
			
			bw.flush();
			bw.close();
		}
		Scanner sc = new Scanner(file);
		List modS = new ArrayList();
		modS = (List) M.get(key); 
				
		
		String a = null;
		int b = 0;
		while (sc.hasNext()) {
			a = sc.next();
			b = sc.nextInt();
			
			S.add(new TableData(a, b));
		}
		System.out.println(5);
		
		ObservableList obList = FXCollections.observableArrayList(modS);
		System.out.println(6);
		T_ModView.setItems(obList);
		
	}
	public void handleDel() {
//		ObservableList<TableData> tableSelected, tableList;
//		tableList = T_View.getItems();
//		tableSelected = T_View.getSelectionModel().getSelectedItems();
//		
//		tableSelected.forEach(tableList::remove);
//		
//		OutputStream output = new FileOutputStream(null)
	}
	
	public Label getStu_ID() {
		return stu_ID;
	}

	public void setStu_ID(String stu_ID) {
		this.stu_ID.setText(stu_ID);
	}
	
}
