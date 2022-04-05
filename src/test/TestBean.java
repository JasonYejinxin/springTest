package test;

import classTest.Course;
import classTest.Stu;
import config.SpringConfig;
import dept_emp.Employees;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import springTest.Book;

public class TestBean {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");

        //创建对象
        UserService userService = (UserService) context.getBean("userService","UserService.class");
        userService.add();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employees emp = (Employees) context.getBean("emp","Employees.class");
        emp.test1();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Stu stu = (Stu)context.getBean("stu","Stu.class");
        stu.test1();
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Book books = (Book) context.getBean("book","Book.class");
        System.out.println(books.toString());
    }
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Course course = (Course) context.getBean("myBean","Course.class");
        System.out.println(course);
    }
    @Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        Book book = context.getBean("userBook",Book.class);
        System.out.println(book);
    }
    @Test
    public void test7(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //创建对象
        UserService userService = (UserService) context.getBean("userService","UserService.class");
        userService.add();
    }

}
