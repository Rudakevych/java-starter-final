package cw2;

public class YrClassWork1 {

    /**
     * За допомогою простих змінних і обчислень перевести десяткове число в двійкове і навпаки
     */
    public static void main(String[] args) {

        // From decimal to binary
        int ourDecimalNumber = 125;

        int num1 = ourDecimalNumber / 2;
        int value1 = num1 % 2;
        System.out.print(value1);

        int num2 = num1 / 2;
        int value2 = num2 % 2;
        System.out.print(value2);

        int num3 = num2 / 2;
        int value3 = num3 % 2;
        System.out.print(value3);

        int num4 = num3 / 2;
        int value4 = num4 % 2;
        System.out.print(value4);

        int num5 = num4 / 2;
        int value5 = num5 % 2;
        System.out.print(value5);

        int num6 = num5 / 2;
        int value6 = num5 % 2;
        System.out.print(value6);

        int num7 = num6 / 2;
        int value7 = num6 % 2;
        System.out.print(value7);

        // from binary to decimal
        int binaryNumber = 1001011;


    }


}
