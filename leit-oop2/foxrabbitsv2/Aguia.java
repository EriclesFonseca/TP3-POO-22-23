package foxrabbitsv2;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Aguia extends Animal {

    private static final int BREEDING_AGE = 5;

    private static final int MAX_AGE = 100;

    private static final double BREEDING_PROBABILITY = 0.3;

    private static final int MAX_LITTER_SIZE = 2;

    private static final int PREY_FOOD_VALUE = 10;


    private static final Random rand = Randomizer.getRandom();


    private int age;


    private int foodLevel;

    public Aguia(boolean randomAge, Campo field, Localizacao location)
    {
        super(field,location);
        if(randomAge) {
            age = rand.nextInt(MAX_AGE);
            foodLevel = rand.nextInt(PREY_FOOD_VALUE);
        }
        else {
            age = 0; // leave age at 0
            foodLevel = rand.nextInt(PREY_FOOD_VALUE);
        }
    }

    protected Aguia(Campo field, Localizacao local) {
        super(field, local);
    }

    @Override
    public void act(List<Animal> newAguia){
        incrementAge();
        incrementHunger();
        if(isAlive()) {  // se a águia ainda estiver viva
            giveBirth(newAguia);
            Localizacao newLocation = findFood();
            Localizacao newLocal = killPrey();
            if(newLocation == null) {
                newLocation = getField().freeAdjacentLocation(getLocation());
            }
            if(newLocation != null) {
                setLocation(newLocation);
            }
            else {
                setDead();
            }
        }

    }
    private void incrementAge()
    {
        age++;
        if(age > MAX_AGE) {
            setDead();
        }
    }

    /**
     * Aumenta a fome da Águia
     */
    private void incrementHunger()
    {
        foodLevel--;
        if(foodLevel <= 0) {
            setDead();
        }
    }

    private Localizacao findFood() {
        List<Localizacao> adjacent = getField().adjacentLocations(getLocation());
        Iterator<Localizacao> it = adjacent.iterator();
        while (it.hasNext()) {
            Localizacao where = it.next();
            Object animal = getField().getObjectAt(where);

        }
        // caso nenhum alimento tenha sido encontrado
        return null;
    }

    private Localizacao killPrey() {
        List<Localizacao> adjacent = getField().adjacentLocations(getLocation());
        Iterator<Localizacao> it = adjacent.iterator();
        while(it.hasNext()) {
            Localizacao where = it.next();
            Object animal = getField().getObjectAt(where);
            if(animal instanceof Raposa || animal instanceof Coelho) {
                if(rand.nextDouble() <= 0.3) {
                    Animal prey = (Animal) animal;
                    if(prey.isAlive()) {
                        prey.setDead();
                        foodLevel = PREY_FOOD_VALUE;
                        return where;
                    }
                }
            }
        }
        return null;
    }

    private void giveBirth(List<Animal> newAguia)
    {
        // Novas raposas nascem em locais adjacentes.
        // Obtenha uma lista de locais livres adjacentes.
        List<Localizacao> free = getField().getFreeAdjacentLocations(getLocation());
        int births = breed();
        for(int b = 0; b < births && free.size() > 0; b++) {
            Localizacao loc = free.remove(0);
            Aguia young = new Aguia(false, getField(), loc);
            newAguia.add(young);
        }
    }

    private int breed()
    {
        int births = 0;
        if(canBreed() && rand.nextDouble() <= BREEDING_PROBABILITY) {
            births = rand.nextInt(MAX_LITTER_SIZE) + 1;
        }
        return births;
    }

    private boolean canBreed()
    {
        return age >= BREEDING_AGE;
    }

}

