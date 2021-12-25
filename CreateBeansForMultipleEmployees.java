package SpringAssignment.Config;

import SpringAssignment.Address;
import SpringAssignment.Project;
import SpringAssignment.Team;
import SpringAssignment.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CreateBeansForMultipleEmployees {

    @Bean
    @Scope("Singleton")
   public Team Team(){
       return new Team();
   }

    @Bean
    @Scope("Singleton")
   public Address Address(){
       return new Address();
   }

    @Bean
    @Scope("Singleton")
   public User User(){
       return new User();
   }

    @Bean
    @Scope("Singleton")
    public Project Project() {
        return new Project();

    }
}
