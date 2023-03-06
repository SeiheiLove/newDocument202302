package com.example.newdocument202302.dto;

public class UserDTO implements Cloneable {

    /**
     * 空参构造器
     */
    public UserDTO(){
        System.out.println("执行空参构造器");
    }

    /**
     * 有参构造器
     * @param userName
     * @param userId
     * @param sex
     */
    public UserDTO(String userName,String userId,String sex){
        System.out.println("执行有参构造器");
        this.userName = userName;
        this.userId = userId;
        this.sex = sex;
    }

    private String userName;
    private String sex;
    private String userId;

    /**
     * Object 的clone()使用
     * @return
     */
    public Object clone(){
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
