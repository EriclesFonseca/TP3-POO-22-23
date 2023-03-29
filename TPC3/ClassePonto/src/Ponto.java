import static java.lang.Math.abs;
public class Ponto {
public Ponto() {x=0; y=0;}
    public Ponto (int cx, int cy) {x=cx; y=cy;}
    public Ponto(Ponto p) {x=p.getX(); y=p.getY();}
    //Variaveis de instancia
    private int x;
    private int y;

    //Metedos de Instancia

    //interrogar - devolve X
    public int getX() {return x;}
    //interrogar - devolva Y
    public int getY() {return y;}

    //modificador - incremento das coordenadas
    public void incCoord(int deltaX, int deltaY){
        x=x+deltaX;
        y=y+deltaY;
    }
    //modificador - decremento das coordenadas
    public void decCoord(int deltaX, int deltaY){
        x-=deltaX;
        y-=deltaY;
    }
    //determina se um ponto tem ambas as coordenadas positivas
    public boolean coordPos(){
        return x > 0 && y > 0 ;
    }
    //verifica se um ponto é simetrico, ou seja, se dista igualmente do eixo dos X e do Y
    public boolean simetrico(){
        return abs(x) == abs(y);
    }

}