public class Calculate {
    public static void main(String[] args) {

        double x = Double.parseDouble((args[1]));
        double y = Double.parseDouble((args[2]));

        switch (args[0]){
            case "somar" ,"sum" -> {
                sum(x, y);
                break;
            }
            case "multiplicar", "multiply" -> {
                multiply(x, y);
                break;
            }
            case "dividir", "divide" -> {
                divide(x, y);
                break;
            }
            case "subtrair", "subtract" -> {
                subtract(x, y);
                break;
            }default -> {
                System.out.println("There is an error or this operation does not exist.");
            }

        }
    }
    static void sum(double x, double y) {
        System.out.println(x + y);
    }

    static void multiply(double x, double y) {
        System.out.println(x * y);
    }

    static void divide(double x, double y) {
        System.out.println(x / y);
    }

    static void subtract(double x, double y) {
        System.out.println(x - y);
    }
}
