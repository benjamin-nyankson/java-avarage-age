//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
int sum = 0;

        for (int age : ages) {
            sum += age;
        }

float average = (float) sum / ages.length;
        System.out.println("sum: " + sum);
        System.out.println("average: " + average);

    }
}