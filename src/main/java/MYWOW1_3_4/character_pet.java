package MYWOW1_3_4;

public class character_pet {

    public static String convertToSql(TC335.character_pet oldpet) {
        String character_pet_sql = "INSERT INTO `character_pet` VALUES (";
        character_pet_sql += String.valueOf(oldpet.owner);
        character_pet_sql += ", ";
        character_pet_sql += String.valueOf(oldpet.id);
        character_pet_sql += ");";
        character_pet_sql += System.getProperty("line.separator");

        String pet_info_sql = "INSERT INTO `pet_info` VALUES (";
        pet_info_sql += String.valueOf(oldpet.id);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.owner);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.entry);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.modelid);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.createdbyspell);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.pettype);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.level);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.exp);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.reactstate);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.name);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.renamed);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.curhelth);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.curmana);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(oldpet.savetime);
        pet_info_sql += ", ";
        pet_info_sql += String.valueOf(0);
        pet_info_sql += ");";
        pet_info_sql += System.getProperty("line.separator");
//
//        String pet_aura_sql = "INSERT INTO `pet_aura` VALUES (";
//        pet_aura_sql += String.valueOf(oldpet.id);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet.slot);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(0);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet.id);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet.id);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet.id);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet.id);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(oldpet.id);
//        pet_aura_sql += ", ";
//        pet_aura_sql += String.valueOf(0);
//        pet_aura_sql += ");";
//        pet_aura_sql += System.getProperty("line.separator");
        return pet_info_sql+character_pet_sql;
    }
}
