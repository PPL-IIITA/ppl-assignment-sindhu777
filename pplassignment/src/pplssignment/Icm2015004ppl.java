
package pplssignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Icm2015004ppl {

    public static void main(String[] args) throws FileNotFoundException {
        boy[] boys = new boy[30];
        girl[] girls = new girl[10];
        gift[] gifts = new gift[300];
        int i,j;
        
         
        for(i=0;i<30;i++){
            boys[i] = new boy();
            boys[i].id = i+501;
        }
        PrintStream out1 = new PrintStream(new FileOutputStream("boys.txt"));
        System.setOut(out1);
        for(i=0;i<30;i++){
            System.out.println(i+" "+boys[i].id+" "+boys[i].attractiveness+" "+boys[i].intelligence+" "+boys[i].budget+" "+boys[i].type);
        }
        
        for(i=0;i<10;i++){
            girls[i] = new girl();
            girls[i].id = i+601;  
        }
        PrintStream out2 = new PrintStream(new FileOutputStream("girls.txt"));
        System.setOut(out2);
        for(i=0;i<10;i++){
            System.out.println(i+" "+girls[i].id+" "+girls[i].attractiveness+" "+girls[i].intelligence+" "+girls[i].maintenance+" "+girls[i].type);
        }
        for(i=0;i<300;i++){
            gifts[i] = new gift();
        }
        PrintStream out3 = new PrintStream(new FileOutputStream("gifts.txt"));
        System.setOut(out3);
        for(i=0;i<10;i++){
            System.out.println(i+" "+gifts[i].type+" "+gifts[i].price+" "+gifts[i].value+" "+gifts[i].luxury_rating+" "+gifts[i].difficulty+" "+gifts[i].utility_class+" "+gifts[i].utility_value);
        }
        
        question1.make_couples(girls, boys);
        
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);
        for(i=0;i<10;i++){
            System.out.println(i+" "+girls[i].id+" "+girls[i].valentineid);
        }
    
    }
}
