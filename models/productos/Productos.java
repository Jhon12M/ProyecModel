package models;

public class ProductosBuilder {

    private String numeroCuentas;
    private String banco;
    private String monto;

    public Productos(){
    }

    public String getNumeroCuentas() {
        return numeroCuentas;
    }

    public String getBanco() {
        return banco;
    }

    public String getMonto() {
        return monto;
    }

    public String setNumeroCuentas(String numeroCuentas) {
        this.numeroCuentas = numeroCuentas;
    }

    public String setBanco(String banco) {
        this.banco = banco;
    }

    public String setMonto(String monto) {
        this.monto = monto;
    }


}