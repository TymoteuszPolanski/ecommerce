package pl.tpolanski.productcatalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCatalogController {

    @GetMapping("/api/products")
    List<Product> allProducts() {
        ProductCatalog catalog = null;
        return catalog.allPublishedProducts();
    }
}