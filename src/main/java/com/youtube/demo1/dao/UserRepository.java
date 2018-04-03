package com.youtube.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.youtube.demo1.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{


	@SuppressWarnings("unchecked")
	Usuario save(Usuario user);

	void delete(Usuario id);
	
	Usuario findById(int id);	
}
