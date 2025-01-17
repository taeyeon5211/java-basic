package day08;

public class StringPerformEx {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                sb1.append(1);
                sb2.append(1);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                sb1.append(1);
                sb2.append(1);
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("StringBuffer.length: " + sb1.length());
                System.out.println("StringBuilder.length: " + sb2.length());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
