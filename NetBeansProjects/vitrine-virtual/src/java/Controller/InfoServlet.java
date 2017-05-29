package Controller;

import BancoDeDados.BancoDeDados;
import Model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InfoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        BancoDeDados bd = (BancoDeDados) getServletContext().getAttribute("BancoDeDados");
        List<Produto> produtos = bd.getProdutos();
        HttpSession session = request.getSession(false);
        
        String codigo = request.getParameter("codigo");
        
        Produto produto;
        
        for (Produto produto1 : produtos) {
            if (produto1.getCodigo().equals(codigo)) {
                produto = produto1;
                session.setAttribute("produto", produto);
            }
        }
        
        
        RequestDispatcher rd = request.getRequestDispatcher("/infoproduto.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
