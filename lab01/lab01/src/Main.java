import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        //double wynik = ((9.5*4.5)-(2.5*3))/(45.5-3.5);
        //System.out.println("Result: " + wynik);

        //Zadanie 2
        //Scanner scanner = new Scanner(System.in);
        //int input = scanner.nextInt();
        //double fahrenheit = (9.0f/5.0f)*input+32;
        //String formatted = String.format("%.1f", fahrenheit);
        //System.out.println(input + " stopnie Celsjusza to " + formatted + "F");

        //Zadanie 3
        //for (int i = 1; i <= 10; i++) {
        //    System.out.println("Miles - Kilometres");
        //    System.out.println(i + " - " + i*1.609);
        //}

        //Zadanie 4
        //Scanner scanner = new Scanner(System.in);
        //int input = scanner.nextInt();
        //switch(input) {
        //    case 1:
        //        System.out.println("Monday");
        //        break;
        //        case 2:
        //            System.out.println("Tuesday");
        //            break;
        //            case 3:
        //                System.out.println("Wednesday");
        //                break;
        //                case 4:
        //                    System.out.println("Thursday");
        //                    break;
        //                    case 5:
        //                        System.out.println("Friday");
        //                        break;
        //                        case 6:
        //                            System.out.println("Saturday");
        //                            break;
        //                            case 7:
        //                                System.out.println("Sunday");
        //                                break;
        //                                default:
        //                                    System.out.println("Invalid input");
        //}

        //Zadanie 5
        //Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        //String[] table = new String[size];
        //for (int i = 0; i < size; i++) {
        //    table[i] = scanner.next();
        //}

        //for (int i = 0; i < size; i++) {
        //    System.out.print(table[i]);
        //}

        //Zadanie 6
        //Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        //int firstElement = scanner.nextInt();

        //int[] array = new int[size];
        //array[0] = firstElement;

        //if (array[0] % 2 == 0) {
        //    array[1] = array[0] + 2;
        //} else {
        //    array[1] = array[0] + 1;
        //}

        //for (int i = 2; i < size; i++) {
        //    array[i] = array[i-1] + 2;
        //}

        //for (int i = 0; i < size; i++) {
        //    System.out.println(array[i]);
        //}

        //System.out.println("Min: " + smallestElement(array));
        //System.out.println("Max: " + largestElement(array));
        //System.out.println("Sum: " + sumOfAllElements(array));
        //System.out.println("Average: " + averageValue(array));
        //System.out.println("Median: " + countMedian(array));

        //Zadanie 7
        //Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        //int b = scanner.nextInt();

        //System.out.println("NMD" + euklides(a, b));
    }

    public static int smallestElement(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int largestElement(int[] array) {
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int sumOfAllElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int averageValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum/array.length;
        return average;
    }

    public static double countMedian(int[] array) {
        return array.length/2;
    }

    public static double euklides (int a, int b) {
        int NWD = 0;
        while (true) {
            if (a == 0 || b == 0) {
                break;
            } else if (a > b) {
                a %= b;
            } else {
                b %= a;
            }

            if (a == 0) {
                NWD = b;
            } else {
                NWD = a;
            }
        }

        return NWD;
    }
}