public class Numero {

    public static void dividir(int a, int b) {
        int result = 0;
        boolean hasError = false;
        try {
            result = a / b;
        } catch (Exception e) {
            hasError = true;
        } finally {
            if (!hasError) {
                System.out.printf("%d / %d = %d\n", a, b, result);
            } else {
                System.out.println("Nao eh possivel dividir por zero");
                System.out.printf("%d / %d = %d\n", a, b, 0);
            }
            
        }
    }

}
