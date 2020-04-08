public class BizService {
    public void bizMethod(int i) throws BizException{
        System.out.println("biz method start");
        if(i<0) {
            throw new BizException("Biz Exception 발생");
        }
        System.out.println("biz method stop");
    }

    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(0);
    }
}
