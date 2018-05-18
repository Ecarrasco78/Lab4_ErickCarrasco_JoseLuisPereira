/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_erickcarrasco_josepereira;

/**
 *
 * @author erick
 */
public class Partida{
    String [][] t= new String[10][10];
    int x;
    int y;


    public Partida() {
        this.x = x;
        this.y = y;
        t = create(t);
        t = asigner (t);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String [][] create (String[][]tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero [i][j]=" ";
            }
        }
        return tablero;
    }
    
    
    
    public String [][] asigner (String [][] t){
        t [0][0]= "0C";
        t [0][2]= "0F";
        t [0][3]= "0A";
        t [0][4]= "0R";
        t [0][5]= "0M";
        t [0][6]= "0A";
        t [0][7]= "0F";
        t [0][9]= "0C";
        //Superior fila 1
        t [1][0]= "0D";
        t [1][2]= "0A";
        t [1][3]= "0D";
        t [1][4]= "0C";
        t [1][5]= "0F";
        t [1][6]= "0D";
        t [1][7]= "0A";
        t [1][9]= "0D";
        //Inferior fila 9
        t [9][0]= "1C";
        t [9][2]= "1F";
        t [9][3]= "1A";
        t [9][4]= "1M";
        t [9][5]= "1R";
        t [9][6]= "1A";
        t [9][7]= "1F";
        t [9][9]= "1C";
        //Inferior fila 8
        t [8][0]= "1D";
        t [8][2]= "1A";
        t [8][3]= "1D";
        t [8][4]= "1F";
        t [8][5]= "1C";
        t [8][6]= "1D";
        t [8][7]= "1A";
        t [8][9]= "1D";
        return t;
    }
}
