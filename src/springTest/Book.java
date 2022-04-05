package springTest;

import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.List;
//value中的值可以不写，默认值是类的名称且首字母小写
@Component(value = "userBook")
public class Book {
    private String Bname;
    private String Author;
    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookList=" + bookList +
                '}';
    }

    public void setBname(String Bname){
        this.Bname = Bname;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }

    public String getBname(){
        return this.Bname;
    }
    @Test
    public void test1(){
        System.out.println(Bname + ":" + Author);
    }
}
