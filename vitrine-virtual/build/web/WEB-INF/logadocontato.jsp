
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Vitrine Informática</title>
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="../css/mensagem.css">
        <link rel="stylesheet" href="../css/padrao.css">
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
                        <a class="navbar-brand" href="../WEB-INF/logado.jsp"><img src="../img/logo.png" alt="Vitrine Informática" id="logo"></a>
                    </div>

                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> ${pessoa.nome}
                                    <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Conta</a></li>
                                    <li><a href="#">Compras</a></li>
                                    <li class="active"><a href="../WEB-INF/logadocontato.jsp">Mensagens</a></li>
                                </ul>
                            </li>
                            <li><a href="../WEB-INF/logadocarrinho.jsp" id="linkcarrinho"><span class="glyphicon glyphicon-shopping-cart"></span> Carrinho <span class="badge">0</span></a></li>
                            <li><a href="../index.jsp" id="linksair"><span class="glyphicon glyphicon-log-in"></span> Sair </a></li>
                        </ul>
                    </div>
                </div>

                <img class="img-responsive" src="../img/placamae.png" id="img" alt="Placa Mãe">
            </nav>
            <!-- fim da nav bar-->
        </header>

        <section>
            <div class="container-fluid" >
                <div class="form-group" id="filtro">

                    <button class="btn btn-primary">Nova Mensagem</button>
                    <button class="btn btn-danger">Excluir</button> <br/><br/>
                    
                    <label for="sel1">Filtrar Mensagens:</label>
                    <select class="form-control" id="sel1" style="width: 150px;">
                        <option value="" disabled selected hidden> </option>
                        <option value="todas">Todas</option>
                        <option value="placa">Últimas 10</option>
                        <option value="memo">Últimas 5</option>
                    </select>
                    <div class="table">          
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th><input type="checkbox" value="todas"></th>
                                    <th>Cód.</th>
                                    <th>Data</th>
                                    <th>Assunto</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td style="width: 10%;"><input type="checkbox" value="01"></td>
                                    <td style="width: 10%;">01</td>
                                    <td style="width: 20%;">01/02/2017</td>
                                    <td style="width: 40%;"><a>Dúvida sobre entrega</a></td>
                                    <td style="width: 20%;">Nova</td>
                                </tr>
                                <tr>
                                    <td style="width: 10%;"><input type="checkbox" value="02"></td>
                                    <td style="width: 10%;">02</td>
                                    <td style="width: 20%;">01/02/2017</td>
                                    <td style="width: 40%;"><a>Produto com defeito</a></td>
                                    <td style="width: 20%;">Respondida</td>
                                </tr>
                                <tr>
                                    <td style="width: 10%;"><input type="checkbox" value="03"></td>
                                    <td style="width: 10%;">03</td>
                                    <td style="width: 20%;">01/02/2017</td>
                                    <td style="width: 40%;"><a>Atraso na entrega</a></td>
                                    <td style="width: 20%;">Visalizada</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <form method="post">
                    <h2>Nova Mensagem</h2>
                    <div class="form-group">
                        <label for="assunto">Assunto:</label>
                        <input type="text" class="form-control" id="assunto" maxlength="50" pattern="[a-zA-Z\s]+" required>
                    </div>
                    <div class="form-group">
                        <label for="msg">Mensagem:</label>
                        <textarea class="form-control" id="msg" rows="5" required></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Enviar</button>        
                    <button type="reset" class="btn btn-primary">Limpar</button>
                </form>

            </div>

            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        </section>

        <footer class="container-fluid ">
            <a class="navbar-brand" href="#"><img src="../img/logo.png" alt="logo"></a>
            <p>Endereço:<br/>
                Rua Dez, 560 -  Prazeres <br/>
                Jaboatão dos Guararapes - PE <br/>
            </p>
        </footer>

    </body>
</html>
