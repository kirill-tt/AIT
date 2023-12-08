package practice;

import java.util.HashMap;
import java.util.Map;

//посчитать количество в нашей группе
public class MenAndWomen {
    public static void main(String[] args) {
        System.out.println( "Group list with gender (sex)" );

        Map<String, String> groupMapGender = new HashMap<>();
        groupMapGender.put( "Leonid", "male" );
        groupMapGender.put( "Anatoly", "male" );
        groupMapGender.put( "Alex", "male" );
        groupMapGender.put( "Sasha", "male" );
        groupMapGender.put( "Sergey1", "male" );
        groupMapGender.put( "Galina", "female" );
        groupMapGender.put( "Olesia", "female" );
        groupMapGender.put( "Sergey2", "male" );
        groupMapGender.put( "Irina", "female" );
        groupMapGender.put( "Kirill", "male" );
        groupMapGender.put( "Andreas", "male" );
        groupMapGender.put( "Ivan", "male" );
        groupMapGender.put( "Evgeniya", "female" );
        groupMapGender.put( "Elena", "female" );
        groupMapGender.put( "Vladislava", "female" );
        groupMapGender.put( "Tatyana", "female" );
        groupMapGender.put( "Lubov", "female" );
        groupMapGender.put( "Viktor", "male" );
        groupMapGender.put( "sergey3", "male" );
        groupMapGender.put( "Artem", "male" );
        groupMapGender.put( "karolina", "female" );
        groupMapGender.put( "Yaroslav", "male" );
        groupMapGender.put( "Kirill2", "male" );
        groupMapGender.put( "Anton", "male" );

        int women = 0;

        for (String name : groupMapGender.keySet()) {
            if (groupMapGender.get( name ).equals( "female" )) {
                women++;
            }

        }
        women = 0;

        for (String name : groupMapGender.values()) {
            if (name.equals( "female" )) {
                women++;
            }
        }
        System.out.println( "Women : " + women );

    }
}