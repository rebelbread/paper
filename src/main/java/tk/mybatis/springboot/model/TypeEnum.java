package tk.mybatis.springboot.model;

/**
 * @author zhiwj
 * @date 2019/1/31
 */
public enum TypeEnum {


    SINGLE(1,"单选"),TF(2,"判断"),BLANK(3,"填空"), MUL(4,"多选"),EXPLAN(5,"解答题");

    private Integer code;
    private String msg;

    TypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
