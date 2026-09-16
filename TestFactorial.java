public class TestFactorial {

    public static void main(String[] args) {

        int result = Factorial.calculate(5);

        if (result == 120) {
            System.out.println("Successfully Tested,PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}