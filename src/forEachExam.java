public class forEachExam {
    public static void main(String[] args) {
        int[] iarr = {10,20,30,40,50};

        for(int i=0;i<iarr.length;i++) {
            System.out.println(iarr[i]);
        }

        for(int i:iarr) {
            System.out.println(i);
        }
    }
}
