
package pplssignment;

public class boy {
    int id;
    int attractiveness;
    int intelligence;
    int budget;
    int happiness;
    int type;
    int taken;
    
    random r = new random();
    boy(){
            this.attractiveness = r.getRandomNumberInRange(1, 10);
            this.intelligence = r.getRandomNumberInRange(1, 10);
            this.budget = r.getRandomNumberInRange(1000, 5000);
            this.type = r.getRandomNumberInRange(1, 3);
            this.taken = 0;
    }
}
