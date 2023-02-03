package Dzień3.task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;
    private int nextIndex = 0;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    public boolean addItem(OrderItem orderItem) {
        if (!orderItem.isCorrect()) {
            System.out.println("Order items is not correct");
            return false;
        }
            // czy jest miesjce w zamówieniu
            if (nextIndex >= maxOrderItem) {
                System.out.println("Order is full");
                return false;
            }
            //dodajemy do zamówienia
            orderItems[nextIndex] = orderItem;
            nextIndex++;
            return true;
    }
    public double getTotalAmount(){
        double totalAmount = 0;
        for (OrderItem orderItem : orderItems){
            if (orderItem != null){
                totalAmount += orderItem.getAmount();
            }
        }
        //totalAmount = Math.round(totalAmount*100); // wyświetlanie dwóch miejsc po przecinku
        return totalAmount;
    }

    public int getItemsCount(){
        int itemsCount = 0;
        for (OrderItem orderItem : orderItems){
            if (orderItem != null){
                itemsCount += orderItem.getQuantity();
            }
        }
        return itemsCount;
    }
    public void print(){
        for (OrderItem orderItem : orderItems){
            if (orderItem != null){
                orderItem.print();
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }
}