package cata_5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeteTheBakerTest {
    @Test
    void basicTest() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("flour", 500);
        recipe.put("sugar", 200);
        recipe.put("eggs", 1);
        Map<String, Integer> available = new HashMap<>();
        available.put("flour", 1200);
        available.put("sugar", 1200);
        available.put("eggs", 5);
        available.put("milk", 200);
        assertEquals(2, PeteTheBaker.cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void basicTestSmart() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("flour", 500);
        recipe.put("sugar", 200);
        recipe.put("eggs", 1);
        Map<String, Integer> available = new HashMap<>();
        available.put("flour", 1200);
        available.put("sugar", 1200);
        available.put("eggs", 5);
        available.put("milk", 200);
        assertEquals(2, PeteTheBaker.cakesSmart(recipe, available),
                "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void missingIngredient() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("flour", 500);
        recipe.put("sugar", 200);
        recipe.put("eggs", 1);
        recipe.put("cinnamon", 300);
        Map<String, Integer> available = new HashMap<>();
        available.put("flour", 1200);
        available.put("sugar", 1200);
        available.put("eggs", 5);
        available.put("milk", 200);
        assertEquals(0, PeteTheBaker.cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void missingIngredientSmart() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("flour", 500);
        recipe.put("sugar", 200);
        recipe.put("eggs", 1);
        recipe.put("cinnamon", 300);
        Map<String, Integer> available = new HashMap<>();
        available.put("flour", 1200);
        available.put("sugar", 1200);
        available.put("eggs", 5);
        available.put("milk", 200);
        assertEquals(0, PeteTheBaker.cakesSmart(recipe, available),
                "For recipe " + recipe + " and ingredients " + available);
    }
}
