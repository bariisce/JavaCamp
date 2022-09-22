package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.id=1;
		product.name="Laptop";
		product.description="Lenovo";
		product.price=7250;
		product.stockAmount=1;

		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
	}

}
