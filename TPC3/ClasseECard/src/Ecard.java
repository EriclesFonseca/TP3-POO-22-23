public class Ecard {
    //construtores
    public Ecard(){
        codigo= "";
        titular= "";
        saldo= 0.0;
        numMovs= 0;
    }
    public Ecard (String codigo, String tit, double sld, int nMovs){
        this.codigo=codigo;
        titular=tit;
        saldo=sld;
        numMovs=nMovs;
    }
    public Ecard(Ecard ec){
        codigo=ec.getCodigo();
        titular=ec.getTitular();
        saldo=ec.getSaldo();
        numMovs=ec.getNumMovs();
    }
    //variaveis de instancia
    private String codigo;
    private String titular;
    private double saldo;
    private int numMovs;    //total de movimentos
    //Metodos de Instancia
    public String getCodigo(){return codigo;}
    public String getTitular(){return titular;}
    public double getSaldo(){return saldo;}
    public int getNumMovs(){return numMovs;}
    public void mudaTitular(String novoTit){
        titular=novoTit;
    }
    public void carregaEc(double valor){
        saldo=saldo+valor;
        numMovs++;
    }
    public boolean prePaga(double valor){
        return saldo >= valor;
    }
    public void pagamento(double valor){
        saldo=saldo-valor;
        numMovs++;
    }
    public  String toString(){
        StringBuilder s =new StringBuilder();
        s.append("------- Ecard N.º: ");
        s.append(codigo);
        s.append("\nTitular: ");
        s.append(titular);
        s.append("\nSaldo Atual: ");
        s.append(saldo);
        s.append("\nMovimento: ");
        s.append(numMovs);
        s.append("\n-----------------------------");
        return  s.toString();
    }
    public boolean equals(Ecard ec){
        return codigo.equals(ec.getCodigo());
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if ((obj==null) || (this.getClass() != obj.getClass()))
            return false;
        Ecard ec =(Ecard) obj;
        return this.equals(ec);
    }
    public Ecard clone(){return  new Ecard(this);}
}