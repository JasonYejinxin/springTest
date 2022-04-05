package springTest;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springTest.Book;

public class TestDemo {

    @Test
    public void test1() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Book book = (Book)context.getBean("book", "Book.class");
        System.out.println(book);
        book.test1();

    }
    @Test
    public void  test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order orders = (Order) context.getBean("orders","Order.class");
        System.out.println(orders);
        orders.test1();
    }


}
