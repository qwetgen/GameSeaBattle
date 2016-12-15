import java.util.ArrayList;

/**
 * Created by LENOVO X230 on 05.12.2016.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum =  (int)((Math.random() * 5));

        ArrayList<String> location = new ArrayList<String>();

        location.add(Integer.toOctalString(randomNum));
        location.add(Integer.toString(randomNum + 1));
        location.add(Integer.toString(randomNum + 2));

        theDotCom.setLocationCells(location);


        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourSelf(guess);

            numOfGuesses++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }

    }
}
