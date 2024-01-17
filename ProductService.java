import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int productId);
    // other produtcs management methods
}
