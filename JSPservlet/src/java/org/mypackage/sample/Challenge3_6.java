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
public class Challenge3_6 extends HttpServlet {
//課題6:引き数に1つのid(数値)をとり、
//3人分のプロフィール(項目は課題5参照)をあらかじめメソッド内で定義しておく。
//引き数のid値により戻り値として返却するプロフィールを誰のものにするか選択する。
//それ以降などは課題5と同じ扱いに
    
HashMap<String, String> ID(int ID){    
HashMap<String, String> IDMap = new HashMap<String, String>();

if(ID == 001){
IDMap.put("ID","001");
IDMap.put("名前","ジョセフ・G・ニュートン");
IDMap.put("生年月日","1991年?月?日");
IDMap.put("出身","ローマ");    

}else if(ID == 002){
IDMap.put("ID","002");
IDMap.put("名前","アドルフ・ラインハルト");
IDMap.put("生年月日","1988年12月25日");
IDMap.put("出身","ドイツ");

}else if(ID == 003){
IDMap.put("ID","003");
IDMap.put("名前","シルヴェスター・アシモフ");
IDMap.put("生年月日","1964年5月5日");
IDMap.put("出身","ロシア");
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

HashMap ID = ID(003);
out.print(ID.get("名前") + "<br>" + ID.get("生年月日") + "<br>" + ID.get("出身") + "<br>");


            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + "</h1>");
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
