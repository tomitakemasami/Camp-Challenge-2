/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 *
 */
public class Challenge3_8 extends HttpServlet {
//課題8:先にInteger limit=2を定義しておき、
//課題7の処理のうち2人目(limitで定義した値の人数)まででループ処理を抜けるようにする。
    
HashMap<String, String> ID(int ID){    
HashMap<String, String> IDMap;
    IDMap = new HashMap<>();

    switch (ID) {
        case 001:
            IDMap.put("ID","001");
            IDMap.put("名前","ジョセフ・G・ニュートン");
            IDMap.put("生年月日","1991年?月?日");
            IDMap.put("出身","ローマ");
            break;
        case 002:
            IDMap.put("ID","002");
            IDMap.put("名前","アドルフ・ラインハルト");
            IDMap.put("生年月日","1988年12月25日");
            IDMap.put("出身",null);
            break;
        case 003:
            IDMap.put("ID","003");
            IDMap.put("名前","シルヴェスター・アシモフ");
            IDMap.put("生年月日","1964年5月5日");
            IDMap.put("出身","ロシア");
            break;
        default:
            break;
    }

return IDMap; 

}     
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

Integer limit=2;

for (int i = 1; i <= 3; i++) {
            HashMap ID = ID(i);
            if (ID.get("名前") == null) {
                continue;
            } else {
                out.print(ID.get("名前") + "<br>");
            }
            if (ID.get("生年月日") == null) {
                continue;
            } else {
                out.print(ID.get("生年月日") + "<br>");
            }
            if (ID.get("出身") == null) {
            } else {
                out.print(ID.get("出身") + "<br>");
            }
            out.print("<br>");
           
            if(limit == i){
            break;}
        }



            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
