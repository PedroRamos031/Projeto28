public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, int ano, String cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;

    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindrada: " + getCilindrada());

        @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindrada: " + cilindrada);
    }
    
    }
    
    
    }
