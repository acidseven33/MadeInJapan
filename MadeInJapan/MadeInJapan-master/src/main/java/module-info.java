module br.unicentro.appestudantes {
    // indica que o módulo precisa da API de JavaFX Controls - controles de UI, como botões, listas, etc.
    requires javafx.controls;
    // indica que o módulo precisa da API de JavaFX FXML, - permite carregar interfaces gráficas definidas em arquivos .fxml.
    requires javafx.fxml;
    //indica dependência da biblioteca ControlsFX - fornece controles adicionais e utilitários para JavaFX (como notificações, diálogos aprimorados, etc.).
   // requires org.controlsfx.controls;
    // indica dependência da biblioteca BootstrapFX - fornece estilos semelhantes ao Bootstrap (framework CSS) para o JavaFX, melhorando a IU.
    requires org.kordamp.bootstrapfx.core;
    // indica dependência do módulo java.sql que contém as APIs para trabalhar com bancos de dados em Java.
    // transitive significa que outros módulos que dependem deste módulo também terão acesso ao java.sql automaticamente
    requires transitive java.sql;

    //para o FXML Loader conseguir instanciar os controladores e injetar dependências
    opens br.unicentro.appestudantes.controller to javafx.fxml;
    // para que outras partes do projeto possam importar e usar suas classes (se for necessário).
    exports br.unicentro.appestudantes.controller;

    // Permite que o JavaFX FXML Loader acesse esse pacote para criar objetos, preencher atributos @FXML, etc.
    opens br.unicentro.appestudantes.model to javafx.fxml;
    exports br.unicentro.appestudantes.model;

    opens br.unicentro.appestudantes.main to javafx.fxml;
    exports br.unicentro.appestudantes.main;

    opens br.unicentro.appestudantes.dao to javafx.fxml;
    exports br.unicentro.appestudantes.dao;
}

