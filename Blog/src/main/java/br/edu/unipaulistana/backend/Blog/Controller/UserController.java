package br.edu.unipaulistana.backend.Blog.Controller;

import br.edu.unipaulistana.backend.Blog.Service.UserService;
import br.edu.unipaulistana.backend.Blog.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//http://localhost:8080/users
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping
    public List<User> findAll() {
        return this.userService.findAll();

    }

    //http://localhost:8080/users/{id}
    @GetMapping("/{id}")
    public List<User> findUserById(@PathVariable UUID id) {
        return this.userService.findUserById(id);

    }

    @DeleteMapping("/{id}")
    public void deleteUserByYd(@PathVariable UUID id) {
        this.userService.deleteById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
         return this.userService.create(user);
    }


}
