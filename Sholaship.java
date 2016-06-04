/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

/**
 *
 * @author Tam
 */
public class Sholaship {
    public int getAward(double gpa){
        if(gpa >=9 && gpa <=10) return 100;
        else if(gpa >=8) return 80;
        else if(gpa >=7.5) return 50;
        else return 0;
    }
}
