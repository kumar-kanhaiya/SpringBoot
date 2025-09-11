package SpringBoot.Backend.Learning.restAPI;


import SpringBoot.Backend.Learning.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @Autowired
    private UserService userService;

        @GetMapping("/")
        public String userLogin(){
        userService.logIn();
        return "User Login endpoint called successfully!";
    }
}
