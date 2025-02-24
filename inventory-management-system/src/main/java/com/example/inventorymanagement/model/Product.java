import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "product_name", nullable = false, length = 50)
    private String productName;

    @Column(name = "product_buying_price", nullable = false)
    private double productBuyingPrice;

    @Column(name = "product_selling_price", nullable = false)
    private double productSellingPrice;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    // No-argument constructor
    public Product() {}

    // Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public double getProductBuyingPrice() { return productBuyingPrice; }
    public void setProductBuyingPrice(double productBuyingPrice) { this.productBuyingPrice = productBuyingPrice; }
    public double getProductSellingPrice() { return productSellingPrice; }
    public void setProductSellingPrice(double productSellingPrice) { this.productSellingPrice = productSellingPrice; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
}
