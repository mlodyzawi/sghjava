import java.util.ArrayList;
import java.util.Scanner;

class sgh {
    // static void student() {
    //     Scanner Obj1 = new Scanner(System.in);
    //     System.out.println("Wprowadź swoje inicjały:");
    //     String initials = Obj1.nextLine();
    //     Scanner Obj2 = new Scanner(System.in);
    //     System.out.println("Wprowadź numer indeksu:");
    //     String studentNumber = Obj2.nextLine();
    //     int x = 0;
    //     ArrayList<String> dane = new ArrayList<String>();
    //     while (x < 2) {
    //         if (x < 1) {
    //             dane.add(initials.toLowerCase());
    //         } else {
    //             dane.add(studentNumber);
    //         }
    //         x++;
    //     }
    //     System.out.println("\nAdres e-mail:");
    //     System.out.println(dane.get(0) + dane.get(1) + "@student.sgh.waw.pl\n");
    //     in.close();
    //     Obj1.close();
    //     Obj2.close();
    // }
    static void oceny() {
        System.out.println("Oceny mozliwe do uzyskania:");
        for (float i = 2f; i <= 5.5f; i=i+0.5f) {
            if (i != 2.5f) {
                if (i * 2 % 2 == 1) {
                    System.out.println(i);
                } else {
                    System.out.println((int)i);
                }
            }
        }
        System.out.println();
    }
    static void srednia() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość swoich ocen:");
        Integer o = in.nextInt();

        System.out.println("Podaj swoje oceny:");
        ArrayList<Integer> listaOcen = new ArrayList<Integer>();
        Integer i = 0;
        while (i < o) {
            listaOcen.add(in.nextInt());
            i++;
        }
        Integer sum = 0;
        Integer avg = 0;
        for(int a = 0; a < listaOcen.size(); a++) {
        sum = sum + listaOcen.get(a);
        avg = sum / listaOcen.size();
        }

        Scanner Obj1 = new Scanner(System.in);
        System.out.println("Wprowadź swoje inicjały:");
        String initials = Obj1.nextLine();

        Scanner Obj2 = new Scanner(System.in);
        System.out.println("Wprowadź numer indeksu:");
        String studentNumber = Obj2.nextLine();

        int x = 0;
        ArrayList<String> dane = new ArrayList<String>();
        while (x < 2) {
            if (x < 1) {
                dane.add(initials.toLowerCase());
            } else {
                dane.add(studentNumber);
            }
            x++;
        }
        System.out.println("\nAdres e-mail:");
        System.out.println(dane.get(0) + dane.get(1) + "@student.sgh.waw.pl\n");
        in.close();
        Obj1.close();
        Obj2.close();
        System.out.println("Twoja średnia ocen: " + avg);
    }
    public static void main(String[] args) {
        oceny();
        srednia();
        // student();
    }
}
