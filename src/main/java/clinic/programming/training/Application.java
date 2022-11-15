package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application{

    public int countWords(String words){
        String []sw=StringUtils.split(words,' ');
        return (sw==null) ? 0 : sw.length;
    }

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
        int count=ap.countWords("I have five words");
        System.out.println("Words count: "+count);
    }

}