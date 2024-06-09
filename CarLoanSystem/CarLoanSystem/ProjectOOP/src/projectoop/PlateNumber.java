package projectoop;

import java.util.Random;

public class PlateNumber {

    public String Noplate;

    public void setNoplate(String Noplate) {
        this.Noplate = Noplate;
    }

    public String getNoplate() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        StringBuilder randomString = new StringBuilder();
        StringBuilder randomNumber = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(numbers.length());
            randomNumber.append(numbers.charAt(index));
        }
        
        Noplate = randomString.toString() + randomNumber.toString();

        return Noplate;

    }
}
