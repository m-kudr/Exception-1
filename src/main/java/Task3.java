import java.sql.Array;

public class Task3 {
    static int[] ArrayResult(int[] array1, int[] array2) {
        int arraySize1 = array1.length;
        int arraySize2 = array2.length;
        if (arraySize1 != arraySize2) {
            System.out.println("Размеры массивов не равны! Выполнение нвозможно.");
            return array1;
        }
        int[] arrayResult = new int[arraySize1];
        for (int i = 0; i < arraySize1; i++) {
            arrayResult[i] = array1[i] - array2[i];
        }
        return arrayResult;
    }
}
