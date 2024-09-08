package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDb<TDominio> {
    //aponta para classes abstrata por isso protegido
    protected ArrayList<TDominio> tabela;

    //somente leitura (Read-only)
    public ArrayList<TDominio> getTabela() {
        return tabela;
    }

    //como a ação sera realizada pela filha ela deve ser abstrata
    //toda classe com a tag abstract nao tem corpo e deve ser obrigatoriamente codificada na classe filha
        //ação que sera feita toda vez que a aplicação for exeuctada
    protected abstract void preencherDados();

    public BaseFakeDb(){
        this.preencherDados();
    }
    
}
