import java.util.Scanner;


public class dodaj {
    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() * 10) + 1;
        int randomNumbery = (int) (Math.random() * 10) + 1;

        String op = Math.random() > 0.5 ? "+" : "-";
        if (randomNumber<randomNumbery){
            op = "+";
        }

       /*String op;
        if (Math.random() > 0.5 )
        {
            op = "+";
        }
        else
        {
            op = "-";
        }*/

        boolean Wygral = false;
        System.out.println("Wybralem dla ciebie dwie liczby");
        System.out.println("Znajdz wynik");
        System.out.print(randomNumber);
        System.out.print( op );

        System.out.println(randomNumbery);
        Scanner scanner = new Scanner(System.in);
        for (int i = 5; i > 0; i--) {
            System.out.println("Zostalo Ci jeszcze " + i + " prob");
            int zgadnij = scanner.nextInt();

            int wynik = op.equals("+") ? randomNumber + randomNumbery : randomNumber - randomNumbery;

            if ( wynik == zgadnij ) {
                System.out.println("Mikolaj Wygral");
                Wygral = true;
                break;
            }

             else {
                System.out.println("Buuuu");
            }
            }


        }
    }
