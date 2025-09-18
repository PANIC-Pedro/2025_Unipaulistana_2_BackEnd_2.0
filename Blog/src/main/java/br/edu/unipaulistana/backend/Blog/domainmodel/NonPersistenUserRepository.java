package br.edu.unipaulistana.backend.Blog.domainmodel;

import br.edu.unipaulistana.backend.Blog.domainmodel.User;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class NonPersistenUserRepository {

    private List<User> internalState = new LinkedList<>();
public NonPersistenUserRepository(){
    Faker faker = new Faker();
    for(int i = 0; i < 1000 ; i++) {
        User user = new User(
                UUID.randomUUID(),
                faker.name().fullName(),
                faker.internet().emailAddress(),
                faker.internet().password(),
                  null,
                null
        );


        this.internalState.add(user);
    }
    }

    public List<User> findAll() {
    return this.internalState.stream().toList();

    }
    public User findById(UUID id) {
        for (User u : this.internalState) {
            if (u.getId().equals(id))
                return u;
        }
        return null;
    }
//this.tinernalState.removeIf(
// User user -> user.getId().equals(id))
    public void removeById(UUID id) {
    for(User u : this.internalState){
        if (u.getId().equals(id))
            this.internalState.remove(u);
    }

    }

    public User create(User user) {
        this.internalState.add(user);
        return user;
    }
}

