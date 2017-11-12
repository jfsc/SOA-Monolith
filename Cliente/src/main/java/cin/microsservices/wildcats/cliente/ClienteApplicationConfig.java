package cin.microsservices.wildcats.cliente;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.inject.Named;

@Configuration
public class ClienteApplicationConfig {

    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig() {
            this.packages("cin.microsservices.wildcats.cliente.rest");
        }
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }
}
