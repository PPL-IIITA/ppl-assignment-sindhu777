
package pplssignment;

public class question1 {
    static void make_couples(girl girls[], boy boys[]){
        int i,x, max, ind;
        
        for(i=0;i<10;i++){
            switch (girls[i].criteria) {
                case 1:
                    max=0;  
                    ind=-1;
                    for(x=0;x<30;x++){
                        if(boys[x].taken==0 && girls[i].maintenance <= boys[x].budget){
                            if(boys[x].budget>max){
                                max = boys[x].budget;
                                ind = x;
                            }
                        }
                    }
                    if(ind==-1){
                        x=0;
                        while(true){
                            if(boys[x].taken ==0){
                                ind=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boys[ind].taken = 1;
                        girls[i].taken = 1;
                        girls[i].valentineid = boys[ind].id;
                       break;
                case 2:
                    max=0;
                    ind=-1;
                    for(x=0;x<30;x++){
                        if(boys[x].taken==0 && girls[i].maintenance <= boys[x].budget){
                            if(boys[x].intelligence>max){
                                max = boys[x].intelligence;
                                ind=x;
                            }
                        }
                    }
                    if(ind==-1){
                        x=0;
                        while(true){
                            if(boys[x].taken ==0){
                                ind=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boys[ind].taken = 1;
                        girls[i].taken = 1;
                        girls[i].valentineid = boys[ind].id;
                       break;
                case 3:
                    max=0;
                    ind=-1;
                    for(x=0;x<30;x++){
                        if(boys[x].taken==0 && girls[i].maintenance <= boys[x].budget){
                            if(boys[x].attractiveness>max){
                                max = boys[x].attractiveness;
                                ind = x;
                            }
                        }
                    }
                    if(ind==-1){
                        x=0;
                        while(true){
                            if(boys[x].taken ==0){
                                ind=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boys[ind].taken = 1;
                        girls[i].taken = 1;
                        girls[i].valentineid = boys[ind].id;
                       break;
                default:
                    break;
            }
        }    
        }
}
