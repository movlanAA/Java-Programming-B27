package day01_practice;

public class duplicateArray {

    public static void main(String[] args) {
        String arr []={"Movlan","Movlan","hi","hi","jj","ll"};

        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if (arr[i]==arr[j]){
                    System.out.println("find duplicate "+arr[i]);
                }
            }
        }
    }
}
