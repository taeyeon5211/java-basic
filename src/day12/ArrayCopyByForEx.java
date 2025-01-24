package day12;

public class ArrayCopyByForEx {

    public static void main(String[] args) {
        //길이가 3인 배열 생성 후 초기화 : oldIntArray
        //길이가 5인 배열 생성 후 길이가 3인 배열의 항목들을 옯겨야 한다.
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];
        int[] newIntArray2 = new int[5];

        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        //길이가 5인 배열에 옮긴 항목들이 잘 옮겨 졌는지 항목을 확인(출력)
        for (int i : newIntArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        //자바 API System클래스에서 제공하는 arraycopy()를 이용한 방법
        System.arraycopy(oldIntArray, 0, newIntArray2, 0, oldIntArray.length);
        for (int i : newIntArray2) {
            System.out.print(i + " ");
        }
    }
}
