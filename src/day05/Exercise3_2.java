package day05;

public class Exercise3_2 {
    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket;
        if (numOfApples % sizeOfBucket != 0) {
            numOfBucket++;
        }
        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }
}
