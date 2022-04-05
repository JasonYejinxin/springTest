package classTest;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] str1;
    private Map<String,String> map;
    private Set<String> set;
    private List<String> list;
    private List<Course> courses;

    public void setStr1(String[] str1) {
        this.str1 = str1;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }



    public void test1(){
        System.out.println(list);
        System.out.println(courses);
    }
}
