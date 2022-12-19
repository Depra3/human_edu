package human11.useinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import human11.domain.dao.UserInfo;
import human11.domain.dao.UserInfoDao;
import human11.domain.dao.mysql.MySQLDao;
import human11.domain.dao.oracle.OracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException{
		UserInfo uinfo = 
				new UserInfo("human", "12345", "KANG");
//		uinfo.setUserPassword("7890");
		FileInputStream fis;
		fis = new FileInputStream("D:\\AI_Class\\J2SE_File\\EX04\\src\\human11\\useinfo\\web\\conf");
		
		Properties prop = new Properties();
		// key값을 찾아 해당되는 value를 가져옴 / key = value / ex) DBTYPE=ORACLE
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		// dbType ==> "ORACLE" 또는 "MYSQL"
		System.out.println(prop);
		
		
		UserInfoDao userInfoDao;
		if (dbType.equals("ORACLE")) {
			// 문자열 비교는 == 가 아니라, equals로 함.
			userInfoDao = new OracleDao();
			// userInfoDao(인터페이스 객체) = 뒷부분은 인터페이스를 구현한 클래스.
		} else {
			userInfoDao = new MySQLDao();
		}
		userInfoDao.insertInfo(uinfo);
		userInfoDao.searchInfo(uinfo);
		userInfoDao.deleteInfo(uinfo);
	}
}
