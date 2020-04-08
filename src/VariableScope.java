public class VariableScope {
    int globalScope = 10;
    static int staticValue = 15;
    int value2;

    public void scopeTest(int value) {
        int localScope = 20;

      //  static int value2 = 1;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(staticValue);
    }

    public static void main(String[] args) {
        System.out.println(staticValue);

        VariableScope v1 = new VariableScope();
        VariableScope v2 = new VariableScope();
        v1.value2 = 3;
     //   value2 = 3;
        staticValue = 2;
        v1.staticValue = 3;
        v1.globalScope = 3;
        v1.staticValue = 4;
        v2.globalScope = 5;
        v2.staticValue = 7;

        System.out.println("v1:"+v1.globalScope+" "+v1.staticValue);
        System.out.println("v2:"+v2.globalScope+" "+v2.staticValue);

    }


}


