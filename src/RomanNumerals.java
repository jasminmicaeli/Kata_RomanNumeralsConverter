public class RomanNumerals {

    public String convert(int number){
        String[]        romanNumbers                = {"M", "D", "C", "L", "X", "V", "I"};
        int[]           correspondingIndianNumerals = {1000, 500, 100, 50, 10, 5, 1};
        StringBuilder   stringBuilder               = new StringBuilder();

        for(int index = 0; index < romanNumbers.length; index++){
            if(number >= correspondingIndianNumerals[index]){
                stringBuilder.append(romanNumbers[index]);
            }
        }
        return stringBuilder.toString();
    }
}
