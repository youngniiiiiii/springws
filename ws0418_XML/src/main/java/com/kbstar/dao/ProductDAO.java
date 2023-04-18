package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements MyDao<String, ProductDTO> {

    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle:"+ productDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted Oracle:"+ s);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle:"+ productDTO);
    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO("id01", "bag01",30000,10);
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>();
        list.add( new ProductDTO("id01", "bag01",30000, 10));
        list.add( new ProductDTO("id02", "bag02",50000, 20));
        list.add( new ProductDTO("id03", "bag03",70000, 30));
        return list;
    }
}
