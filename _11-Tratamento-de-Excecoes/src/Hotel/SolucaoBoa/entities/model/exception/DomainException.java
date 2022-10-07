package Hotel.SolucaoBoa.entities.model.exception;

// extends Exception diz que é uma extensao da  classe excessao ou uma excesssao, precisa tratar a excessao
//se vc colocar RuntimeException , ess vc nao precisa tratar a excessao

public class DomainException extends Exception {

    public DomainException(String msg){
        super(msg);
    }
}

