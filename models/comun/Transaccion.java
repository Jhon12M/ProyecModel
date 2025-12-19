public class Transaccion {

    private Productos productos;
    private Beneficiario beneficiario;

    public Transaccion(TransaccionBuilder builder) {
        this.productos = builder.getProductos();
        this.beneficiario = builder.getBeneficiario();
    }

    public Productos getProductos() {
        return productos;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }
}