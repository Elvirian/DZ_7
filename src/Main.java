

public class Main {
    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        String[][] mas = {{"1", "4", "4", "4"}, {"1", "2", "3", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}};

        try {
            System.out.println(ArrayValueCalculator.doCalc(mas));
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }


    }


}
