package foxrabbitsv2;

import java.util.List;

public abstract class Animal {
    private boolean alive;
    private Campo field;
    private Localizacao location;


    protected Animal(Campo field, Localizacao local) {
        alive = true;
        this.field = field;
        setLocation(local);
    }

    public Localizacao getLocation(){
        return location;
    }

    protected void setLocation(Localizacao location){

        if(getLocation() != null) {
            getField().clear(getLocation());
        }
        this.location = location;
        field.place(this, location);
    }

    protected boolean isAlive(){
        return alive;
    }

    protected void setDead(){
        alive = false;
        if(location!=null){
            field.clear(location);
            location = null;
            field = null;
        }
    }
    protected Campo getField(){
        return field;
    }

    abstract public void act(List<Animal> newAnimal);






}
