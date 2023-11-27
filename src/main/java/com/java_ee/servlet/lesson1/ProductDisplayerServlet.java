package com.java_ee.servlet.lesson1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductDisplayerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product[] products = new Product[10];
        for (int i = 0; i < products.length ; i++) {
            products[i] = new Product();
        }

        resp.getWriter().printf("<html><body>");

        for (int i = 0; i < products.length; i++) {
            resp.getWriter().printf("<h1>" + products[i].getTitle() + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
    }
}
