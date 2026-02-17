package com.example;

public class CuentaBancaria {

//Atributos 

    private String Titular;
    private  int Saldo;
   
   

//Constructores 



//metodos get y setter 
public String getTitular() {
    return Titular;
}
public void setTitular(String titular) {
    Titular = titular;
}
public int getSaldo() {
    return Saldo;
}


public String depositar() {
    return "CuentaBancaria [Titular=" + Titular + ", Saldo=" + Saldo + "]";
}



}
