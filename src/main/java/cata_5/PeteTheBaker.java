/*
Pete likes to bake some cakes. He has some recipes and ingredients.
Unfortunately he is not good in maths. Can you help him to find out,
how many cakes he could bake considering his recipes?

Write a function cakes(), which takes the recipe (object) and the available
ingredients (also an object) and returns the maximum number of cakes Pete
can bake (integer). For simplicity there are no units for the amounts
(e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200). Ingredients
that are not present in the objects, can be considered as 0.

Examples:

// must return 2
cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200});
// must return 0
cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000});
*/

package cata_5;

import java.util.Map;

public class PeteTheBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        if (recipe.isEmpty()) {
            return Integer.MAX_VALUE;
        }

        int maxCakes = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> ingridient : recipe.entrySet()) {
            String ingridientName = ingridient.getKey();
            int requiredAmount = ingridient.getValue();

            int availableAmount = available.getOrDefault(ingridientName, 0);

            if (availableAmount == 0 && requiredAmount > 0) {
                return 0;
            }

            int possibleCakes = availableAmount / requiredAmount;

            maxCakes = Math.min(maxCakes, possibleCakes);
        }

        return maxCakes == Integer.MAX_VALUE ? 0 : maxCakes;
    }

    public static int cakesSmart(Map<String, Integer> requirements, Map<String, Integer> availableResources) {
        int maxSets = Integer.MAX_VALUE;
        for (String key: requirements.keySet()) {
            if (!availableResources.containsKey(key)) return 0;

            maxSets = Integer.min(maxSets, availableResources.get(key) / requirements.get(key));
        }

        return maxSets;
    }
}
