public class Arboles {

    private String tipo;
    private int altura;
    private String procedencia;
    private int anios;

    public Arboles() {
    }

    public Arboles(String tipo, int altura, String procedencia, int anios) {
        this.tipo = tipo;
        this.altura = altura;
        this.procedencia = procedencia;
        this.anios = anios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "arboles{" +
                "tipo='" + tipo + '\'' +
                ", altura=" + altura +
                ", procedencia='" + procedencia + '\'' +
                ", anios=" + anios +
                '}';
    }
}
