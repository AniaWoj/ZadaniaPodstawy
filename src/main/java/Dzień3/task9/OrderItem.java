package Dzień3.task9;

import java.util.Objects;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount(){
        return quantity * price;
    }
    public boolean isCorrect(){
        return quantity > 0 && price > 0;
    }

    public void  print(){

        // zrobić | w równym odstępie
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t| ");
        sb.append(price).append(" ").append("zł").append("\s| ");
        sb.append(quantity).append(" ").append("pcs").append("\s| ");
        sb.append(getAmount()).append(" zł");
        System.out.println(sb);
        //System.out.println(productName + "|" + price + "|" + quantity + "|" + getAmount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return quantity == orderItem.quantity && Double.compare(orderItem.price, price) == 0 && Objects.equals(productName, orderItem.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity, price);
    }
}
