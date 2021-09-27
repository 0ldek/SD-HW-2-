public class main {
    public static void main(String[] args) {
        Website website = new Website() ;

        website.addVacancy("First Channel");
        website.addVacancy("Second Channel");


        Observer firstSubscriber = new Subscriber("Alan Balan");
        Observer secondSubscriber = new Subscriber("Oleg Balan");

        website.addObserver(firstSubscriber);
        website.addObserver(secondSubscriber);

        website.addVacancy("third channel");


    }
}
