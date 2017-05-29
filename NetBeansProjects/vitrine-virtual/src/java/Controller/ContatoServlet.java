package Controller;

import BancoDeDados.BancoDeDados;
import Model.Mensagem;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ContatoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        Mensagem mensagem = new Mensagem();
        BancoDeDados bd = (BancoDeDados) getServletContext().getAttribute("BancoDeDados");
        
        mensagem.setCodigo(Integer.toString(mensagem.getQuantidade()));
        mensagem.setNome(request.getParameter("nome"));
        mensagem.setEmail(request.getParameter("email"));
        mensagem.setMensagem(request.getParameter("msg"));
        HttpSession session = request.getSession();
        session.removeAttribute("alerta");
        bd.getMensagens().add(mensagem);
        
        if(mensagem.getNome()!=null){
                session.setAttribute("alerta", "Sua mensagem foi enviada com sucesso!");
                RequestDispatcher rd = request.getRequestDispatcher("/contato.jsp");
                rd.forward(request, response);
    }
        

  /*  @Override
    public String getServletInfo(){
        return "Contato Servlet";
    }// </editor-fold>

}*/
 }
}
