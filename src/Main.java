import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine();

            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(sortByLength(name)));


            }
        }
    }

    private static boolean checkName(String name) {

        String[] a = name.split(" ");
        int result = a.length - 1;
        if (result == 2) {
            return true;
        } else {
            return false;
        }


    }

    public static String formatName(String name) {

        String[] b = name.split(" ");
        String firstName = b[0];
        String secondName = b[1];
        String patronymic = b[2];

        char letter1 = firstName.charAt(0);
        char letter2 = secondName.charAt(0);
        char letter3 = patronymic.charAt(0);

        String lett1 = String.valueOf(letter1).toUpperCase();
        String lett2 = String.valueOf(letter2).toUpperCase();
        String lett3 = String.valueOf(letter3).toUpperCase();

        letter1 = lett1.charAt(0);
        letter2 = lett2.charAt(0);
        letter3 = lett3.charAt(0);


        char[] first = firstName.toCharArray();
        char[] second = secondName.toCharArray();
        char[] patron = patronymic.toCharArray();

        first[0] = letter1;
        second[0] = letter2;
        patron[0] = letter3;

        firstName = firstName.copyValueOf(first);
        secondName = secondName.copyValueOf(second);
        patronymic = patronymic.copyValueOf(patron);

        name = firstName + " " + secondName + " " + patronymic;


        return name;

    }


    private static String sortByLength(String name) {

        String[] c = name.split(" ");
        String firstName = c[0];
        String secondName = c[1];
        String patronymic = c[2];

        char[] first = firstName.toCharArray();
        char[] second = secondName.toCharArray();
        char[] patron = patronymic.toCharArray();

        int firstLong = first.length;
        int secondLong = second.length;
        int patronLong = patron.length;

        /*
        if (firstLong >= secondLong && firstLong <= patronLong) {
            name = secondName + " " + firstName + " " + patronymic;
        }
        if (firstLong <= secondLong && firstLong >= patronLong) {
            name = patronymic + " " + firstName + " " + secondName;

        }
        if (secondLong >= firstLong && secondLong <= patronLong) {
            name = firstName + " " + secondName + " " + patronymic;
        }
        if (secondLong <= firstLong && secondLong >= patronLong) {
            name = patronymic + " " + secondName + " " + firstName;
        }

        if (patronLong >= secondLong && patronLong <= firstLong) {
            name = secondName + " " + patronymic + " " + firstName;
        }
        if (patronLong <= secondLong && patronLong >= firstLong) {
            name = firstName + " " + patronymic + " " + secondName;

        }

     */


        return name;


    }
}



