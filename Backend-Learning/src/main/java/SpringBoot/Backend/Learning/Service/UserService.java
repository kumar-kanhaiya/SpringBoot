package SpringBoot.Backend.Learning.Service;

import SpringBoot.Backend.Learning.Bean.UserConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{

    @Getter
    @Setter
    @AllArgsConstructor
    public class User{
        private String name;

        private int age;

        private String address;

    }

    private User user;

    public UserService(){
        user = new User("Kanhaiya Singh", 21, "Delhi, India");
    }

    public void logIn(){
        System.out.println("Logging user in");
    }

    public void logout() throws Exception{
        System.out.println("logging user out");
        throw new Exception("unable to logout the user");
    }


}
