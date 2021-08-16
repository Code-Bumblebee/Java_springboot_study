package org.example.boot.bean;


/**
 * 用户
 */
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override  //重载方法名有问题时 会报无法重载的错误 仔细检查
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

}
