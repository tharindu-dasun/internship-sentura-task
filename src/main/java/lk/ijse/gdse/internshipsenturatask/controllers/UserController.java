package lk.ijse.gdse.internshipsenturatask.controllers;

import lk.ijse.gdse.internshipsenturatask.dto.userDTO;
import lk.ijse.gdse.internshipsenturatask.repo.UserRepo;
import lk.ijse.gdse.internshipsenturatask.service.UserService;
import org.apache.catalina.User;
import org.apache.tomcat.util.http.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
    }

    public UserController() {
    }

    @PostMapping
    public ResponseUtil saveUser(@RequestBody userDTO userDTO) {
        userService.SaveUser(userDTO);
        return new UserRepo(200, "success", null);
    }

    @GetMapping
    public ResponseUtil getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return new UserRepo(200, "all users", allUsers);
    }

    @PutMapping
    public UserRepo UpdateUser(@RequestBody userDTO userDTO) {
        User user = userService.updateUser(userDTO);
        return new UserRepo(200, "updated", modelMapper.map(user, userDTO.class));
    }

    @DeleteMapping({"{id}"})
    public ResponseUtil deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return new UserRepo(200,"delete success",null);
    }
}
