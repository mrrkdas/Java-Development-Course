package Section3;

public class WorkBook_03_3 {
    public static void main(String[] args) {
        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        int margin = gryffindor - ravenclaw;


        if (margin >= 300) {
            System.out.println("Gryffindor takes the cup");
        }else if (margin < 300) {
            System.out.println("In Second Place Gryffindor");
        }else if (margin < 100) {
            System.out.println("In third place, Gryffindor");
        }
        
        else {
            System.out.println("In fourth place, Gyrffindor");
        }

    }

    
}
