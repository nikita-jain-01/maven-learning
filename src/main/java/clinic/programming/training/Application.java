package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application{

    public void greet(){
        List<String> greeting=new ArrayList<>();
        greeting.add("Hello");
        for(String g:greeting){
            System.out.println("Greeting: "+g);
        }
    }

    public Application(){
        System.out.println("Inside application");
    }

    public static void main(String[] args){
        System.out.println("Starting application");
        Application ap=new Application();
        ap.greet();
    }

}