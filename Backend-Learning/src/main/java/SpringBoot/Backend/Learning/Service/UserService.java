package SpringBoot.Backend.Learning.Service;

import SpringBoot.Backend.Learning.Bean.UserConfig;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class UserService {
    @Getter
    @Setter
    @AllArgsConstructor
    public class User{
        private String name;
        private int age;
        private String Address;
    }

    private User user;

    public void logIn(){
        System.out.println("Logging user in");
    }

    public void logOut() throws Exception{
        System.out.println("Logging user out");
        throw new Exception("unable to logout the user");
    }
    UserConfig userConfig;

    public UserService(UserConfig userConfig){
        this.userConfig = userConfig;
    }

    public UserService(){
        user = new User("Kanhaiya Kumar" , 20 , "Delhi , India");
    }


}
