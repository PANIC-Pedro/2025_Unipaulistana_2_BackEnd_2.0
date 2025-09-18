package br.edu.unipaulistana.backend.Blog.Service;

import br.edu.unipaulistana.backend.Blog.domainmodel.NonPersistenUserRepository;
import br.edu.unipaulistana.backend.Blog.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final NonPersistenUserRepository repository;
    private UserServiceImpl userService;

    @Override
    public List<User> findAll(){
        return this.repository.findAll();
    }

    @Override
    public List<User> findUserById(UUID id) {
        return this.userService.findUserById(id);
    }

    @Override
    public void deleteById(UUID id) {
        this.repository.removeById(id);
    }

    @Override
    public User create(User user) {
        if(user.getId() == null)
            user.setId(UUID.randomUUID());
            return this.repository.create(user);

    }


}
