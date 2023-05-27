package com.example.tpc8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AplicaçãoTPC8 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void init(){
        System.out.println("Aplicação vai iniciar...");
    }
    public void stop(){
        System.out.println("Aplicação terminou");
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 520, Color.LIGHTBLUE);

        primaryStage.setTitle("TPC 8-Trabalhar com Scene");
        primaryStage.setScene(scene);
        primaryStage.show();

        Text texto = new Text(50, 50, "TPC 8");
        texto.setFill(Color.GREEN); //cor da fonte
        texto.setFont(Font.font("Arial Black", 30)); //tipo e tamanho da font

        //fazer o retangulo
        Rectangle retangulo = new Rectangle(80, 80, 80, 80);
        retangulo.setFill(Color.BLUE); //cor do retangulo
        retangulo.setStroke(Color.BLACK);  //cor do contorno
        retangulo.setStrokeWidth(3.0); //espessura do contorno

        // fazer o triângulo
        Polygon triangulo = new Polygon();
        //triangulo.getPoints().addAll(100.0, 250.0, 100.0, 160.0, 190.0, 250.0);
        triangulo.getPoints().addAll(159.0, 250.0, 159.0, 160.0, 250.0, 250.0);
        triangulo.setFill(Color.YELLOW); //cor do triangulo

        //fazer a linha
        Line linha = new Line(200, 80, 400, 250); // Ajuste as coordenadas para criar a diagonal desejada
        linha.setStroke(Color.RED); //cor da linha
        linha.setStrokeWidth(4.0); //espessura da linha

        //fazer o círculo
        Circle circulo = new Circle(310, 290, 45);
        circulo.setFill(Color.ORANGE); //cor do circulo

        //implementar a imagem
        Image imagem = new Image("file:src/main/resources/uta-logo.png"); //indicando o caminho da logo
        ImageView imageView = new ImageView(imagem);
        imageView.setX(50);  // posição horizontal
        imageView.setY(350); //posição vertical

        double novaLargura = 350; //  largura da logo
        double novaAltura = 90; // altura da logo
        imageView.setFitWidth(novaLargura);
        imageView.setFitHeight(novaAltura);

        root.getChildren().addAll(texto, linha, retangulo, triangulo, circulo, imageView);


    }


}
