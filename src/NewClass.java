public class NewClass {
    private int firstNumber;
    private int secondNumber;

    public NewClass(int firstNumber, int secondNumber)
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add(){
        return firstNumber + secondNumber;
    }

    public int subtract(){
        return firstNumber - secondNumber;
    }

    public int multiply()
    {
        return firstNumber * secondNumber;
    }

    public double devide(){
        double result = (double) firstNumber / (double) secondNumber;
        return result;
    }
}
