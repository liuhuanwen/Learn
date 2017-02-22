package com.liuhw.learn.pattern.builder;

/**
 * Created by liuhw on 2017/2/20.
 */

public class User {

    private int id;
    private String name;
    private int age;

    public static class Builder {

        private int id = 100;
        private String name = "liuhw";
        private int age = 28;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User builder() {
            User user = new User();
            user.setId(this.id);
            user.setName(this.name);
            user.setAge(this.age);
            return user;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
