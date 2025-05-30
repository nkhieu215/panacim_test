package rd.panacim.panacim_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*") // Chấp nhận mọi nguồn
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH") // Cho phép tất cả phương thức HTTP
                        .allowedHeaders("*") // Cho phép tất cả headers
                        .allowCredentials(false); // Không sử dụng credentials
            }
        };
    }
}
