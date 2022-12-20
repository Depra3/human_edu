package com.human.spring;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemDAO {
	ArrayList<MemberDTO> list();
	void memberSignUp(String loginid, String passcode, String name, String mobile);
	int getMemberCount(String loginid, String passcode);
	int checkDup(String loginid);
}
