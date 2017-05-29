package Controller;

import BancoDeDados.BancoDeDados;
import Model.Carrinho;
import Model.Item;
import Model.Produto;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CarrinhoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<Item> itens = new ArrayList<Item>();
        BancoDeDados bd = (BancoDeDados) getServletContext().getAttribute("BancoDeDados");
        List<Produto> produtos = bd.getProdutos();
        String codigo = (String) request.getParameter("codigo");
        Produto novoProduto;

        if (session.getAttribute("carrinho") == null) {
            Carrinho carrinho = new Carrinho();
            carrinho.setItens(itens);
            carrinho.setValorTotal(itens);
            session.setAttribute("carrinho", carrinho);
        }
        Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");
        if (session.getAttribute("usuario") != null) {
            Usuario usuario = (Usuario) session.getAttribute("usuario");
            carrinho.setUsuario(usuario);
        }

        for (int i = 0; i < produtos.size(); i++) {

            if (produtos.get(i).getCodigo().equals(codigo)) {
                novoProduto = produtos.get(i);

                if (carrinho.getItens().isEmpty()) {
                    Item item = new Item();
                    item.setProduto(novoProduto);
                    carrinho.adicionarItem(item);
                    carrinho.setValorTotal(carrinho.getItens());
                    session.setAttribute("carrinho", carrinho);
                } else {
                    boolean estaNaLista = false;
                    int cont = 0;
                    for (Item itemcarrinho : carrinho.getItens()) {
                        if (itemcarrinho.getProduto().equals(novoProduto)) {
                            carrinho.getItens().get(cont).incrementar();
                            carrinho.setValorTotal(carrinho.getItens());
                            session.setAttribute("carrinho", carrinho);
                            estaNaLista = true;
                            break;
                        }
                        cont++;
                    }
                    if (!estaNaLista) {
                        Item item = new Item();
                        item.setProduto(novoProduto);
                        carrinho.adicionarItem(item);
                        carrinho.setValorTotal(carrinho.getItens());
                        session.setAttribute("carrinho", carrinho);
                    }
                }
                break;
            }
        }

        if (session.getAttribute("usuario") == null) {

            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        } else {

            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/logado.jsp");
            rd.forward(request, response);

        }
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
