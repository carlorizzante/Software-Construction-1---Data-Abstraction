package model;

/**
 * Created by carlorizzante on 28/08/17.
 */
public interface Virtual {

    void service();

    void signIn(User u);

    void search(Product p);
}
