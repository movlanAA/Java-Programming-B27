package day01_practice;

public class Constructor {
    private String name;
    private String surname;
    private int age;

    public Constructor(){
        System.out.println("hello");

        this.age=-1;
        this.name="Find the name";
        this.surname="Find the surname";

        callMeOnlyWhenImportant();
        }

        public void callMeOnlyWhenImportant(){
            System.out.println("It is important");
        }
        public String getName(){
        return name;
        }
        public void setName(String name){
        this.name=name;
        }



        public String getSurname(){
        return surname;
        }
        public void setSurname(String surname){
        this.surname=surname;
         }
        public int getAge(){
        return age;
        }
        public void setAge(int age){
        this.age=age;
        }

    }

