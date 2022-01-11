package day21_ForEachLoopIntro.Tasks;

public class OverLoadingMaxNumber {
    public static void main(String[] args) {

                int a[] = {10, 4, 58, 63, 24, 74, 2};
                System.out.println(max(a));

                double h[] = {10.5, 4, 58.6, 63, 24.4, 74, 2.2};
                System.out.println(max(h));

                long b[] = {108, 4000, 5832, 63, 24, 7400, 200000};
                System.out.println(max(b));

                float j[] = {1.5F, 4, (float) 58.6, 63, (float) 24.4, 74, (float) 2.2};
                System.out.println(max(j));
            }

            public static int max(int[] a) {
                int max = a[0];
                for (int i = 0; i < a.length; i++) {
                    if (max < a[i]) {
                        max = a[i];
                    }
                }
                return max;
            }

            public static double max(double[] a) {
                double max = a[0];
                for (int i = 0; i < a.length; i++) {
                    if (max < a[i]) {
                        max = a[i];
                    }
                }
                return max;
            }

            public static long max(long[] a) {
                long max = a[0];
                for (int i = 0; i < a.length; i++) {
                    if (max < a[i]) {
                        max = a[i];
                    }
                }
                return max;
            }

            public static float max(float[] a) {
                float max = a[0];
                for (int i = 0; i < a.length; i++) {
                    if (max < a[i]) {
                        max = a[i];
                    }
                }
                return max;
            }
        }


