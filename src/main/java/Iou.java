import java.util.HashMap;

public class Iou {

    private HashMap<String, Double> iou;

    public Iou() {
        this.iou = new HashMap<>();
    }

    /**
     * Saves the amount owed and the person owed to the IOU
     * @param toWhom who is owed money
     * @param amount how much they owe
     */
    public void setSum(String toWhom, double amount){
        this.iou.put(toWhom, amount);
    }

    /**
     * returns the amount owed to the person whose name is given as a parameter or 0 if not found.
     * @param toWhom the person who is owed money
     * @return
     */
    public double howMuchDoIOweTo (String toWhom) {
        if (this.iou.get(toWhom) == null) {
            return 0;
        }
        return this.iou.get(toWhom);

    }
}
