public class Object {
    private Object type;
    private double price;

    public Object() {
    }

    public Object(Object obj) {
        this.type = obj;
    }

    public Object(Object obj, double price) {
        this.type = obj;
        this.price = price;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}