package com.youtube.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo1.dao.UserRepository;
import com.youtube.demo1.model.Usuario;

@Service
public class UserServicelmpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public Usuario save(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println(user.getNombre());
		return this.userRepository.save(user);
	}


	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(id);
	}

	@Override
	public void deleteUser(Usuario user) {
		userRepository.delete(user);
	}
	
	
}
