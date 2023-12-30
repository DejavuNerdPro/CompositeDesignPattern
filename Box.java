import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Box> boxList = new ArrayList<>();
    private List<Object> objectList = new ArrayList<>();

    public Box() {
    }

    public Box(List<Box> boxs, List<Object> objects) {
        this.boxList = boxs;
        this.objectList = objects;
    }

    public double calculatePrice(){
        double sum=objectList.stream().mapToDouble(Object::getPrice()).sum();
        for(Box box:boxList){
            sum=+box.calculatePrice();
        }
        return sum;
    }

    public List<Box> getBoxList() {
        return boxList;
    }

    public void setBoxList(List<Box> boxList) {
        this.boxList = boxList;
    }

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

}