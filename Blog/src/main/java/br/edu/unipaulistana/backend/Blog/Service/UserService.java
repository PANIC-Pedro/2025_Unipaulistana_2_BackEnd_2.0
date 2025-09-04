package br.edu.unipaulistana.backend.Blog.Service;

import br.edu.unipaulistana.backend.Blog.domainmodel.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
