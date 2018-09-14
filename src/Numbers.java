public class Numbers {
    public static void main(String[] args) {
        System.out.println(eachNth("Miracle", 2));
        System.out.println(eachNth("Nataliya", 3));
        System.out.println(eachNth("Like_to_snoword", 4));

    }

    public static String eachNth(String x, int n) {
        String result = "";

        for (int i = 0; i < x.length(); i = i + n) {
            result = result + x.charAt(i);
        }


        return result;
    }

}
