package importAnnotation;

import org.springframework.context.annotation.*;

@Configuration
@Import(ConfigA.class)

public class ConfigB {
   @Bean
   public B b() {
      return new B(); 
   }
}
