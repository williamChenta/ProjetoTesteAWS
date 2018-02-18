package view;

import javax.faces.bean.ManagedBean;
import model.Carro;
import repository.CarroDao;

@ManagedBean
public class OlaMundo {
    private String ola = "olá mundo aws";
    private CarroDao cdao = new CarroDao();
    private Carro carro = new Carro();

    public String getOla() {
        return ola;
    }
    
    public void digaOi() {
        this.ola = "teste";
    }

    public CarroDao getCdao() {
        return cdao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public void salvar() {
        cdao.salvar(carro);
    }
}
