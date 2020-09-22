public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {

            System.out.println("Invalid Value");
        } else {
            String stars;
            for (int i=1; i<=number; i++) {
                stars="";
                for (int j=1; j<=number; j++) {
                    if (i== 1 || i==number || i==j || j==1 || j==number || j==number-(i-1)) {
                        stars+="*";
                    } else {
                        stars+=" ";

                    }

                }
                System.out.println(stars);
            }
        }
    }
}
