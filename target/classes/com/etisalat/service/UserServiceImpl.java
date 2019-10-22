package com.etisalat.service;

import java.time.LocalDate;
import java.util.List;

import com.sapient.trg.dao.UserDAO;
import com.sapient.trg.dao.UserDaoImpl;
import com.sapient.trg.domain.User;
import com.sapient.trg.exception.UserException;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO =new UserDaoImpl();
	@Override
	public Integer addNewUser(User user) throws UserException {
		try {			
			user.setCreateDate(LocalDate.now());			
			return userDAO.addNewUser(user);
		}catch(Exception e) {
			throw new UserException(e.getMessage(),e);
		}
		
	}
	@Override
	public User getUserDetails(Integer userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User getUserDetails(String userName, String password) throws UserException {
		try {									
			return userDAO.getUserDetails(userName, password);
		}catch(Exception e) {
			throw new UserException(e.getMessage(),e);
		}
	}
	@Override
	public List<User> getAllUsers() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
