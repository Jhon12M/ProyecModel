public class TransaccionBuilder {

    private Productos productos = new Productos();
    private Beneficiario beneficiario = new Beneficiario();

    public TransaccionBuilder con(){
        return new TransaccionBuilder();
    }

    public TransaccionBuilder numeroCuentas(List<Map<String, String>> datos) {
        this.productos.setNumeroCuentas(datos.get(0).get("numeroCuentas"));
        return this;
    }

    public TransaccionBuilder banco(List<Map<String, String>> datos) {
        this.productos.setBanco(datos.get(0).get("banco"));
        return this;
    }

    public TransaccionBuilder monto(List<Map<String, String>> datos) {
        this.productos.setMonto(datos.get(0).get("monto"));
        return this;
    }

    public TransaccionBuilder monto(String monto) {
        this.productos.setMonto(monto);
        return this;
    }

    public TransaccionBuilder nombreBeneficiario(List<Map<String, String>> datos) {
        this.beneficiario.setNombre(datos.get(0).get("nombre"));
        return this;
    }

    public TransaccionBuilder paisBeneficiario(List<Map<String, String>> datos) {
        this.beneficiario.setPais(datos.get(0).get("pais"));
        return this;
    }

    public TransaccionBuilder direccionBeneficiario(List<Map<String, String>> datos) {
        this.beneficiario.setDireccion(datos.get(0).get("direccion"));
        return this;
    }

    public Productos getProductos() {
        return productos;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public Transaccion build(){
        return new Transaccion(this);
    }
}