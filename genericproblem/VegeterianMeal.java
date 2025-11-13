interface MealPlan { String getType(); }

class VegetarianMeal implements MealPlan {
    public String getType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getType() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getType() { return "Keto"; }
}

class Meal<T extends MealPlan> {
    private T plan;

    Meal(T plan) { this.plan = plan; }

    public void showMeal() {
        System.out.println("Meal Plan: " + plan.getType());
    }

    public static <T extends MealPlan> void generateMeal(T plan) {
        System.out.println("✅ Personalized " + plan.getType() + " meal plan generated!");
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        vegMeal.showMeal();

        generateMeal(new VeganMeal());
    }
}

