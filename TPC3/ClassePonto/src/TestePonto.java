public class TestePonto {
    //classe de teste da classe Ponto
    public static void main(String args[]){
        //criação de instancias
        Ponto pt1, pt2, pt3;
        pt1=new Ponto();
        pt2=new Ponto(2, -1);
        pt3=new Ponto(pt2);
        //utilização das instancias
        int cx1, cx2, cx3;  //variaveis auxiliares
        int cy1, cy2, cy3;  //variaveis auxiliares
        cx1=pt1.getX();
        cx2=pt2.getX();
        //saida de resultados para verificação
        System.out.println("cx1= " +cx1);
        System.out.println("cx2= " +cx2);
        //alterações as instancias e novos resultados
        pt1.incCoord(4,4);
        pt2.incCoord(12,-3);
        cx1=pt1.getX();
        cx2=pt2.getX();
        cx3=cx1+cx2;
        System.out.println("cx1+cx2= " +cx3);
        pt3.decCoord(10, 20);
        pt2.decCoord(5, -10);
        cy1=pt2.getY();
        cy2=pt3.getY();
        cy3=cy1+cy2;
        System.out.println("cy1+cy2=" +cy3);
    }
}
