package product;

import java.util.HashSet;
import java.util.Set;

public class SetRecipe<P> {
    private final Set<Recipe> recipeList = new HashSet<>();
    public void addRecipe(Recipe recipe) {
        if (!recipeList.contains(recipe)) {
            recipeList.add(recipe);
        } else throw new RuntimeException();
    }

    @Override
    public String toString() {
        return " " + recipeList;
    }
}
