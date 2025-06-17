import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Product{
    private int pno;
    private String name;
    private String company;
    private int price;

//    public Product(int pno, String name, String company, int price) {
//        this.pno = pno;
//        this.name = name;
//        this.company = company;
//        this.price = price;
//    }
//
//    public String getPno() { return pno; }
//    public String getName() { return name; }
//    public String getCompany() { return company; }
//    public int getPrice() { return price; }
}
