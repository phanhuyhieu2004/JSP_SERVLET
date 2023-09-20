package Buoi2;

public class Calculate {

    public static float calculate(float firstNumber, float secondNumber, char operate){
        switch (operate){
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;

            case '*':
                return firstNumber*secondNumber;
            case '/':
            if (secondNumber != 0) {
                return  firstNumber/secondNumber;
            }

            else
                System.out.println("Không thể chia cho 0");
            default:
throw     new RuntimeException();
        }

    }

}
