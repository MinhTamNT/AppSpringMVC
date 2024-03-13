/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mt.hibernatedemo;

import com.mt.pojo.Category;
import com.mt.resposity.impl.ProductReponsitoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
//        try(Session s = HiberateUtils.getFactory().openSession()) {
//          Query q = s.createQuery("From Category");
//          List<Category> category = q.getResultList();
//          category.forEach(p -> System.out.println(p.getName()));
//         
//        } catch (Exception e) {
//        }
        
        
        ProductReponsitoryImpl s = new ProductReponsitoryImpl();
        Map<String, String> params = new HashMap<>();
        params.put("kw", "Galaxy");
        params.put("fromPrice", "18000000");
        params.put("toPrice", "20000000");
  
        s.getProducts(params).forEach(p -> System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice()));
    }
}
