package day40_inheritance.app;

public class Phone {
    public static void main(String[] args) {

        Youtube youtube = new Youtube(4.8);
        System.out.println(youtube.name);
        System.out.println(youtube.version);
        youtube.download();
        youtube.watchVideo();
        System.out.println(youtube);

    }
}

// Youtube is a App
// App is a Object
// Youtube is a Object
