public class Carro extends Veiculo {
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cor: " + getCor());
    }
    
    
    }
