package human11.domain.dao.oracle;

import human11.domain.dao.UserInfo;
import human11.domain.dao.UserInfoDao;

public class OracleDao implements UserInfoDao {
	@Override
	public void insertInfo(UserInfo userInfo) {
		System.out.printf("Insert Oracle ID(%s), PW(%s), NAME(%s)\n", 
				userInfo.getUserId(), userInfo.getUserPassword(), userInfo.getUserName());
	}
	@Override
	public void deleteInfo(UserInfo userInfo) {
		System.out.printf("Delete Oracle ID(%s), PW(%s), NAME(%s)\n", 
				userInfo.getUserId(), userInfo.getUserPassword(), userInfo.getUserName());
	}
	@Override
	public void searchInfo(UserInfo userInfo) {
		System.out.printf("Select Oracle ID(%s), PW(%s), NAME(%s)\n", 
				userInfo.getUserId(), userInfo.getUserPassword(), userInfo.getUserName());
	}
}
