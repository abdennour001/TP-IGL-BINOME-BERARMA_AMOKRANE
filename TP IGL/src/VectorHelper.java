import java.util.ArrayList;

/**
 * Created by DELL on 14/10/2017.
 */
public class VectorHelper {
    ArrayList InvVect (ArrayList V){
        ArrayList RES = new ArrayList();
        for (int i=0 ; i< V.size();i++){
            RES.add(V.get(V.size()-i));
        }
        return RES;
    }
    int MaxVect (ArrayList V){
        int max ;
        max = (int) V.get(0);
        for (int i=1;i<V.size();i++){
            if ( (int) V.get(i) > max) max = (int) V.get(i);
        }
        return  max;
    }
    int MinVect (ArrayList V){
        int min ;
        min = (int) V.get(0);
        for (int i=1;i<V.size();i++){
            if ( (int) V.get(i) < min) min = (int) V.get(i);
        }
        return  min;
    }
    ArrayList FoncVect (ArrayList V , char op , int x){
        ArrayList res = new ArrayList();
            switch (op) {
                case '+':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) + x);
                    }
                    break;
                case '-':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) - x);
                    }
                    break;
                case '*':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) * x);
                    }
                    break;
                case '/':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) / x);
                    }
                    break;
                default:
                    System.out.print("error");
                    break;
            }
        return res;
    }
    ArrayList SommeDeuxVect (ArrayList V1 , ArrayList V2){
        ArrayList res = new ArrayList();
        if (V1.size()==V2.size()){
            for (int i=0;i<V1.size();i++){
                res.add((int)V1.get(i) + (int)V2.get(i));
            }
        }else{
            // execption
        }
        return res;
    }
    void AfficheVect (ArrayList V){
        for (int i=0;i<V.size();i++){
            System.out.printf ("V["+i+"] = "+String.valueOf(V.get(i))+"\n");
        }
    }
}
