package com.theironyard;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by illladell on 5/25/16.
 */
public class MainTest {
    static final String TEST_FILE_ = "test.json";
    @Test
    public void saveAndLoad() {
        Player player = new Player();
        player.name = "Test Player";
        player.weapon = "Test Weapon";
        player.location = "Test Location";

        Main.saveGame(player, TEST_FILE_);
        Player newPlayer = Main.loadGame(TEST_FILE_);

        File f = new File(TEST_FILE_);
        f.delete();

        assertTrue(newPlayer != null);
        assertTrue(newPlayer.name.equals(player.name));
        assertTrue(newPlayer.weapon.equals(player.weapon));
        assertTrue(newPlayer.location.equals(player.location));
    }
}