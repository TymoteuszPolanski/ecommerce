package pl.tpolanski;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.tpolanski.productcatalog.HashMapProductStorage;
import pl.tpolanski.productcatalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Bean
    ProductCatalog createProductCatalog() {
        return new ProductCatalog(new HashMapProductStorage());
    }
}
