import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shark[] array = new Shark[5];
        array[0] = new Shark("akulik", 3, "34km/ch");
        array[1] = new Shark("akusya", 3, "12km/ch");
        array[2] = new Shark("akuka", 4, "18km/ch");
        array[3] = new Shark("akulamet", 8, "23km/ch");
        array[4] = new Shark("akulabek", 6, "26km/ch");
        System.out.println(Arrays.toString(array));


        Duck[] array1 = new Duck[5];


        array1 [0] = new  Duck("donald","white","8km/ch");
        array1 [1] = new  Duck("dok","yelllow","8km/ch");
        array1 [2] = new  Duck("donasdsdd","blue","9km/ch");
        array1 [3] = new  Duck("donaldaka","black","4km/ch");
        array1 [4] = new  Duck("donaldbek","lgbt","7km/ch");
        System.out.println(Arrays.toString(array1));

        Turtle[] array2 = new Turtle[5];

        array2 [0] = new Turtle("chopa",2,"3km/ch");
        array2 [1] = new Turtle("chopahan",2,"6km/ch");
        array2 [2] = new Turtle("chopabek",2,"4km/ch");
        array2 [3] = new Turtle("chopan",2,"32km/ch");
        array2 [4] = new Turtle("chopania",2,"50km/ch");
        System.out.println(Arrays.toString(array2));
    }
}
