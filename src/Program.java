class Program {
    public static void main(String[] args) {
        Product milk1 = new Milk("Молком 2,5%", 69.90);
        Product coffee1 = new Coffee("Нескафе", 99.90);
        Product bread1 = new Bread("КрайКаравай Горичный", 41.90);

        User buyer1 = new Buyer("Смирнов В.В.", "rrr2003", "krutoi2003@gmail.com");

        Transaction transaction = new Transaction(milk1, buyer1);
    }
}

interface Product{
    String getNameProduct();
    double getCost();
    void setRating(int rating);
    double getRating();
}
class Milk implements Product{
    String nameProduct;
    double cost;
    double rating = 5;

    Milk(String nameProduct, double cost){
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    @Override
    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setRating(int setRating) {
        rating = setRating;
    }

    @Override
    public double getRating() {
        return rating;
    }
}
class Coffee implements Product{
    String nameProduct;
    double cost;
    double rating = 5;

    Coffee(String nameProduct, double cost){
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    @Override
    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setRating(int setRating) {
        rating = setRating;
    }

    @Override
    public double getRating() {
        return rating;
    }
}
class Bread implements Product{
    String nameProduct;
    double cost;
    double rating = 5;

    Bread(String name, double cost){
        this.nameProduct = name;
        this.cost = cost;
    }

    @Override
    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setRating(int setRating) {
        rating = setRating;
    }

    @Override
    public double getRating() {
        return rating;
    }
}

interface User{
    String getNameUser();
    void setPassword(String password);
    String getPassword();
    void setLogin(String login);
    String getLogin();
}
class Buyer implements User, Product{
    String name;
    String password;
    String login;

    public Buyer(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    @Override
    public String getNameUser() {
        return name;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getNameProduct() {
        return null;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public void setRating(int rating) {

    }

    @Override
    public double getRating() {
        return 0;
    }
}
class Seller implements User{
    String name;
    String password;
    String login;

    public Seller(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    @Override
    public String getNameUser() {
        return name;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}
class Provider implements User{
    String name;
    String password;
    String login;

    public Provider(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    @Override
    public String getNameUser() {
        return name;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}

class Transaction implements Product, User{
    Product product;
    User user;

    public Transaction(Product product, User user) {
        this.product = product;
        this.user = user;

        System.out.printf("Пользователь %s купил \"%s\" (%.2f ₽) (★ %.2f)\n",
                user.getNameUser(), product.getNameProduct(), product.getCost(), product.getRating());
    }

    @Override
    public String getNameProduct() {
        return product.getNameProduct();
    }

    @Override
    public double getCost() {
        return product.getCost();
    }

    @Override
    public void setRating(int setRating) {
        product.setRating(setRating);
    }

    @Override
    public double getRating() {
        return product.getRating();
    }

    @Override
    public String getNameUser() {
        return user.getNameUser();
    }

    @Override
    public void setPassword(String password) {
        user.setPassword(password);
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public void setLogin(String login) {
        user.setLogin(login);
    }

    @Override
    public String getLogin() {
        return user.getLogin();
    }
}