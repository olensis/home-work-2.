public class Main {
    public static void main(String[] args) {
        byte monkey = 28;
        short money = 31500;
        int apples = 100200;
        long cats = 50120005;
        System.out.println( " переменные " + money);
        System.out.println (" переменные " + monkey);
        System.out.println (" переменные " + apples);
        System.out.println (" переменные " + cats);

        double weight = 145.2496475;
        float potatoes = 5.5f;
        System.out.println( " переменные " + weight);
        System.out.println( " переменные " + potatoes);


        float oneBoxer = 78.2f;
        float twoBoxer = 82.7f;
        float totalWeight = oneBoxer + twoBoxer;
        System.out.println ("Общий вес двух бойцов "+ totalWeight+ " кг");
        float weightDifference = oneBoxer - twoBoxer;
        System.out.println ( "Разница в весе двух бойцов" + weightDifference);
        float Difference = ( oneBoxer - twoBoxer)  % totalWeight;
        System.out.println ( "Разница в весе двух бойцов теперь " + Difference + " кг");













    }
}