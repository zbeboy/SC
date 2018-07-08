package top.zbeboy.sc.sso2.pojos;

public class OptResult {
    private int status;
    private String msg;
    private Users users;

    public OptResult() {
    }

    public OptResult(int status, String msg, Users users) {
        this.status = status;
        this.msg = msg;
        this.users = users;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
