package Controller;

import BancoDeDados.BancoDeDados;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String login = request.getParameter("usr");
            String senha = request.getParameter("psw");
            HttpSession session = request.getSession();
            session.removeAttribute("falhalogin");
            BancoDeDados bd = (BancoDeDados) getServletContext().getAttribute("BancoDeDados");

            for (Usuario user : bd.getUsuarios()) {
                if (user.getLogin().equals(login) && user.getSenha().equals(senha)) {
                    session.setAttribute("usuario", user);
                    if (null != user.getTipo()) switch (user.getTipo()) {
                        case "PF":
                            for (PessoaFisica pf : bd.getPfs()) {
                                if (pf.getIdUsuario() == user.getId()) {
                                    session.setAttribute("pessoa", pf);
                                }
                            }   break;
                        case "PJ":
                            for (PessoaJuridica pj : bd.getPjs()) {
                                if (pj.getIdUsuario() == user.getId()) {
                                    session.setAttribute("pessoa", pj);
                                }
                            }   break;
                    }
                    RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/logado.jsp");
                    rd.forward(request, response);
                }
            }
            if(session.getAttribute("pessoa") == null){
                session.setAttribute("falhalogin", "Falha ao Efetuar Login!");
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.forward(request, response);
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "loginServlet";
    }// </editor-fold>
}
