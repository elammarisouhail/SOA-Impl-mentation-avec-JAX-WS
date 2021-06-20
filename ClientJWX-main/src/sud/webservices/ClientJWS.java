package sud.webservices;

public class ClientJWS {

	public static void main(String[] args) throws NoSuchProductException_Exception {
		ProductsManager stub=new ProductsManagerImplService().getProductsManagerImplPort();
		
		// Add a Product
		long id=1;
		Product product= new Product();
		product.setId(id);
		product.setLabel("tomato");
		product.setPrice(20.0);
		long res=stub.addProduct(product);
		// Show result
		System.out.println(res);
		
		
		// Get a product
		Product prd = stub.getProduct(id);
		// Show result
		System.out.println(prd);
		
		
		//Delete a Product
		boolean deleted = stub.deleteProduct(id);
		// Show result
		System.out.println(deleted);
		
		
		//get all products
		Products prds = stub.getProducts();
		// Show result
		System.out.println(prds);
		
		
		//Delete a Product
		boolean deleted1 = stub.deleteProduct(id);
		// Show result
		System.out.println(deleted1);
				

	}

}
