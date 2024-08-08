public class OperatorChallenge {
    public static void main(String[] args) {
        double ohio = 20.00;
        double ohio2 = 80.00;
        double ohioTotal = (ohio + ohio2) * 100.00;
        double ohioRemainder = ohioTotal % 40.00;
        System.out.println(ohioRemainder);
        boolean isNoRemainder = (ohioRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
