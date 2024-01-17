import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private List<Product> products;

    public ProductServiceImpl() {
        this.products = new ArrayList<>();
        // Ürünleri başlangıçta ekleyebilirsiniz.
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int productId) {
        // Belirli bir ürünü getirme işlemi
        return products.stream()
                .filter(product -> product.getId() == productId)
                .findFirst()
                .orElse(null);
    }

    // diğer ürün yönetimi metotları
}
