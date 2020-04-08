public class BizException extends RuntimeException {
    /**
     * 사용자 정의 Exception
     * @param msg
     */
    public BizException(String msg) {
        super(msg); //부모에게 매개변수 전달

    }
    public BizException(Exception ex) {
        super(ex);
    }

}
