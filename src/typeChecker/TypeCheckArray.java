package typeChecker;

import java.util.HashMap;
import java.util.Map;

public class TypeCheckArray {

    /*
     * 1. Normal    2. Grass   3. Water   4. Fire  5. Electric
     * 6. Fighting  7. Flying  8. Ground  9. Rock  10. Dark
     * 11. Ghost    12. Bug    13. Dragon 14. Ice  15. Steel
     * 16. Fairy    17. Poison 18. Phychic
     * */
    private static Map<String, HashMap<String, Double>> pokemonTypes = new HashMap<>();

    static {
        // Normal Type
        pokemonTypes.put("1", new HashMap<>());
        pokemonTypes.get("1").put("Normal", 1.0);
        pokemonTypes.get("1").put("Grass", 1.0);
        pokemonTypes.get("1").put("Water", 1.0);
        pokemonTypes.get("1").put("Fire", 1.0);
        pokemonTypes.get("1").put("Electric", 1.0);
        pokemonTypes.get("1").put("Fighting", 2.0);
        pokemonTypes.get("1").put("Flying", 1.0);
        pokemonTypes.get("1").put("Ground", 1.0);
        pokemonTypes.get("1").put("Rock", 1.0);
        pokemonTypes.get("1").put("Dark", 1.0);
        pokemonTypes.get("1").put("Ghost", 0.0);
        pokemonTypes.get("1").put("Bug", 1.0);
        pokemonTypes.get("1").put("Dragon", 1.0);
        pokemonTypes.get("1").put("Ice", 1.0);
        pokemonTypes.get("1").put("Steel", 1.0);
        pokemonTypes.get("1").put("Fairy", 1.0);
        pokemonTypes.get("1").put("Poison", 1.0);
        pokemonTypes.get("1").put("Phychic", 1.0);

        // Grass Type
        pokemonTypes.put("2", new HashMap<>());
        pokemonTypes.get("2").put("Normal", 1.0);
        pokemonTypes.get("2").put("Grass", 0.5);
        pokemonTypes.get("2").put("Water", 0.5);
        pokemonTypes.get("2").put("Fire", 2.0);
        pokemonTypes.get("2").put("Electric", 0.5);
        pokemonTypes.get("2").put("Fighting", 1.0);
        pokemonTypes.get("2").put("Flying", 2.0);
        pokemonTypes.get("2").put("Ground", 0.5);
        pokemonTypes.get("2").put("Rock", 1.0);
        pokemonTypes.get("2").put("Dark", 1.0);
        pokemonTypes.get("2").put("Ghost", 1.0);
        pokemonTypes.get("2").put("Bug", 2.0);
        pokemonTypes.get("2").put("Dragon", 1.0);
        pokemonTypes.get("2").put("Ice", 2.0);
        pokemonTypes.get("2").put("Steel", 1.0);
        pokemonTypes.get("2").put("Fairy", 1.0);
        pokemonTypes.get("2").put("Poison", 2.0);
        pokemonTypes.get("2").put("Phychic", 1.0);

        // Water Type
        pokemonTypes.put("3", new HashMap<>());
        pokemonTypes.get("3").put("Normal", 1.0);
        pokemonTypes.get("3").put("Grass", 2.0);
        pokemonTypes.get("3").put("Water", 0.5);
        pokemonTypes.get("3").put("Fire", 0.5);
        pokemonTypes.get("3").put("Electric", 2.0);
        pokemonTypes.get("3").put("Fighting", 1.0);
        pokemonTypes.get("3").put("Flying", 1.0);
        pokemonTypes.get("3").put("Ground", 1.0);
        pokemonTypes.get("3").put("Rock", 1.0);
        pokemonTypes.get("3").put("Dark", 1.0);
        pokemonTypes.get("3").put("Ghost", 1.0);
        pokemonTypes.get("3").put("Bug", 1.0);
        pokemonTypes.get("3").put("Dragon", 1.0);
        pokemonTypes.get("3").put("Ice", 0.5);
        pokemonTypes.get("3").put("Steel", 0.5);
        pokemonTypes.get("3").put("Fairy", 1.0);
        pokemonTypes.get("3").put("Poison", 1.0);
        pokemonTypes.get("3").put("Phychic", 1.0);

        // Fire Type
        pokemonTypes.put("4", new HashMap<>());
        pokemonTypes.get("4").put("Normal", 1.0);
        pokemonTypes.get("4").put("Grass", 0.5);
        pokemonTypes.get("4").put("Water", 2.0);
        pokemonTypes.get("4").put("Fire", 0.5);
        pokemonTypes.get("4").put("Electric", 1.0);
        pokemonTypes.get("4").put("Fighting", 1.0);
        pokemonTypes.get("4").put("Flying", 1.0);
        pokemonTypes.get("4").put("Ground", 2.0);
        pokemonTypes.get("4").put("Rock", 2.0);
        pokemonTypes.get("4").put("Dark", 1.0);
        pokemonTypes.get("4").put("Ghost", 1.0);
        pokemonTypes.get("4").put("Bug", 0.5);
        pokemonTypes.get("4").put("Dragon", 1.0);
        pokemonTypes.get("4").put("Ice", 0.5);
        pokemonTypes.get("4").put("Steel", 0.5);
        pokemonTypes.get("4").put("Fairy", 0.5);
        pokemonTypes.get("4").put("Poison", 1.0);
        pokemonTypes.get("4").put("Phychic", 1.0);

        // Electric Type
        pokemonTypes.put("5", new HashMap<>());
        pokemonTypes.get("5").put("Normal", 1.0);
        pokemonTypes.get("5").put("Grass", 1.0);
        pokemonTypes.get("5").put("Water", 1.0);
        pokemonTypes.get("5").put("Fire", 1.0);
        pokemonTypes.get("5").put("Electric", 0.5);
        pokemonTypes.get("5").put("Fighting", 1.0);
        pokemonTypes.get("5").put("Flying", 0.5);
        pokemonTypes.get("5").put("Ground", 2.0);
        pokemonTypes.get("5").put("Rock", 1.0);
        pokemonTypes.get("5").put("Dark", 1.0);
        pokemonTypes.get("5").put("Ghost", 1.0);
        pokemonTypes.get("5").put("Bug", 1.0);
        pokemonTypes.get("5").put("Dragon", 1.0);
        pokemonTypes.get("5").put("Ice", 1.0);
        pokemonTypes.get("5").put("Steel", 0.5);
        pokemonTypes.get("5").put("Fairy", 1.0);
        pokemonTypes.get("5").put("Poison", 1.0);
        pokemonTypes.get("5").put("Phychic", 1.0);

        // Fighting Type
        pokemonTypes.put("6", new HashMap<>());
        pokemonTypes.get("6").put("Normal", 1.0);
        pokemonTypes.get("6").put("Grass", 1.0);
        pokemonTypes.get("6").put("Water", 1.0);
        pokemonTypes.get("6").put("Fire", 1.0);
        pokemonTypes.get("6").put("Electric", 1.0);
        pokemonTypes.get("6").put("Fighting", 1.0);
        pokemonTypes.get("6").put("Flying", 2.0);
        pokemonTypes.get("6").put("Ground", 1.0);
        pokemonTypes.get("6").put("Rock", 0.5);
        pokemonTypes.get("6").put("Dark", 0.5);
        pokemonTypes.get("6").put("Ghost", 1.0);
        pokemonTypes.get("6").put("Bug", 0.5);
        pokemonTypes.get("6").put("Dragon", 1.0);
        pokemonTypes.get("6").put("Ice", 1.0);
        pokemonTypes.get("6").put("Steel", 1.0);
        pokemonTypes.get("6").put("Fairy", 1.0);
        pokemonTypes.get("6").put("Poison", 1.0);
        pokemonTypes.get("6").put("Phychic", 2.0);

        // Flying Type
        pokemonTypes.put("7", new HashMap<>());
        pokemonTypes.get("7").put("Normal", 1.0);
        pokemonTypes.get("7").put("Grass", 0.5);
        pokemonTypes.get("7").put("Water", 1.0);
        pokemonTypes.get("7").put("Fire", 1.0);
        pokemonTypes.get("7").put("Electric", 2.0);
        pokemonTypes.get("7").put("Fighting", 0.5);
        pokemonTypes.get("7").put("Flying", 1.0);
        pokemonTypes.get("7").put("Ground", 0.0);
        pokemonTypes.get("7").put("Rock", 2.0);
        pokemonTypes.get("7").put("Dark", 1.0);
        pokemonTypes.get("7").put("Ghost", 1.0);
        pokemonTypes.get("7").put("Bug", 0.5);
        pokemonTypes.get("7").put("Dragon", 1.0);
        pokemonTypes.get("7").put("Ice", 2.0);
        pokemonTypes.get("7").put("Steel", 1.0);
        pokemonTypes.get("7").put("Fairy", 1.0);
        pokemonTypes.get("7").put("Poison", 1.0);
        pokemonTypes.get("7").put("Phychic", 1.0);

        // Ground
        pokemonTypes.put("8", new HashMap<>());
        pokemonTypes.get("8").put("Normal", 1.0);
        pokemonTypes.get("8").put("Grass", 2.0);
        pokemonTypes.get("8").put("Water", 2.0);
        pokemonTypes.get("8").put("Fire", 1.0);
        pokemonTypes.get("8").put("Electric", 0.0);
        pokemonTypes.get("8").put("Fighting", 1.0);
        pokemonTypes.get("8").put("Flying", 1.0);
        pokemonTypes.get("8").put("Ground", 1.0);
        pokemonTypes.get("8").put("Rock", 0.5);
        pokemonTypes.get("8").put("Dark", 1.0);
        pokemonTypes.get("8").put("Ghost", 1.0);
        pokemonTypes.get("8").put("Bug", 1.0);
        pokemonTypes.get("8").put("Dragon", 1.0);
        pokemonTypes.get("8").put("Ice", 2.0);
        pokemonTypes.get("8").put("Steel", 1.0);
        pokemonTypes.get("8").put("Fairy", 1.0);
        pokemonTypes.get("8").put("Poison", 0.5);
        pokemonTypes.get("8").put("Phychic", 1.0);

        // Rock Type
        pokemonTypes.put("9", new HashMap<>());
        pokemonTypes.get("9").put("Normal", 0.5);
        pokemonTypes.get("9").put("Grass", 2.0);
        pokemonTypes.get("9").put("Water", 2.0);
        pokemonTypes.get("9").put("Fire", 0.5);
        pokemonTypes.get("9").put("Electric", 1.0);
        pokemonTypes.get("9").put("Fighting", 2.0);
        pokemonTypes.get("9").put("Flying", 0.5);
        pokemonTypes.get("9").put("Ground", 2.0);
        pokemonTypes.get("9").put("Rock", 1.0);
        pokemonTypes.get("9").put("Dark", 1.0);
        pokemonTypes.get("9").put("Ghost", 1.0);
        pokemonTypes.get("9").put("Bug", 1.0);
        pokemonTypes.get("9").put("Dragon", 1.0);
        pokemonTypes.get("9").put("Ice", 1.0);
        pokemonTypes.get("9").put("Steel", 2.0);
        pokemonTypes.get("9").put("Fairy", 1.0);
        pokemonTypes.get("9").put("Poison", 0.5);
        pokemonTypes.get("9").put("Phychic", 1.0);

        // Dark Type
        pokemonTypes.put("10", new HashMap<>());
        pokemonTypes.get("10").put("Normal", 1.0);
        pokemonTypes.get("10").put("Grass", 1.0);
        pokemonTypes.get("10").put("Water", 1.0);
        pokemonTypes.get("10").put("Fire", 1.0);
        pokemonTypes.get("10").put("Electric", 1.0);
        pokemonTypes.get("10").put("Fighting", 2.0);
        pokemonTypes.get("10").put("Flying", 1.0);
        pokemonTypes.get("10").put("Ground", 1.0);
        pokemonTypes.get("10").put("Rock", 1.0);
        pokemonTypes.get("10").put("Dark", 0.5);
        pokemonTypes.get("10").put("Ghost", 0.5);
        pokemonTypes.get("10").put("Bug", 2.0);
        pokemonTypes.get("10").put("Dragon", 1.0);
        pokemonTypes.get("10").put("Ice", 1.0);
        pokemonTypes.get("10").put("Steel", 1.0);
        pokemonTypes.get("10").put("Fairy", 2.0);
        pokemonTypes.get("10").put("Poison", 1.0);
        pokemonTypes.get("10").put("Phychic", 1.0);

        // Ghost Type
        pokemonTypes.put("11", new HashMap<>());
        pokemonTypes.get("11").put("Normal", 0.0);
        pokemonTypes.get("11").put("Grass", 1.0);
        pokemonTypes.get("11").put("Water", 1.0);
        pokemonTypes.get("11").put("Fire", 1.0);
        pokemonTypes.get("11").put("Electric", 1.0);
        pokemonTypes.get("11").put("Fighting", 0.0);
        pokemonTypes.get("11").put("Flying", 1.0);
        pokemonTypes.get("11").put("Ground", 1.0);
        pokemonTypes.get("11").put("Rock", 1.0);
        pokemonTypes.get("11").put("Dark", 2.0);
        pokemonTypes.get("11").put("Ghost", 2.0);
        pokemonTypes.get("11").put("Bug", 0.5);
        pokemonTypes.get("11").put("Dragon", 1.0);
        pokemonTypes.get("11").put("Ice", 1.0);
        pokemonTypes.get("11").put("Steel", 1.0);
        pokemonTypes.get("11").put("Fairy", 1.0);
        pokemonTypes.get("11").put("Poison", 0.5);
        pokemonTypes.get("11").put("Phychic", 1.0);

        // Bug Type
        pokemonTypes.put("12", new HashMap<>());
        pokemonTypes.get("12").put("Normal", 1.0);
        pokemonTypes.get("12").put("Grass", 0.5);
        pokemonTypes.get("12").put("Water", 1.0);
        pokemonTypes.get("12").put("Fire", 2.0);
        pokemonTypes.get("12").put("Electric", 1.0);
        pokemonTypes.get("12").put("Fighting", 0.5);
        pokemonTypes.get("12").put("Flying", 2.0);
        pokemonTypes.get("12").put("Ground", 0.5);
        pokemonTypes.get("12").put("Rock", 2.0);
        pokemonTypes.get("12").put("Dark", 1.0);
        pokemonTypes.get("12").put("Ghost", 1.0);
        pokemonTypes.get("12").put("Bug", 1.0);
        pokemonTypes.get("12").put("Dragon", 1.0);
        pokemonTypes.get("12").put("Ice", 1.0);
        pokemonTypes.get("12").put("Steel", 1.0);
        pokemonTypes.get("12").put("Fairy", 1.0);
        pokemonTypes.get("12").put("Poison", 1.0);
        pokemonTypes.get("12").put("Phychic", 1.0);

        // Dragon Type
        pokemonTypes.put("13", new HashMap<>());
        pokemonTypes.get("13").put("Normal", 1.0);
        pokemonTypes.get("13").put("Grass", 0.5);
        pokemonTypes.get("13").put("Water", 0.5);
        pokemonTypes.get("13").put("Fire", 0.5);
        pokemonTypes.get("13").put("Electric", 0.5);
        pokemonTypes.get("13").put("Fighting", 1.0);
        pokemonTypes.get("13").put("Flying", 1.0);
        pokemonTypes.get("13").put("Ground", 1.0);
        pokemonTypes.get("13").put("Rock", 1.0);
        pokemonTypes.get("13").put("Dark", 1.0);
        pokemonTypes.get("13").put("Ghost", 1.0);
        pokemonTypes.get("13").put("Bug", 1.0);
        pokemonTypes.get("13").put("Dragon", 2.0);
        pokemonTypes.get("13").put("Ice", 2.0);
        pokemonTypes.get("13").put("Steel", 1.0);
        pokemonTypes.get("13").put("Fairy", 2.0);
        pokemonTypes.get("13").put("Poison", 1.0);
        pokemonTypes.get("13").put("Phychic", 1.0);

        // Ice Type
        pokemonTypes.put("14", new HashMap<>());
        pokemonTypes.get("14").put("Normal", 1.0);
        pokemonTypes.get("14").put("Grass", 1.0);
        pokemonTypes.get("14").put("Water", 1.0);
        pokemonTypes.get("14").put("Fire", 2.0);
        pokemonTypes.get("14").put("Electric", 1.0);
        pokemonTypes.get("14").put("Fighting", 2.0);
        pokemonTypes.get("14").put("Flying", 1.0);
        pokemonTypes.get("14").put("Ground", 1.0);
        pokemonTypes.get("14").put("Rock", 2.0);
        pokemonTypes.get("14").put("Dark", 1.0);
        pokemonTypes.get("14").put("Ghost", 1.0);
        pokemonTypes.get("14").put("Bug", 1.0);
        pokemonTypes.get("14").put("Dragon", 1.0);
        pokemonTypes.get("14").put("Ice", 0.5);
        pokemonTypes.get("14").put("Steel", 2.0);
        pokemonTypes.get("14").put("Fairy", 1.0);
        pokemonTypes.get("14").put("Poison", 1.0);
        pokemonTypes.get("14").put("Phychic", 1.0);

        // Steel Type
        pokemonTypes.put("15", new HashMap<>());
        pokemonTypes.get("15").put("Normal", 0.5);
        pokemonTypes.get("15").put("Grass", 0.5);
        pokemonTypes.get("15").put("Water", 1.0);
        pokemonTypes.get("15").put("Fire", 2.0);
        pokemonTypes.get("15").put("Electric", 1.0);
        pokemonTypes.get("15").put("Fighting", 1.0);
        pokemonTypes.get("15").put("Flying", 0.5);
        pokemonTypes.get("15").put("Ground", 2.0);
        pokemonTypes.get("15").put("Rock", 0.5);
        pokemonTypes.get("15").put("Dark", 1.0);
        pokemonTypes.get("15").put("Ghost", 1.0);
        pokemonTypes.get("15").put("Bug", 0.5);
        pokemonTypes.get("15").put("Dragon", 0.5);
        pokemonTypes.get("15").put("Ice", 0.5);
        pokemonTypes.get("15").put("Steel", 0.5);
        pokemonTypes.get("15").put("Fairy", 0.5);
        pokemonTypes.get("15").put("Poison", 1.0);
        pokemonTypes.get("15").put("Phychic", 0.5);

        // Fairy Type
        pokemonTypes.put("16", new HashMap<>());
        pokemonTypes.get("16").put("Normal", 1.0);
        pokemonTypes.get("16").put("Grass", 1.0);
        pokemonTypes.get("16").put("Water", 1.0);
        pokemonTypes.get("16").put("Fire", 1.0);
        pokemonTypes.get("16").put("Electric", 1.0);
        pokemonTypes.get("16").put("Fighting", 0.5);
        pokemonTypes.get("16").put("Flying", 1.0);
        pokemonTypes.get("16").put("Ground", 1.0);
        pokemonTypes.get("16").put("Rock", 1.0);
        pokemonTypes.get("16").put("Dark", 0.5);
        pokemonTypes.get("16").put("Ghost", 1.0);
        pokemonTypes.get("16").put("Bug", 0.5);
        pokemonTypes.get("16").put("Dragon", 0.0);
        pokemonTypes.get("16").put("Ice", 1.0);
        pokemonTypes.get("16").put("Steel", 2.0);
        pokemonTypes.get("16").put("Fairy", 1.0);
        pokemonTypes.get("16").put("Poison", 2.0);
        pokemonTypes.get("16").put("Phychic", 1.0);

        // Poison Type
        pokemonTypes.put("17", new HashMap<>());
        pokemonTypes.get("17").put("Normal", 1.0);
        pokemonTypes.get("17").put("Grass", 0.5);
        pokemonTypes.get("17").put("Water", 1.0);
        pokemonTypes.get("17").put("Fire", 1.0);
        pokemonTypes.get("17").put("Electric", 1.0);
        pokemonTypes.get("17").put("Fighting", 0.5);
        pokemonTypes.get("17").put("Flying", 1.0);
        pokemonTypes.get("17").put("Ground", 2.0);
        pokemonTypes.get("17").put("Rock", 1.0);
        pokemonTypes.get("17").put("Dark", 1.0);
        pokemonTypes.get("17").put("Ghost", 1.0);
        pokemonTypes.get("17").put("Bug", 0.5);
        pokemonTypes.get("17").put("Dragon", 1.0);
        pokemonTypes.get("17").put("Ice", 1.0);
        pokemonTypes.get("17").put("Steel", 1.0);
        pokemonTypes.get("17").put("Fairy", 1.0);
        pokemonTypes.get("17").put("Poison", 0.5);
        pokemonTypes.get("17").put("Phychic", 2.0);

        // Phychic Type
        pokemonTypes.put("18", new HashMap<>());
        pokemonTypes.get("18").put("Normal", 1.0);
        pokemonTypes.get("18").put("Grass", 1.0);
        pokemonTypes.get("18").put("Water", 1.0);
        pokemonTypes.get("18").put("Fire", 1.0);
        pokemonTypes.get("18").put("Electric", 1.0);
        pokemonTypes.get("18").put("Fighting", 0.5);
        pokemonTypes.get("18").put("Flying", 1.0);
        pokemonTypes.get("18").put("Ground", 1.0);
        pokemonTypes.get("18").put("Rock", 1.0);
        pokemonTypes.get("18").put("Dark", 2.0);
        pokemonTypes.get("18").put("Ghost", 2.0);
        pokemonTypes.get("18").put("Bug", 2.0);
        pokemonTypes.get("18").put("Dragon", 1.0);
        pokemonTypes.get("18").put("Ice", 1.0);
        pokemonTypes.get("18").put("Steel", 1.0);
        pokemonTypes.get("18").put("Fairy", 1.0);
        pokemonTypes.get("18").put("Poison", 1.0);
        pokemonTypes.get("18").put("Phychic", 0.5);
    }

    public static Map<String, Double> weaknesses(String m, String n) {
        Map<String, Double> pokemons = pokemonTypes.get(m);
        Map<String, Double> pokemons2 = pokemonTypes.get(n);
        Map<String, Double> pokemons3 = new HashMap<>(pokemons);
        if (n.equals("0")) {
            return pokemons;
        } else {
            pokemons2.forEach((k, v) -> pokemons3.merge(k, v, (v1, v2) -> v1 * v2));
            return pokemons3;
        }
    }
}