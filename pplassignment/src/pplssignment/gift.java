
package pplssignment;

public class gift {
    int type;
    int value;
    int price;
    int luxury_rating;
    int utility_value;
    int utility_class;
    int difficulty;
    int chosen;
    /*type(1-essential, 2-luxury, 3-utility)*/
    
    random r = new random();
    gift(){
        this.value = r.getRandomNumberInRange(1, 100);
        this.price = r.getRandomNumberInRange(500, 1000);
        this.type = r.getRandomNumberInRange(1, 3);
        this.chosen = 0;
        if(this.type == 1){
            this.luxury_rating = 0;
            this.utility_class = 0;
            this.utility_value = 0;
            this.difficulty = 0;
        }
        else if(this.type == 2){
            this.utility_class = 0;
            this.utility_value = 0;
            this.luxury_rating = r.getRandomNumberInRange(1, 10);
            this.difficulty = r.getRandomNumberInRange(1, 10);
        }
        else if(this.type == 3){
            this.luxury_rating = 0;
            this.difficulty = 0;
            this.utility_class = r.getRandomNumberInRange(1, 5);
            this.utility_value = r.getRandomNumberInRange(1, 10);
        }
    }
    
}
