public class Arithmetic {
    public int a;

    public int b;

    public Arithmetic(int firstNum, int secondNum) {
        this.a = firstNum;
        this.b = secondNum;
    }

    public void Addition () {
        int calculationResult = a + b;
        System.out.println("Сумма чисел = " + calculationResult);
    }

    public void Muptiplication () {
        int calculationResult = a * b;
        System.out.println("Результат умножения = " + calculationResult);
    }

    public void Extremes () {
        if (a > b) {
            System.out.println("Наибольшее число = " + a);
            System.out.println("Наименьшее число = " + b);
        } else if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Наибольшее число = " + b);
            System.out.println("Наименьшее число = " + a);
        }
    }

}
