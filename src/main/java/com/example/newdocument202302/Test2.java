package com.example.newdocument202302;

import com.example.newdocument202302.dto.Teacher;
import com.example.newdocument202302.dto.UserDTO;
import org.junit.Test;

public class Test2 {


    /**
     * 构造器调用
     */
    @Test
    public void one(){
        UserDTO userDTO = new UserDTO();
        UserDTO userDTO1 = new UserDTO("姓名", "999", "男");
    }


    /**
     * 没有实现toString方法：返回对象的地址值
     *
     * 实现了toString方法：返回对象的具体值
     */
    @Test
    public void two(){
        UserDTO userDTO = new UserDTO();
        System.out.println("学生对象没有实现tostring方法=" + userDTO);

        Teacher teacher = new Teacher();
        System.out.println("老师对象实现了tostring方法" + teacher);

    }

    /**
     * Object的clone()方法使用
     */
    @Test
    public void three(){
        UserDTO userDTO = new UserDTO("姓名1","9991","男1");
        System.out.println(userDTO);
        UserDTO clone = (UserDTO)userDTO.clone();
        clone.setSex("女");
        clone.setUserName("姓名女");
        clone.setUserId("888");
        System.out.println(userDTO);
        System.out.println("复制后的对象==" + clone);
    }

}
