<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Vitrine Informática</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="css/padrao.css">
        <link rel="stylesheet" href="css/index.css">
        <link rel="stylesheet" href="css/checkout.css">
  </head>
  <body>
    <header>

            <!-- inicio da nav bar-->
            <nav class="navbar navbar-default" >
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="logado.jsp"><img src="img/logo.png" alt="Vitrine Informática" id="logo"></a>
                    </div>

                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span>
            <!-- nome do usuario--> <% %>
                                    <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Cadastrar Produto</a></li>
                                    <li><a href="#">Compras a separar</a></li>
                                    <li><a href="#">Status da compra</a></li>
                                </ul>
                            </li>
                            <li><a href="logadocarrinho.jsp" id="linkcarrinho"><span class="glyphicon glyphicon-shopping-cart"></span> Carrinho <span class="badge">0</span></a></li>
                            <li><a href="index.jsp" id="linksair"><span class="glyphicon glyphicon-log-in"></span> Sair </a></li>
                        </ul>
                    </div>
                </div>

                <img class="img-responsive" src="img/placamae.png" id="img" alt="Placa Mãe">
            </nav>
            <!-- fim da nav bar-->
        </header>

      <section>
<div class="container">
        <h2>Estoque</h2>

        <table class="table">
          <tr >
            <th>ID</th>
            <th>Tipo</th>
            <th>Marca</th>
            <th>Preço</th>
            <th>Qtd Disponível</th>
            <th>Qtd Mínima</th>
            <th></th>
          </tr>
          <tr class="alert alert-success">
            <td>1</td>
            <td>Processador</td>
            <td>Intel</td>
            <td>R$ 100,00</td>
            <td>20</td>
            <td>5</td>
            <td><a href="#">Editar</a></td>

          </tr>
          <tr class="alert alert-success">
            <td>2</td>
            <td>Processador</td>
            <td>AMD</td>
            <td>R$ 100,00</td>
            <td>20</td>
            <td>5</td>
            <td><a href="#">Editar</a></td>
          </tr>
          <tr class="alert alert-success">
            <td>3</td>
            <td>Placa Mãe</td>
            <td>Asus</td>
            <td>R$ 100,00</td>
            <td>20</td>
            <td>5</td>
            <td><a href="#">Editar</a></td>
          </tr>
          <tr class="alert alert-success">
            <td>4</td>
            <td>Placa Mãe</td>
            <td>Gigabyte</td>
            <td>R$ 100,00</td>
            <td>20</td>
            <td>5</td>
            <td><a href="#">Editar</a></td>
          </tr>
          <tr class="alert alert-success">
            <td>5</td>
            <td>Placa de Vídeo</td>
            <td>Nvidia</td>
            <td>R$ 100,00</td>
            <td>20</td>
            <td>5</td>
            <td><a href="#">Editar</a></td>
          </tr>
          <tr class="alert alert-warning">
            <td>6</td>
            <td>Placa de Vídeo</td>
            <td>GeForce</td>
            <td>R$ 100,00</td>
            <td>10</td>
            <td>15</td>
            <td><a href="#">Editar</a></td>
          </tr>

        </table>
      </section>

      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <footer class="container-fluid ">
            <a class="navbar-brand" href="#"><img src="img/logo.png" alt="logo"></a>
            <p>Endereço:<br/>
                Rua Dez, 560 -  Prazeres <br/>
                Jaboatão dos Guararapes - PE <br/>
            </p>
        </footer>
  </body>
</html>
