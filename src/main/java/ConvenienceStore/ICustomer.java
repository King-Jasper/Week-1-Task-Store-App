package ConvenienceStore;

public interface ICustomer {
   void makePayment(double amount);
   double getWalletBalance();
   void addToCart(Product product, Integer quantity);
}
