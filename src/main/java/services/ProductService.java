package services;

import com.example.OnlineShop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PS 5", "sda", 60, "Ae", "ad"));
        products.add(new Product(++ID, "Ipho", "ad", 450, "Aae", "ad"));
    }

    public List<Product> list(){
        return products;
    }

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(long id){
        products.removeIf(product -> product.getId() == id);
    }

}
