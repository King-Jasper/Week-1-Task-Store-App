package ConvenienceStore;

public class StoreContent {
    public static void main(String[] args) {
        Store store1 = new Store("ShopMore", 50000000);
        Manager manager = new Manager("Mr Frank", "AD12", store1);
        Product Apple = new Product("Green Apple", 2000, 10);
        Product Wine = new Product("Red Wine", 4500, 70);
        Product Perfume = new Product("Oil Perfume", 3500, 50);
        Product Cake = new Product("Chocolate Cake", 5000, 5);
        Product BeerDrinks = new Product("All kinds", 400, 100);

        manager.addProductToStore(Apple);
        manager.addProductToStore(Wine);
        manager.addProductToStore(Perfume);
        manager.addProductToStore(Cake);
        manager.addProductToStore(BeerDrinks);

        Cashier cashier1 = new Cashier("Prisca", "SAM111", store1);
        manager.hireCashier(cashier1);
        Cashier cashier2 = new Cashier("Edward Smith", "SAM112", store1);
        Cashier cashier3 = new Cashier("David Mark", "SAM113", store1);

        Customer customer = new Customer("Joseph", 50000.0);

        customer.addToCart(Apple, 5);
        customer.addToCart(Perfume, 7  );
        cashier2.confirmItemToPay(customer);

        Customer customer2 = new Customer("John Michael", 10000);
        Customer customer3 = new Customer("Felix", 12000);
        Manager manager1 = new Manager("Edward Smith","SAM112", store1);
        //manager.fireCashier(cashier1);

    }
}
