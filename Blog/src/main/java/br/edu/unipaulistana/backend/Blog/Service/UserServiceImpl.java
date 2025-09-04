package br.edu.unipaulistana.backend.Blog.Service;

import br.edu.unipaulistana.backend.Blog.domainmodel.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll(){
        return List.of();
    }
}
