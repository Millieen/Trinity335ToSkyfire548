package MYWOW1_3_4;

public class character_aura {
    public static character_aura convert(TC335.character_aura oldaccount) {
        character_aura newaura = new character_aura();
        newaura.guid = oldaccount.guid;
        newaura.caster_guid = oldaccount.casterguid;
        newaura.item_guid = oldaccount.itemguid;
        newaura.spell = oldaccount.spell;
        newaura.effect_mask = oldaccount.effectmask;
        newaura.recalculate_mask = oldaccount.recalculatemask;
        newaura.stackcount = oldaccount.stackcount;
        newaura.maxduration = oldaccount.maxduration;
        newaura.remaintime = oldaccount.remaintime;
        newaura.remaincharges = oldaccount.remaincharges;
        return newaura;
    }
    character_aura() {
        slot = 0;
    }

    int guid;
    int slot;
    int caster_guid;
    long item_guid;
    int spell;
    int effect_mask;
    int recalculate_mask;
    int stackcount;
    int maxduration;
    int remaintime;
    int remaincharges;

    public String to_sql() {
        String sql = "INSERT INTO `character_aura` VALUES (";
        sql += String.valueOf(guid);
        sql += ", ";
        sql += String.valueOf(slot);
        sql += ", ";
        sql += String.valueOf(caster_guid);
        sql += ", ";
        sql += String.valueOf(item_guid);
        sql += ", ";
        sql += String.valueOf(spell);
        sql += ", ";
        sql += String.valueOf(effect_mask);
        sql += ", ";
        sql += String.valueOf(recalculate_mask);
        sql += ", ";
        sql += String.valueOf(stackcount);
        sql += ", ";
        sql += String.valueOf(maxduration);
        sql += ", ";
        sql += String.valueOf(remaintime);
        sql += ", ";
        sql += String.valueOf(remaincharges);
        sql += ");";
        return sql;
    }
}
