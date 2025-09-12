package SpringBoot.Backend.Learning;


import SpringBoot.Backend.Learning.Bean.UserConfig;

import SpringBoot.Backend.Learning.Classes.Man;
import SpringBoot.Backend.Learning.Classes.Person;
import SpringBoot.Backend.Learning.Classes.PersonInvocationHandler;
import SpringBoot.Backend.Learning.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Proxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BackendLearningApplication {

	public static void main(String[] args) {

        SpringApplication.run(BackendLearningApplication.class, args);
        Man mohan = new Man("Mohan",30 , "delhi" , "India");
        ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();
        Class[] interfaces = mohan.getClass().getInterfaces();
        Person proxyMohan = (Person) Proxy.newProxyInstance(mohanClassLoader,interfaces,new PersonInvocationHandler(mohan));

        proxyMohan.introduce(mohan.getName());



	}

}
