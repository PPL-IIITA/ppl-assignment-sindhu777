
package pplssignment;

public class generator {
    static void generate(girl girls[], boy boys[]){
        
        int i,j;
        random r = new random();
         
        for(i=0;i<30;i++){
            boys[i].id = i+501;
            boys[i].attractiveness = r.getRandomNumberInRange(1, 10);
            boys[i].intelligence = r.getRandomNumberInRange(1, 10);
            boys[i].budget = r.getRandomNumberInRange(1000, 5000);
            boys[i].type = r.getRandomNumberInRange(1, 3);
            boys[i].taken = 0;
        }
        
        for(i=0;i<10;i++){
            girls[i].id = i+601;
            girls[i].attractiveness = r.getRandomNumberInRange(1, 10);
            girls[i].intelligence = r.getRandomNumberInRange(1, 10);
            girls[i].maintenance = r.getRandomNumberInRange(1000, 5000);
            girls[i].type = r.getRandomNumberInRange(1, 3);
            girls[i].criteria = r.getRandomNumberInRange(1, 3);
            girls[i].taken = 0;
            girls[i].valentineid = 0;
        }
        
        
    }
}
