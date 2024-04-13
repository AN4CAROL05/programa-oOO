package livraria;

import java.util.ArrayList;

public class livraria {
    
public ArrayList<livro> livros;

public livraria (){
    this.livros = new ArrayList<>();
}

public void cadastrarlivro ( livro livro){
    this.livros.add(livro);

}

public String listarlivros(){
String listalivros = "";

for( livro l : this.livros) {

    listalivros += l.id + " - " + l.titulo + "\n";

}
return listalivros;
}

}
