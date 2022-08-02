package day30_practice_wrapper;

public class GoogleSearch {
    public static void main(String[] args) {

        String str = "About 1,690,000,000 results (2.8 seconds)"; // from some layer, ui, db, api
        String [] parts = str.split(" ");
        //System.out.println(parts[1].replace(",", ""));
        int result = Integer.parseInt(parts[1].replace(",", ""));

        if(result > 10_000_000){
            System.out.println("narrow the search down");
        }

        if(result < 50_000){
            System.out.println("Not too much information");
        }
        //System.out.println(parts[3].substring(1));
        double seconds = Double.parseDouble(parts[3].substring(1));

        if(seconds > 1.0){
            System.out.println("Search took too long");
        } else if(seconds > 0.5){
            System.out.println("okay but could be better");
        } else {
            System.out.println("good speed");
        }

    }
}
