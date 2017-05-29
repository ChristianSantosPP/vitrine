package Controller;

import BancoDeDados.BancoDeDados;
import Model.Endereco;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Model.Telefone;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CadastrarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            BancoDeDados bd = (BancoDeDados) getServletContext().getAttribute("BancoDeDados");
           
            HttpSession session = request.getSession();

            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String cnpj = request.getParameter("cnpj");
            String email = request.getParameter("email");
            String login = request.getParameter("user");
            String senha = request.getParameter("senha");
//            String rua = request.getParameter("rua");
//            String complemento = request.getParameter("comp");
//            String cep = request.getParameter("cep");
//            int numero = Integer.parseInt(request.getParameter("num"));
//            String bairro = request.getParameter("bairro");
//            String cidade = request.getParameter("cidade");
//            String estado = request.getParameter("estado");
//            String fone = request.getParameter("fone");
//            String celular = request.getParameter("cel");

            Usuario usuario = new Usuario();
            Endereco endereco = new Endereco();
            Telefone telefone = new Telefone();
            PessoaFisica pf = new PessoaFisica();
            PessoaJuridica pj = new PessoaJuridica();
            /* Lógica de Geração dos Ids de usuário */
            long id;
            int ultimousuario;

            if (bd.getUsuarios().size() > 0) {
                ultimousuario = bd.getUsuarios().size() - 1;
                id = bd.getUsuarios().get(ultimousuario).getId() + 1;
            } else {
                id = 1;
            }

            /* Criação do Usuario no Banco */
            usuario.setId(id);
            usuario.setLogin(login);
            usuario.setSenha(senha);
            usuario.setEmail(email);
            session.setAttribute("usuario",usuario );
            endereco.setIdUsuario(id);
//            endereco.setRua(rua);
//           endereco.setBairro(bairro);
//            endereco.setCidade(cidade);
//            endereco.setEstado(estado);
//            endereco.setComplemento(complemento);
//            endereco.setNumero(numero);
//            endereco.setCep(cep);
//            session.setAttribute("endereco",endereco );
 //           telefone.setIdUsuario(id);
//            telefone.setTelefone(fone);
//            telefone.setCelular(celular);
//             session.setAttribute("telefone",telefone );
             
            if (cpf == null) {
               
                usuario.setTipo("PJ");
                pj.setIdUsuario(id);
                pj.setCnpj(cnpj);
                pj.setRazaoSocial(nome);
                pj.setUsuario(usuario);
                bd.inserirPessoaJuridica(pj);
                session.setAttribute("pj", pj);
            } else {
               
                usuario.setTipo("PF");
                pf.setIdUsuario(id);
                pf.setNome(nome);
                pf.setCpf(cpf);
                pf.setUsuario(usuario);
                pf.setAcesso("DEFAULT");
                bd.inserirPessoaFisica(pf);
                session.setAttribute("pf", pf);
                
            }
            
             bd.inserirUsuario(usuario);
             
             RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/exibirdados.jsp");
             rd.forward(request, response); 
            
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Cadastro Servlet";
    }// </editor-fold>

}
