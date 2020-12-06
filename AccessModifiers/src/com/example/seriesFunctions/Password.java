package com.example.seriesFunctions;

public class Password {

    private static final int key = 788945644;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encrypt(encryptedPassword);
    }

    private int encrypt(int password) {

        return password ^ key;
    }

   public final void storePassword() {

       System.out.println("Saving password as " + this.encryptedPassword);
   }
   public boolean letMeIn(int password) {

        if (encrypt(password) == this.encryptedPassword) {

            System.out.println("Welcome");
            return true;
        } else {

            System.out.println("Nope, you cannot come in");
            return false;
        }
   }
}
