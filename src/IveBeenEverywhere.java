import java.util.*;

public class IveBeenEverywhere {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        List<Integer> numCities = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            Set<String> cities = new HashSet<>();
            int n = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < n; j++) {
                String city = sc.nextLine();
                cities.add(city);

            }
            numCities.add(cities.size());
        }
        for (int num : numCities) {
            System.out.println(num);
        }
        //numCities.forEach(num -> System.out.println(num));
        //numCities.forEach(System.out::println);
    }
}
