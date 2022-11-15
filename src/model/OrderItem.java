package model;

public class OrderItem {
    private Long idItem;
    private float price;
    private Long quantity;
    private Long orderId;
    private Long productId;
    private String productName;
    private double total;


    public OrderItem(String record) {
        String[] fields = record.split(",");
        idItem = Long.parseLong(fields[0]);
        price = Float.parseFloat(fields[1]);
        quantity = Long.parseLong(fields[2]);
        orderId = Long.parseLong(fields[3]);
        productId = Long.parseLong(fields[4]);
        productName = fields[5];
    }

    public OrderItem() {
    }


    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotal() {
        return getPrice()*getQuantity();
    }

    public void setTotal(double total) {
        this.total = total;
    }



    public OrderItem(Long idItem, float price, Long quantity, Long orderId, Long productId, String productName, double total) {
        this.idItem = idItem;
        this.price = price;
        this.quantity = quantity;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.total = total;
    }


    @Override
    public String toString() {
        return idItem + "," + price + "," + quantity + "," + orderId + "," + productId + "," + productName;
    }
}
