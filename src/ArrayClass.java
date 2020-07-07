public class ArrayClass {
    public static void main(String... args){
//        int[] array = new int[10];
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        int sum = 0;
        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter = 0; counter<array.length; counter++) {
//            if(counter == 7 || counter == 9){
//                continue;
//            }
            System.out.printf("%5d%8d%n", counter, array[counter]);
            sum+=array[counter];
        }
        System.out.println(sum);
    }
}
