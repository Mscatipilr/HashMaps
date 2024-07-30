public class IouMain {
    public static void main(String[] args) {
        Iou mattsIou = new Iou();
        mattsIou.setSum("Arthur", 51.5);
        mattsIou.setSum("Michael", 30);

        System.out.println(mattsIou.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIou.howMuchDoIOweTo("Michael"));
    }
}
