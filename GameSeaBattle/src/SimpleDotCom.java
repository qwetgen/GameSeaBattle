import java.util.ArrayList;

/**
 * Created by LENOVO X230 on 05.12.2016.
 */
public class SimpleDotCom {

    ArrayList<String> locationCells = new ArrayList<String>();

    void setLocationCells(ArrayList<String> locs){

        locationCells = locs;

    }

    String checkYourSelf(String intUser){
       // int guess = Integer.parseInt(stringGuess);//преобразуем строку в число
        String result = "Мимо";//присваиваем значение результата по умолчанию (результат в случаи промаха)
        int index = locationCells.indexOf(intUser);

        if(index >= 0){
            locationCells.remove(index);
            result = "Попал";
        }
        if(locationCells.isEmpty()){
            result = "Потопил";
        }

        System.out.println(result);
        return result;
    }
}
