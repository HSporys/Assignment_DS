package assingmentDS.animal;

import assingmentDS.enclosure.Enclosure;
import assingmentDS.person.Stuff;

/**
 * Created on 24.04.2017.
 * Garantiert Funktionalitäten in der Animalsklasse
 */
public interface IAnimal {
    public String getName();
    public Enclosure getEnclosure();
    public String getSpecies();
    public boolean isAlive();
}
