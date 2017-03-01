package dsa;

import org.junit.Assert;

public class Main {

    @org.junit.Test()
public void suma(){
    Assert.assertEquals(5,Controlador.suma(3,2));
}
@org.junit.Test()
public void resta(){
    Assert.assertEquals(1,Controlador.resta(3,2));
}
@org.junit.Test()
public void multiplicacion(){
    Assert.assertEquals(6,Controlador.multipicacion(3,2));
}
@org.junit.Test(expected = Division_Nulo.class)
public void division () throws Division_Nulo{
    Assert.assertEquals(2,Controlador.division(5,2));
    Controlador.division(2,0);
}
}
