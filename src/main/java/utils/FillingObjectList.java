package utils;

import objects.Animal;
import objects.Barrel;
import objects.Gender;
import objects.Human;

import java.util.ArrayList;
import java.util.List;

// Не стал доделывать до конца. Расставить индексы, как в indexModel
// в примере, который нашли в интернете
public class FillingObjectList {
    private final static int maxYear = 120;
    private final static int minYear = 0;
    private final static List<String> humanSurnameList = List.of(
            "Покровская", "Филиппова", "Леонов", "Кочетков",
            "Тарасова", "Козлов", "Соколова", "Лаптева", "Усов", "Никонов",
            "Трифонов", "Захаров", "Маркин", "Зорин", "Панфилов", "Сотников", "Жданов");
    private final static List<Gender> genderList = List.of(Gender.MAN, Gender.WOMAN);

    // как добавить объем
    private final static int maxVolume = 100;
    private final static int minVolume = 5;
    private final static List<List<String>> barrel_List_Stored = List.of(
            List.of("Water", "Plastic"),
            List.of("Soda", "Glass"),
            List.of("Coke", "Cardboard"),
            List.of("Syrup", "Paper"),
            List.of("Coconut milk", "Can")
    );
    // Определить нужно ли вообще делить таким образом листы
    private final static List<String> barrel_List_Material = List.of(
            "Plastic", "Glass", "Cardboard", "Paper", "Can");

    // как добавить булевую шерсть
    private final static List<String> animalList_Kind = List.of(
            "Fish", "Bird","Primates", "Reptiles","Amphibians");
    private final static List<String> animalList_EyeColor = List.of(
    "Black", "Orange", "Brown", "Yellow", "Blue");
    private final static List<Boolean> animalList_isHair = List.of(true, false);

    public List fillAnimalList(int count) {
        List animalList;
        if (count > 0) {
            animalList = new ArrayList<Animal>(count);
            String kind, yearColor;
            boolean isHair = true;

            for (int i = 0; i < count; i++) {
                kind = String.valueOf(generateRandomInRangeIncludeEnd(0, animalList_Kind.size()));
                yearColor = String.valueOf(generateRandomInRangeNotIncludeEnd(0, animalList_EyeColor.size()));
                indexRootVegetable = generateRandomInRangeNotIncludeEnd(0, animalList_isHair.size());

                animalList.add(new Animal().Builder()
                        .type(TYPE_ROOT_VEGETABLE_LIST.get(indexRootVegetable))
                        .weight(weight)
                        .color(COLOR_LIST.get(indexColor))
                        .build());
            }
        } else {
            animalList = new ArrayList<Animal>(0);
        }
        return animalList;
    }

    public List fillHumanList(int count) {
        List humanList;
        if (count > 0) {
            humanList = new ArrayList<Human>(count);
            int age, indexSurname;
            Gender gender;
            // как инициализировать

            for (int i = 0; i < count; i++) {
                age = generateRandomInRangeIncludeEnd(minYear, maxYear);
                // и добавить его вот здесь
                gender = generateRandomInRangeIncludeEnd(0, genderList.size());
                indexSurname = generateRandomInRangeNotIncludeEnd(0, humanSurnameList.size());
                humanSurnameList.add(new Human.Builder().
                        age(age).
                        gender(gender).
                        surname(humanSurnameList.get(indexSurname)).
                        build());
            }
        } else {
            humanList = new ArrayList<Human>(0);
        }
        return humanList;
    }
    public List fillBarrelList(int count) {
        List barrelList;
        if (count > 0) {
            barrelList = new ArrayList<Barrel>(count);
            String storedMaterial, barrelMaterial;
            int volume;

            for (int i = 0; i < count; i++) {;
                storedMaterial = String.valueOf(generateRandomInRangeNotIncludeEnd(0, barrelList.size()));
                barrelMaterial = String.valueOf(generateRandomInRangeNotIncludeEnd(0, barrel_List_Material.size()));
                volume = generateRandomInRangeIncludeEnd(minVolume, maxVolume);
                barrelList.add(new Barrel.Builder()
                        .storedMaterial(storedMaterial)
                        .barrelMaterial(barrelMaterial)
                        .volume(volume)
                        .build());
            }
        } else {
            barrelList = new ArrayList<Barrel>(0);
        }
        return barrelList;
    }

    private int generateRandomInRangeIncludeEnd(int start, int finish){
        return (int) (Math.random() * (finish - start + 1) + start);
    }

    private int generateRandomInRangeNotIncludeEnd(int start, int finish){
        return (int) (Math.random() * (finish - start) + start);
    }


}
