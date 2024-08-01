package com.projetos.service;

import com.projetos.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
