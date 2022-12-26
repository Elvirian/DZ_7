public class ArrayValueCalculator {
    static int doCalc(String[][] strArray) throws ArraySizeException, ArrayDataException {

        int sum = 0;

        if (4 != strArray.length) throw new ArraySizeException();
        for (int i = 0; i < strArray.length; i++) {
            if (4 != strArray[i].length) throw new ArraySizeException();
            for (int j = 0; j < strArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}

