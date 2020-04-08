public class switchExam {
    public static void main(String[] args) {
        int value = 5;

        switch(value) {
            case 1:
                System.out.println("case:1");
                break;
            case 2:
                System.out.println("case:2");
                break;
            case 3:
                System.out.println("case:3");
                break;
            default:
                System.out.println("Others");
        }

        String str = "A";
        switch(str) {
            case "A":
                System.out.println("case:A");
                break;
            case "B":
                System.out.println("case:B");
            default:
                System.out.println("not");
        }
    }
}
