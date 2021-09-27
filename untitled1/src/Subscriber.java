import java.util.List;
public class Subscriber implements Observer{
    String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies){
        System.out.println("Hello" + name + "\n We inform you that some changes will be applied soon to vacancies:\n"+ vacancies);
    }


    @Override
    public void Event(List<String> vacancies) {

    }
}
