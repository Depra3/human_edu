package human11.domain.dao.mysql;

import human11.domain.dao.UserInfo;
import human11.domain.dao.UserInfoDao;

public class MySQLDao implements UserInfoDao{
	@Override
	public void insertInfo(UserInfo userInfo) {
		System.out.printf("Insert MYSQL ID(%s), PW(%s), NAME(%s)\n", 
				userInfo.getUserId(), userInfo.getUserPassword(), userInfo.getUserName());
	}
	@Override
	public void deleteInfo(UserInfo userInfo) {
		System.out.printf("Delete MYSQL ID(%s), PW(%s), NAME(%s)\n", 
				userInfo.getUserId(), userInfo.getUserPassword(), userInfo.getUserName());
	}
	@Override
	public void searchInfo(UserInfo userInfo) {
		System.out.printf("Select MYSQL ID(%s), PW(%s), NAME(%s)\n", 
				userInfo.getUserId(), userInfo.getUserPassword(), userInfo.getUserName());
	}
}
