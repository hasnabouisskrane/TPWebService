package ws;
import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
Un POJO plain Old Java Object
 */
@WebService(serviceName="BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.6;
    }
    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code,Math.random()*9000,new Date());
    }
    @WebMethod
    public List <Compte> listComptes(){
        List <Compte> comptes=new ArrayList<>();
        comptes.add(new Compte(1L,Math.random()*9000,new Date()));
        comptes.add(new Compte(2L,Math.random()*9000,new Date()));
        comptes.add(new Compte(3L,Math.random()*9000,new Date()));
        return comptes;

    }
}