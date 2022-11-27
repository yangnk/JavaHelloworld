package reflect.reflect;

import javax.annotation.Resource;

@Resource
public class Student {
    int id;
    String name;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
