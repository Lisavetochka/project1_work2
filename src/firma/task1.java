package firma;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.print("Введіть кількість чисел в масиві: ");
        Scanner sc = new Scanner(System.in, "cp1251");
        try {
            int num = Integer.parseInt(sc.next());
            if (num >0) {
                int[] myArray = new int[num];
                System.out.println("Заповніть масив числами:");
                for (num = 0; num < myArray.length; num++) {
                    myArray[num] = Integer.parseInt(sc.next());
                    // заполняем массив с клавиатуры
                }
                System.out.print("\nОтриманий масив:");
                for (num = 0; num < myArray.length; num++) {
                    System.out.print(myArray[num] + " "); // Выводим на экран, полученный массив
                }

                int indMax = 0;
                int max = myArray[indMax];
                try {
                    for (int i = 0; i < myArray.length; i++) {
                        if ( myArray[i] > max  && myArray[i] % 3 == 0  ) {
                            max = myArray[i];
                            indMax = i;

                        } else if ( myArray[i] > max && myArray[i] % 3 != 0) {
                            throw new Error("\nВ масиві немає числа, яке кратне 3.");
                        }
                    }System.out.print("\nМаксимальне число: " + max + ", a його індекс: " + indMax);

                } catch (Error e) {
                    System.out.println("\n\n!!!Помилка. Перезапустіть програму " + e);
                }
            }else throw new Exception ("Кількість елементів в масиві не може бути від'ємною.");
        } catch (NumberFormatException e ){
        System.out.print("\n!!!Помилка, ви ввели некоректні дані. Перезапустіть програму. \nІнформація про помилку: \n"+ e);
    } catch (Exception e){
            System.out.print("\n!!!Помилка. Перезапустіть програму. Інформація про помилку: \n"+ e);}

    }
}


