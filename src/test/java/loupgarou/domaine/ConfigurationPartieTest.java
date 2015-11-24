package loupgarou.domaine;

import org.junit.Test;

public class ConfigurationPartieTest {

    @Test
    public void attribue_une_équipe_à_un_joueur() throws Exception {
        ConfigurationPartie configurationPartie = new ConfigurationPartie();
        configurationPartie.accepteJoueur("Boby");

        Phase phase = configurationPartie.initialise();



    }
}
