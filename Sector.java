// kendrika kandayaka vargapalaya

import java.util.Scanner;

class Sector {
    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        System.out.println("Entr Radius");
        Double r = Values.nextDouble();

        System.out.println("Enter Angle");
        Double angle = Values.nextDouble();

        Double Area = (Math.PI * Math.pow(r, 2) * angle) / 360;
        System.out.println("Your Sector Area is" + " " + Area);

    }
}
