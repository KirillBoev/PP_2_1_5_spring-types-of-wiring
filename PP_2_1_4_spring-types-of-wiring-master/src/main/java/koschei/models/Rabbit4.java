package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {


    @Autowired
    private Duck5 duck;


    public Rabbit4() {
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }

    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }
}
