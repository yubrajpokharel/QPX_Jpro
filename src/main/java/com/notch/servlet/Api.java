package com.notch.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.api.client.util.ArrayMap;
import com.google.common.net.MediaType;
import com.google.gson.Gson;
import com.notch4.core.Core;



/**
 * Created by yubraj on 4/16/16.
 */
@WebServlet(name = "Api", urlPatterns = {"/Api"})
public class Api extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("inside the servlet");


        try {
            ArrayMap<String, Object> map = Core.getData();
            System.out.println(map);
            write(response, map);
        } catch (Exception ex) {
            Logger.getLogger(Api.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void write(HttpServletResponse response, ArrayMap<String, Object> map) throws IOException{
        response.setContentType(String.valueOf(MediaType.JSON_UTF_8));
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new Gson().toJson(map));
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
