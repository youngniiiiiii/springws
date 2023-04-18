package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class ProductInsertTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service =
                (MyService<String, ProductDTO>) factory.getBean("pservice");

        //insert test
        ProductDTO p = new ProductDTO("id01", "bag01", 30000,10);
        service.register(p);

        //delete test
        String id = "id01";
        service.remove(id);

        //update test
        service.modify(p);

        //select test
        ProductDTO p1 = service.get(id);
        System.out.println(p1);

        //selectAll test
        List<ProductDTO> list = new ArrayList<>();
        list = service.get();
        System.out.println(list);
    }
}
