class Program {
    public static void main(String[] args) {
        IProduct milk1 = new Milk("Молком 2,5%", 69.90);
        IProduct coffee1 = new Coffee("Нескафе", 99.90);
        IProduct bread1 = new Bread("КрайКаравай Горичный", 41.90);

        IUser buyer1 = new Buyer("Смирнов В.В.", "rrr2003", "krutoi2003@gmail.com");

        Transaction transaction = new Transaction(milk1, buyer1);
        transaction.doTransaction();
    }
}

interface IProduct{
    String getNameProduct();
    double getCost();
    void setRating(int rating);
    double getRating();
}
class Milk implements IProduct{
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
class Coffee implements IProduct{
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
class Bread implements IProduct{
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

interface IUser{
    String getNameUser();
    void setPassword(String password);
    String getPassword();
    void setLogin(String login);
    String getLogin();
}
class Buyer implements IUser, IProduct{
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
class Seller implements IUser{
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
class Provider implements IUser{
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

class Transaction implements IProduct, IUser{
    IProduct product;
    IUser user;

    public Transaction(IProduct product, IUser user) {
        this.product = product;
        this.user = user;
    }

    public void doTransaction(){
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