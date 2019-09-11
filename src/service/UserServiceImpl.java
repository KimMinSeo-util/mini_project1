package service;

import java.util.List;

import dao.Userdao;
import vo.UserVO;

public class UserServiceImpl implements UserService{
	Userdao ud;
	
	public UserServiceImpl() {}
	public UserServiceImpl(Userdao ud) {
		super();
		this.ud = ud;
	}
	
	public Userdao getUd() {
		return ud;
	}
	public void setUd(Userdao ud) {
		this.ud = ud;
	}

	@Override
	public int addUser(UserVO users) {
		return ud.insertUser(users);
	}


	@Override
	public int updateUser(UserVO users) {
		return ud.updateUser(users);
	}

	@Override
	public UserVO login(UserVO vo) {
		return ud.login(vo);
	}
	@Override
	public List<UserVO> UserList() {
		return ud.getUsersRec();
	}

}
