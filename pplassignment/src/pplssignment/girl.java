
package pplssignment;

public class girl {
    int id;
    int attractiveness;
    int intelligence;
    int maintenance;
    int happiness;
    int type;
    int criteria;
    int taken;
    int valentineid;
    /*criteria(1-rich, 2-intelligent, 3-attractive)*/
    
    random r = new random();
    girl(){
        this.attractiveness = r.getRandomNumberInRange(1, 10);
            this.intelligence = r.getRandomNumberInRange(1, 10);
            this.maintenance = r.getRandomNumberInRange(1000, 5000);
            this.type = r.getRandomNumberInRange(1, 3);
            this.criteria = r.getRandomNumberInRange(1, 3);
            this.taken = 0;
            this.valentineid = 0;
    }
    
}
