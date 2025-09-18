package br.edu.unipaulistana.backend.Blog.Service;

import br.edu.unipaulistana.backend.Blog.domainmodel.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> findAll();

    List<User> findUserById(UUID id);

    void deleteById(UUID id);

    User create(User user);
}
