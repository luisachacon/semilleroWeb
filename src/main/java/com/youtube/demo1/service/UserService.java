package com.youtube.demo1.service;

import com.youtube.demo1.model.Usuario;

public interface UserService {
	
	/**
	 * 
	 * Guarda_un_usuario_y_lo_actualiza_con_el_id
	 * @param user
	 * @return
	 */
	Usuario save(Usuario user);
	
	/**
	 * Elimina_un_usuario_con_el_id_recibido
	 * @param id
	 */

	void deleteUser(Usuario id);
	Usuario findById(int id);

}
