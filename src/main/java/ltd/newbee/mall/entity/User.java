package ltd.newbee.mall.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主鍵
     */
    private Integer id;

    /**
     * 登錄名
     */
    private String name;

    /**
     * 密碼
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
