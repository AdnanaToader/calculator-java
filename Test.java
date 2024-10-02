public class Test {

    public static void main(String[] args) {
        String expression;
        String expectedResult;
        String actualResult;
        expression = "2+2*2-2";
        expectedResult = "4.0";

        actualResult = Calculator.Run(expression);

        if (expectedResult.equals(actualResult)){
            System.out.println("Test successfull!");
        } else{
            System.out.println("Test failed!");
        }
    }

    
}
